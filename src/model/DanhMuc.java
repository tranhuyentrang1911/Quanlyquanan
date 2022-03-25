

package model;


public class DanhMuc {
    private String maDM,tenDM;

    public DanhMuc() {
    }

    @Override
    public String toString() {
        return  maDM +"-"+tenDM;
    }

    public DanhMuc(String maDM) {
        this.maDM = maDM;
    }

    public DanhMuc(String maDM, String tenDM) {
        this.maDM = maDM;
        this.tenDM = tenDM;
    }

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }
    
}
