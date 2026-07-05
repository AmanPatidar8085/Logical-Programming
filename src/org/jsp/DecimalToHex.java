package org.jsp;

public class DecimalToHex {
 public static void main(String [] args) {
	 int dec=254;
	System.out.println (isDecTOHex(dec));
 }
 static String isDecTOHex(int dec)
 {
	 String hex="";
	 while(dec>0) {
		 int digit=dec%16;
		 if(digit>9) {
			 hex=(char)(digit+55)+hex;
		 }
		 else {
			 hex=digit+hex;
		 }
		 dec=dec/16;
	 }
	 return hex;
 }
}
