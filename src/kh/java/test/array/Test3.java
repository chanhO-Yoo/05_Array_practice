package kh.java.test.array;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String inputStr = sc.next();
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		//문자열에서 같은 문자를 찾은 횟수를 넣을 변수
		int count=0;
		
		//문자열을 배열에 한글자씩 넣는다.
		char[] changeStringToChar = new char[inputStr.length()];
		
		for(int i=0;i<inputStr.length();i++) {
			changeStringToChar[i] = inputStr.charAt(i);
		}
		
		//입력받은 문자가 배열에 있는 문자들과 비교한다.
		for(int i=0;i<changeStringToChar.length;i++) {
			if(inputChar == changeStringToChar[i]) {
				count++;
			}
		}
		System.out.println("입력값 : "+inputStr);
		System.out.println("검색값 : "+inputChar);
		System.out.println("출력 : 입력하신 문자열 "+inputStr+"에서 찾으시는 문자 "+inputChar+"는(은) "+count+"개입니다.");
	}
}
