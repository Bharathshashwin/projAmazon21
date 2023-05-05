package org.com;

public class StringDay5Task {
	public static void main(String[] args) {
                  //01234567890
		String s = "GreensTechnology";
		          //01234567
		String s1= "Greens technology";
		//subString-startIndex-----get the sub string from given index
		String ss=s.substring(6);
		System.out.println(ss);
		
		//subString-startandEnd
		String s2 = s.substring(6, 10);
		System.out.println(s2);
		
		//replace
		String r=s.replace('e', '3');
		System.out.println(r);
		
		String r1=s.replace("Greens", "Whites");
		System.out.println(r1);
		
		String r2=s.replaceAll("Greens", "Blacks ");
		System.out.println(r2);
		
		//equals-check two string equals or not
		boolean e1 = s.equals(s1);
		System.out.println("string equals or not :"+e1);
		
		//equalsIgnoreCase-check two string equals or not(not case sensitive)
		boolean e2 = s.equalsIgnoreCase(s1);
		System.out.println("equalsIgnoreCase :"+e2);
		
		//compareTo--based on ASCII value
		int compareTo = s.compareTo(s1);//6--- T
		System.out.println(compareTo); // 6--- Space  so (T-Space)=84-32==>52
		
		//trim-remove the space b4 and after
		//String trim = s.trim();
		//System.out.println(trim);
		
		
	}

}
