package org.jsp;

public class DecimalToBinary {
 public static void main(String [] args) {
	 int dec=172;
	 System.out.println(isDecToBin(dec));
 }
 static String isDecToBin(int dec) {
	 String bin="";
	 while(dec>0) {
		 int digit=dec%2;
		 bin=digit+bin;
		 dec=dec/2;
	 }
	 return bin;
 }
}
