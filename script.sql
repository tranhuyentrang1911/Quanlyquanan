USE [master]
GO
/****** Object:  Database [QUANLYQUANAN]    Script Date: 01/03/2022 09:03:18 ******/
CREATE DATABASE [QUANLYQUANAN] ON  PRIMARY 
( NAME = N'QUANLYQUANAN', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\QUANLYQUANAN.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QUANLYQUANAN_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\QUANLYQUANAN_log.LDF' , SIZE = 768KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QUANLYQUANAN] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QUANLYQUANAN].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QUANLYQUANAN] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET ANSI_NULLS OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET ANSI_PADDING OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET ARITHABORT OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET AUTO_CLOSE ON
GO
ALTER DATABASE [QUANLYQUANAN] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [QUANLYQUANAN] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [QUANLYQUANAN] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [QUANLYQUANAN] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET  ENABLE_BROKER
GO
ALTER DATABASE [QUANLYQUANAN] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [QUANLYQUANAN] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [QUANLYQUANAN] SET  READ_WRITE
GO
ALTER DATABASE [QUANLYQUANAN] SET RECOVERY SIMPLE
GO
ALTER DATABASE [QUANLYQUANAN] SET  MULTI_USER
GO
ALTER DATABASE [QUANLYQUANAN] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [QUANLYQUANAN] SET DB_CHAINING OFF
GO
USE [QUANLYQUANAN]
GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 01/03/2022 09:03:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NHANVIEN](
	[MaNV] [nchar](10) NOT NULL,
	[HoVaTen] [nvarchar](60) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Sdt] [nchar](11) NULL,
	[Email] [nchar](50) NULL,
	[ChucVu] [char](1) NULL,
	[GioiTinh] [char](1) NULL,
	[NgaySinh] [datetime] NULL,
	[NgayVaoLam] [datetime] NULL,
	[GhiChu] [nvarchar](100) NULL,
	[MatKhau] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[NHANVIEN] ([MaNV], [HoVaTen], [DiaChi], [Sdt], [Email], [ChucVu], [GioiTinh], [NgaySinh], [NgayVaoLam], [GhiChu], [MatKhau]) VALUES (N'01        ', N'Trần Huyền Trang', N'namdinh', N'123        ', N'1                                                 ', N'1', N'1', CAST(0x00008ED500000000 AS DateTime), CAST(0x00008ED500000000 AS DateTime), N'', N'123')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoVaTen], [DiaChi], [Sdt], [Email], [ChucVu], [GioiTinh], [NgaySinh], [NgayVaoLam], [GhiChu], [MatKhau]) VALUES (N'02        ', N'Phạm Thị Yến', N'namdinh', N'123        ', N'1                                                 ', N'3', N'1', CAST(0x00008EAC00000000 AS DateTime), CAST(0x00008EAC00000000 AS DateTime), N'', N'123')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoVaTen], [DiaChi], [Sdt], [Email], [ChucVu], [GioiTinh], [NgaySinh], [NgayVaoLam], [GhiChu], [MatKhau]) VALUES (N'03        ', N'Hoàng thêu', N'ninh bình', N'123        ', N'1                                                 ', N'2', N'0', CAST(0x00008EAC00000000 AS DateTime), CAST(0x00008EAC00000000 AS DateTime), N'', N'123')
