package org.com;

public class StringL {
public static void main(String[] args) {
	
	String s= "j a v a p r o g r a m";
	
	//length
	int l=s.length();
	System.out.println(l);
	
	//charAt
	char c=s.charAt(12);
	System.out.println(c);
	
	//first index
	int i = s.indexOf("a");
	System.out.println(i);
	
	//last index of
	int lastIndexOf = s.lastIndexOf("a");
	System.out.println(lastIndexOf);
	
	//isEmpty
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	if (empty) {
		System.out.println("string is Empty");
		
	} else {
		System.out.println("string is not Empty");
	}
	//contains-check the value in string present or not
	boolean contains = s.contains("gram");
	System.out.println(contains);
	
	//toUpperCase
	String uc = s.toUpperCase();
	System.out.println(uc);
	//toLowerCase
	String lc = s.toLowerCase();
	System.out.println(lc);
	
	//startsWith-check sW given value or not
	boolean sw = s.startsWith("Java");
	System.out.println(sw);
	
	//endsWith-check eW given value or not
	boolean ew = s.endsWith("fytghgjhj");
	System.out.println(ew);
	
}
}
