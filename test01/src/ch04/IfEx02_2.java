package ch04;

import java.util.Scanner;

public class IfEx02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("점수 2개를 입력하세요");
//		
//		int score1=sc.nextInt();
//		int score2=sc.nextInt();
//	
//       if (score1>=80 && score2>=80) {
//    	   System.out.println("합격");
//       }  
//       else {
//    	   System.out.println("불합격");
//       }
//	}


//		Scanner sc=new Scanner(System.in);
//		System.out.println("점수 2개를 입력하세요");
//		
//		int score1=sc.nextInt();
//		int score2=sc.nextInt();
//		
//		
//		int avg=(score1+score2)/2;
//		System.out.println("평균:"+avg);
//		if (avg>=70 && score1>=60 && score2>=60) {
//			System.out.println("합격");
//			if(avg>=90)
//				System.out.println("1등급");
//			else if(avg>=80)
//				System.out.println("2등급");
//			else if(avg>=70)
//				System.out.println("3등급");
//			
//		}else {
//			System.out.println("불합격");
//		}
//		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("숫자 3개를 입력하세요");
//		
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		int n3=sc.nextInt();
//		
//		if(n1>n2) {
//			if(n1>n3) {
//				System.out.println("가장 큰 수는"+n1+"입니다");
//			}else {
//				System.out.println("가장 큰 수는"+n3+"입니다");
//			}
//		
//		}else {
//			if(n2>n3) {
//				System.out.println("가장 큰 수는"+n2+"입니다");
//			}else {
//				System.out.println("가장 큰 수는"+n3+"입니다");
//			}
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("음료수의 종류와 잔수를 입력하세요");
//		
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int charge=0;
//		
//		
//		if(num1==1) {
//			charge=2000*num2;
//			System.out.println("에스프레소"+charge+"원 입니다");			
//		}else if(num1==2) {
//			charge=2500*num2;
//			System.out.println("아메리카노"+charge+"원 입니다");
//		}else if(num1==3) {
//			charge=3000*num2;
//			System.out.println("카푸치노"+charge+"원 입니다");
//		}else if(num1==4) {
//			charge=3500*num2;
//			System.out.println("카페라떼"+charge+"원 입니다");
//		}else {
//			System.out.println("입력오류! 다시 입력해주세요");
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("해당 월을 입력해주세요");
		
		int num1=sc.nextInt();
		
		if(num1==3 || num1==4 || num1==5) {
			System.out.println("봄"); 
			} else if(num1==6 || num1==7 || num1==8) {
				System.out.println("여름");
			} else if(num1==9 || num1==10 || num1==11) {
				System.out.println("가을");
	  	} else if(num1==12 || num1==1 || num1==2) {
	  		System.out.println("겨울");
	  	}
		
	  	else {
	  		System.out.println("다시 입력해주세요");
	  	}
		
			

		
				
		
		
		
		
		
	}
}

		
		

