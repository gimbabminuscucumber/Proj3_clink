package path;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import business.bmember.Bmember_DTO;
import business.createo_mng.CreateO_Mng_DTO;
import member.member.Member_DTO;


public class Encry {

   public static String getSalt() {
      SecureRandom random = new SecureRandom();
      byte[] salt = new byte[20];
      random.nextBytes(salt);
      StringBuffer sb = new StringBuffer();
      for(byte b : salt) {
         sb.append(String.format("%02x", b));
      }
      return sb.toString();
   }
   
   public static String encry(String password, String salt) {
      String result = null;
      
      try {
         MessageDigest md = MessageDigest.getInstance("SHA-256");
         md.update((password+salt).getBytes());
         byte[] pwSalt = md.digest();
         StringBuffer sb = new StringBuffer();
         for(byte b : pwSalt) {
            sb.append(String.format("%02x", b));
         }
         result = sb.toString();
      }catch (NoSuchAlgorithmException e) {
         e.printStackTrace();
      }
      
      return result;
   }
   
   
   public static String getUUID(String type) {
	   return type+"-"+UUID.randomUUID().toString();
   }
   
   
   public static Date getSQLDate(String date) {
	   SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
	   
	   java.util.Date sd = null;
	try {
		sd = spd.parse(date);
	} catch (ParseException e) {
	} 
	long d = sd.getTime();
	Date sqlD = new Date(d);
	return sqlD;
   }
   
   public static boolean whatDTO(HttpSession session) {
	   String to = session.getAttribute("login").toString();
	   int start =  to.indexOf(".");
	   to = to.substring(0,start);
	   return to.equals("Bmember");
   }
   
   public static String getBmember_id(HttpSession session) {
	   return (session.getAttribute("t") == "b" ? ((Bmember_DTO)session.getAttribute("login")).getBmember_id() :((CreateO_Mng_DTO)session.getAttribute("login")).getBmember_id());
   }
   
   public static String getUsrId(HttpSession session) {
	   String type = (String)session.getAttribute("t");
	   String usr_id = null;
	   switch (type) {
	   		case "m":
	   			usr_id = ((Member_DTO)session.getAttribute("login")).getMember_id();
	   			break;
	   		case "b":
	   			usr_id = ((Bmember_DTO)session.getAttribute("login")).getBmember_id();	   			
	   			break;
	   		case "c":
	   			usr_id = ((CreateO_Mng_DTO)session.getAttribute("login")).getBmember_id();
	   			break;
	  }
	   return usr_id;
   }
 
   public static String getChatUsrId(Map<String,Object> map) {
	   String type = (String)map.get("t");
	   String usr_id = null;
	   switch (type) {
	   case "m":
		   usr_id = ((Member_DTO)map.get("login")).getMember_id();
		   break;
	   case "b":
		   usr_id = ((Bmember_DTO)map.get("login")).getBmember_id();	   			
		   break;
	   case "c":
		   usr_id = ((CreateO_Mng_DTO)map.get("login")).getBmember_id();
		   break;
	   }
	   return usr_id;
   }
   

   
   
   
   
}