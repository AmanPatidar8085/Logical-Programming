package org.jsp;

public class DecimalToOctal {
 public static void main(String [] args) {
	 int dec=33;
	 System.out.println(isDecToOct(dec));
 }
 static String isDecToOct(int dec) {
	 String oct="";
	 while(dec>0) {
		 int digit=dec%8;
		 oct=digit+oct;
		 dec=dec/8;
	 }
	 return oct;
 }
}
