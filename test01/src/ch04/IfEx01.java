package ch04;

public class IfEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=60;
		if(score>70) {
		 System.out.println(score);
			System.out.println("합격"); 
		} else {
			System.out.println("불합격");
			System.out.println("다시 도전하세요");
		}
		
        System.out.println("if문 벗어남");
	}

}
