package ch02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("영문 소문자를 입력하세요");
		String s=sc.next();
		char ch=s.charAt(0);
//		charAt> 배열중에서 몇번째 문자를 가져올것인지 
		
		System.out.println((char)(ch-32));
//		대문자 65 , 소문자 97 / ch였으면 32만 빼주면 되는거임 
		
		
		
		

	}
	

	
}
