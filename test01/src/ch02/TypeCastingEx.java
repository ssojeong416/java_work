package ch02;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=3;
		int num=b;
		b=(byte)num;
//		묵시적 형변환 > int로 못들어가기때문에 바꿔주는 것
		
		int num1=(int)(num+3.5);
		System.out.println(num1);
//		원래 답은 6.5겠지만 소수점 아래는 버리기때문에 답이 6으로 나옴 
//		 int num1=num+3.5;  정수와 실수임 > 더블인 결과를 정수에 넣기때문에 오류가 나옴> 그래서 위와 같이 형변화해야함
	
		
		
	}

	

}
