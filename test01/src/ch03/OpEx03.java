package ch03;

import java.util.Scanner;

public class OpEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=2;
    	int num2=-8;
		
		int a=5;
		int b=4;
		
		
		
		num<<=2;
		System.out.println(num);
		num>>=2;
		System.out.println(num);
		num2>>=2;
		System.out.println(num2);
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요");
		int score1=sc.nextInt();
		int score2=sc.nextInt();
		
	
		
		String result;
		result =((score1+score2)/2>=70)?"합격":"불합격";
		System.out.println(result);
		
		
		
		

	}

}
