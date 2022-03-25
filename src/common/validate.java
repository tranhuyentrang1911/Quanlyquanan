package common;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Locale;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.log4j.MDC;


public class validate {
   
	  public static  java.sql.Date chuyenkieudate_sqldate(String ngays){
	        java.sql.Date p = null;
	     SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yy");
	        try {
	            Date d=new Date(sd.parse(ngays).getTime());     
	        p = new java.sql.Date(d.getTime());
	        } catch (ParseException ex) {   
	        } catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return p;
	    }
	  
	  public static String chuyenGioiTinh(String gt){
		  if(gt.equals("1")){ gt="Nam" ;}
		  else{  gt="Nu";}
		  return gt;
		 }
	  public static boolean notVaild(String s){
			if(s==null || s.length()==0) return true;
			return false;
		}
          
       
	  
	  public static  String chuyenkieu_Date_to_String(String date){
	        String rs="";
	    SimpleDateFormat sd=new SimpleDateFormat("yyy-MM-dd");
	      SimpleDateFormat sdd=new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
	       SimpleDateFormat result= new SimpleDateFormat("dd/MM/yyyy");
	        try {            
	            Date d=new Date(sd.parse(date).getTime());     
	            String b=new java.util.Date(d.getTime()).toString();                 
	           rs =result.format(sdd.parse(b));
	           return rs;       
	        }  catch (java.text.ParseException e) {
				
				e.printStackTrace();
			}
                 catch (Exception e) {
			
				e.printStackTrace();
			}
	        return rs;
	   }
	  public static java.sql.Time chuyenkieuTime(String Gio) throws ParseException{
		    java.sql.Time gio = null;
		     SimpleDateFormat tg=new SimpleDateFormat("hh:mm:ss");
		        try {
		            Time d=new Time(tg.parse(Gio).getTime());     
		        gio = new java.sql.Time(d.getTime());
		        } catch (java.text.ParseException e) {
					
					e.printStackTrace();
				}
		       return gio;
		    }
        
          
          public static  boolean checkdate(String date) {
              try {
                  java.sql.Date p = null;
                  SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yy");
                  Date d=new Date(sd.parse(date).getTime());
                  return true;
              } catch (java.text.ParseException ex) {
               return false;
              }
          }
          
                 public static  boolean checkINT(String so) {
                     try{
                            Integer.parseInt(so);
                            return true;
                     }catch(Exception e){
                     return false;
                     }
          }
          public static  boolean checkDOUBLE(String so) {
                     try{
                            Double.parseDouble(so);
                            return true;
                     }catch(Exception e){
                     return false;
                     }
          }
}