/****** Object:  Table [dbo].[NHACUNGCAP]    Script Date: 01/03/2022 09:03:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHACUNGCAP](
	[MaNCC] [nchar](10) NOT NULL,
	[TenNCC] [nvarchar](60) NULL,
	[DiaChi] [nchar](10) NULL,
	[Sdt] [nchar](11) NULL,
	[Email] [nchar](40) NULL,
	[GhiChu] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNCC] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[NHACUNGCAP] ([MaNCC], [TenNCC], [DiaChi], [Sdt], [Email], [GhiChu]) VALUES (N'01        ', N'tran trung', N'ninh binh ', N'012345     ', N'trung@gmail.com                         ', N'')
INSERT [dbo].[NHACUNGCAP] ([MaNCC], [TenNCC], [DiaChi], [Sdt], [Email], [GhiChu]) VALUES (N'02        ', N'trai mai', N'ha noi    ', N'012345     ', N'mai@gmail.com                           ', N'')
INSERT [dbo].[NHACUNGCAP] ([MaNCC], [TenNCC], [DiaChi], [Sdt], [Email], [GhiChu]) VALUES (N'03        ', N'trai van trinh', N'ha noi    ', N'012345     ', N'mai@gmail.com                           ', N'')
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 01/03/2022 09:03:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING OFF
GO
CREATE TABLE [dbo].[KHACHHANG](
	[MaKH] [char](10) NOT NULL,
	[HoVaTen] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Sdt] [nchar](11) NULL,
	[Email] [nchar](50) NULL,
 CONSTRAINT [PK_KHACHHANG] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[KHACHHANG] ([MaKH], [HoVaTen], [DiaChi], [Sdt], [Email]) VALUES (N'01        ', N'Phạm Thị Yến', N'nam đinh', N'0123       ', N'yen@gmail.com                                     ')
INSERT [dbo].[KHACHHANG] ([MaKH], [HoVaTen], [DiaChi], [Sdt], [Email]) VALUES (N'02        ', N'Hoàng Thêu', N'ninh binh', N'012345     ', N'theu@gmail.com                                    ')
INSERT [dbo].[KHACHHANG] ([MaKH], [HoVaTen], [DiaChi], [Sdt], [Email]) VALUES (N'03        ', N'Trần Hà', N'namdinh', N'012345     ', N'tran@gamil.com                                    ')
/****** Object:  Table [dbo].[DANHMUC]    Script Date: 01/03/2022 09:03:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DANHMUC](
	[MaDM] [nchar](5) NOT NULL,
	[TenDM] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDM] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[DANHMUC] ([MaDM], [TenDM]) VALUES (N'DM01 ', N'gà rán')
INSERT [dbo].[DANHMUC] ([MaDM], [TenDM]) VALUES (N'DM02 ', N'nước uống')
INSERT [dbo].[DANHMUC] ([MaDM], [TenDM]) VALUES (N'DM03 ', N'mì')
INSERT [dbo].[DANHMUC] ([MaDM], [TenDM]) VALUES (N'DM04 ', N'topping')
/****** Object:  Table [dbo].[QUANLY]    Script Date: 01/03/2022 09:03:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING OFF
GO
CREATE TABLE [dbo].[QUANLY](
	[username] [varchar](10) NOT NULL,
	[pass] [varchar](10) NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[QUANLY] ([username], [pass]) VALUES (N'admin', N'123')
INSERT [dbo].[QUANLY] ([username], [pass]) VALUES (N'admin', N'123')
/****** Object:  Table [dbo].[NHAPHANG]    Script Date: 01/03/2022 09:03:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHAPHANG](
	[MaNH] [nchar](5) NOT NULL,
	[MaNCC] [nchar](10) NOT NULL,
	[ngayLap] [datetime] NOT NULL,
	[TongTien] [int] NULL,
 CONSTRAINT [PK__NHAPHANG__2725D7386D0D32F4] PRIMARY KEY CLUSTERED 
(
	[MaNH] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[NHAPHANG] ([MaNH], [MaNCC], [ngayLap], [TongTien]) VALUES (N'01   ', N'01        ', CAST(0x0000ADC400000000 AS DateTime), 35000)
INSERT [dbo].[NHAPHANG] ([MaNH], [MaNCC], [ngayLap], [TongTien]) VALUES (N'02   ', N'02        ', CAST(0x0000ADD100000000 AS DateTime), 450000)
INSERT [dbo].[NHAPHANG] ([MaNH], [MaNCC], [ngayLap], [TongTien]) VALUES (N'03   ', N'02        ', CAST(0x0000AE0F00000000 AS DateTime), 500000)
/****** Object:  Table [dbo].[tbHOADON]    Script Date: 01/03/2022 09:03:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbHOADON](
	[MaHD] [int] NOT NULL,
	[MaNV] [nchar](10) NOT NULL,
	[ngayLap] [date] NULL,
	[tongTien] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[tbHOADON] ([MaHD], [MaNV], [ngayLap], [tongTien]) VALUES (1, N'01        ', CAST(0x4D430B00 AS Date), 40000)
INSERT [dbo].[tbHOADON] ([MaHD], [MaNV], [ngayLap], [tongTien]) VALUES (2, N'01        ', CAST(0x57430B00 AS Date), 45000)
INSERT [dbo].[tbHOADON] ([MaHD], [MaNV], [ngayLap], [tongTien]) VALUES (3, N'01        ', CAST(0x69430B00 AS Date), 30000)
INSERT [dbo].[tbHOADON] ([MaHD], [MaNV], [ngayLap], [tongTien]) VALUES (4, N'01        ', CAST(0x4D430B00 AS Date), 90000)
INSERT [dbo].[tbHOADON] ([MaHD], [MaNV], [ngayLap], [tongTien]) VALUES (5, N'02        ', CAST(0x6C430B00 AS Date), 30000)
INSERT [dbo].[tbHOADON] ([MaHD], [MaNV], [ngayLap], [tongTien]) VALUES (6, N'02        ', CAST(0x6C430B00 AS Date), 70000)
INSERT [dbo].[tbHOADON] ([MaHD], [MaNV], [ngayLap], [tongTien]) VALUES (7, N'01        ', CAST(0x6C430B00 AS Date), 120000)
INSERT [dbo].[tbHOADON] ([MaHD], [MaNV], [ngayLap], [tongTien]) VALUES (8, N'03        ', CAST(0x6D430B00 AS Date), 90000)
/****** Object:  Table [dbo].[SANPHAM]    Script Date: 01/03/2022 09:03:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SANPHAM](
	[MaSP] [nchar](5) NOT NULL,
	[MaDM] [nchar](5) NOT NULL,
	[TenSP] [nvarchar](100) NULL,
	[Gia] [decimal](18, 0) NULL,
	[DuongDanAnh] [varchar](100) NULL,
	[MoTa] [ntext] NULL,
	[NoiBat] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[SANPHAM] ([MaSP], [MaDM], [TenSP], [Gia], [DuongDanAnh], [MoTa], [NoiBat]) VALUES (N'sp01 ', N'DM02 ', N'trà sữa', CAST(15000 AS Decimal(18, 0)), N'C:\Users\Admin\Documents\NetBeansProjects\Quanlyquanan\sanphamimg\trasua.jpg', N'', 0)
INSERT [dbo].[SANPHAM] ([MaSP], [MaDM], [TenSP], [Gia], [DuongDanAnh], [MoTa], [NoiBat]) VALUES (N'sp02 ', N'DM03 ', N'mì udon', CAST(30000 AS Decimal(18, 0)), N'C:\Users\Admin\Documents\NetBeansProjects\Quanlyquanan\sanphamimg\udon.jpg', N'', 0)
INSERT [dbo].[SANPHAM] ([MaSP], [MaDM], [TenSP], [Gia], [DuongDanAnh], [MoTa], [NoiBat]) VALUES (N'sp03 ', N'DM01 ', N'cánh gà rán', CAST(30000 AS Decimal(18, 0)), N'C:\Users\Admin\Documents\NetBeansProjects\Quanlyquanan\sanphamimg\canhga.jpg', N'', 0)
INSERT [dbo].[SANPHAM] ([MaSP], [MaDM], [TenSP], [Gia], [DuongDanAnh], [MoTa], [NoiBat]) VALUES (N'sp04 ', N'DM04 ', N'xúc xích cp', CAST(10000 AS Decimal(18, 0)), N'C:\Users\Admin\Documents\NetBeansProjects\Quanlyquanan\sanphamimg\xx.png', N'', 0)
INSERT [dbo].[SANPHAM] ([MaSP], [MaDM], [TenSP], [Gia], [DuongDanAnh], [MoTa], [NoiBat]) VALUES (N'sp05 ', N'DM01 ', N'đùi gà rán', CAST(30000 AS Decimal(18, 0)), N'C:\Users\Admin\Documents\NetBeansProjects\Quanlyquanan\sanphamimg\duiga.jpg', N'kèm tương ớt,sốt majone', 0)
INSERT [dbo].[SANPHAM] ([MaSP], [MaDM], [TenSP], [Gia], [DuongDanAnh], [MoTa], [NoiBat]) VALUES (N'sp06 ', N'DM04 ', N'khoai tây chiên', CAST(20000 AS Decimal(18, 0)), N'C:\Users\Admin\Documents\NetBeansProjects\Quanlyquanan\sanphamimg\khoaitay.jpg', N'kèm tương ớt,sốt majone', 0)
INSERT [dbo].[SANPHAM] ([MaSP], [MaDM], [TenSP], [Gia], [DuongDanAnh], [MoTa], [NoiBat]) VALUES (N'sp07 ', N'DM02 ', N'trà chanh', CAST(15000 AS Decimal(18, 0)), N'C:\Users\Admin\Documents\NetBeansProjects\Quanlyquanan\sanphamimg\tra-chanh.jpg', N'', 0)
INSERT [dbo].[SANPHAM] ([MaSP], [MaDM], [TenSP], [Gia], [DuongDanAnh], [MoTa], [NoiBat]) VALUES (N'sp08 ', N'DM04 ', N'bánh gà', CAST(5000 AS Decimal(18, 0)), N'C:\Users\Admin\Documents\NetBeansProjects\Quanlyquanan\sanphamimg\bánh gà.jpg', N'kèm tương ớt', 0)
INSERT [dbo].[SANPHAM] ([MaSP], [MaDM], [TenSP], [Gia], [DuongDanAnh], [MoTa], [NoiBat]) VALUES (N'sp09 ', N'DM03 ', N'mì hản sản', CAST(35000 AS Decimal(18, 0)), N'C:\Users\Admin\Downloads\img\mi-cay.jpg', N'kèm rau thơm', 0)
/****** Object:  Table [dbo].[CHITIETHOADON]    Script Date: 01/03/2022 09:03:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CHITIETHOADON](
	[Ma] [int] NOT NULL,
	[MaHD] [int] NOT NULL,
	[MaSP] [nchar](5) NOT NULL,
	[SoLuong] [int] NULL,
	[ThanhTien] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (1, 1, N'sp06 ', 1, 20000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (2, 1, N'sp04 ', 2, 20000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (3, 2, N'sp05 ', 1, 30000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (4, 2, N'sp01 ', 1, 15000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (5, 3, N'sp05 ', 1, 30000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (6, 4, N'sp05 ', 3, 90000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (7, 5, N'sp04 ', 2, 20000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (8, 5, N'sp08 ', 2, 10000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (9, 6, N'sp06 ', 2, 40000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (10, 6, N'sp04 ', 3, 30000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (11, 7, N'sp05 ', 2, 60000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (12, 7, N'sp03 ', 2, 60000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (13, 8, N'sp05 ', 2, 60000)
INSERT [dbo].[CHITIETHOADON] ([Ma], [MaHD], [MaSP], [SoLuong], [ThanhTien]) VALUES (14, 8, N'sp07 ', 2, 30000)
/****** Object:  ForeignKey [PK_NH_NCC]    Script Date: 01/03/2022 09:03:19 ******/
ALTER TABLE [dbo].[NHAPHANG]  WITH CHECK ADD  CONSTRAINT [PK_NH_NCC] FOREIGN KEY([MaNCC])
REFERENCES [dbo].[NHACUNGCAP] ([MaNCC])
GO
ALTER TABLE [dbo].[NHAPHANG] CHECK CONSTRAINT [PK_NH_NCC]
GO
/****** Object:  ForeignKey [PK_HD_NV]    Script Date: 01/03/2022 09:03:19 ******/
ALTER TABLE [dbo].[tbHOADON]  WITH CHECK ADD  CONSTRAINT [PK_HD_NV] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NHANVIEN] ([MaNV])
GO
ALTER TABLE [dbo].[tbHOADON] CHECK CONSTRAINT [PK_HD_NV]
GO
/****** Object:  ForeignKey [PK_SP_DM]    Script Date: 01/03/2022 09:03:19 ******/
ALTER TABLE [dbo].[SANPHAM]  WITH CHECK ADD  CONSTRAINT [PK_SP_DM] FOREIGN KEY([MaDM])
REFERENCES [dbo].[DANHMUC] ([MaDM])
GO
ALTER TABLE [dbo].[SANPHAM] CHECK CONSTRAINT [PK_SP_DM]
GO
/****** Object:  ForeignKey [PK_HD_CT]    Script Date: 01/03/2022 09:03:19 ******/
ALTER TABLE [dbo].[CHITIETHOADON]  WITH CHECK ADD  CONSTRAINT [PK_HD_CT] FOREIGN KEY([MaHD])
REFERENCES [dbo].[tbHOADON] ([MaHD])
GO
ALTER TABLE [dbo].[CHITIETHOADON] CHECK CONSTRAINT [PK_HD_CT]
GO
/****** Object:  ForeignKey [PK_SP_CT]    Script Date: 01/03/2022 09:03:19 ******/
ALTER TABLE [dbo].[CHITIETHOADON]  WITH CHECK ADD  CONSTRAINT [PK_SP_CT] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SANPHAM] ([MaSP])
GO
ALTER TABLE [dbo].[CHITIETHOADON] CHECK CONSTRAINT [PK_SP_CT]
GO
