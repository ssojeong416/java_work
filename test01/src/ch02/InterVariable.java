package ch02;

public class InterVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = -128;
		short s = 12;
	
		long l = 10L;

		char c1 = 'A';
		char c2 = 'a';
		char c3 = '가';
		int num1 = c1;
		int num2 = c2;
		int num3 = c3;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

//		문자는 숫자코드를 다 가지고 있기때문에 문자가 숫자로 실행될 수 있음

		char ch1 = 'A';

		System.out.println(ch1);
		System.out.println((int) ch1);

		char ch2 = 66;
		System.out.println(ch2);

		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char) ch3);
		
		
		double dnum =3.14;
		float fnum =3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		
		double dnum1=1;
		for (int i = 0; i < 10000; i++) { dnum1 = dnum1 + 0.1;}
		System.out.println(dnum1);
		
		boolean ismarried=true;
		System.out.println(ismarried);
		
		
	}
	
}
