package ch03;

import java.util.Scanner;

public class OpEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요");
		int score1=sc.nextInt();
		int score2=sc.nextInt();
		
		System.out.println(score1>=70 && score2>=70);
		System.out.println(score1>=70 || score2>=70);
//		 || > 둘중 하나만 true이면 true라는 의미 
		System.out.println(!(score1>70 && score2>=70));
//		! 넣으면 false > true , true > false로 나옴 ((반대)) 
		System.out.println(!(score1>=70 || score2>=70));
		
		
		
	}

}
