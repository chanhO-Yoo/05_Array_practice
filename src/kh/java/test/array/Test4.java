package kh.java.test.array;

import java.util.Scanner;

public class Test4 {
		
	public static void main(String[] args) {
		Test4 t4 = new Test4();
//		t4.test1();
		t4.test2();
		
	}
	
	//전화번호를 입력받아 13자리의 문자형 배열로 저장
	//가운데 4자리를 *로 가리기
	//단, 원본 배열값은 변경없이 배열 복사본으로 변경하세요
	public void test1() {
		Scanner sc = new Scanner(System.in);
		//전화번호 입력받기
		System.out.print("전화번호를 입력하세요(13자리) : ");
		String phoneNum = sc.next();
		
		//문자열을 배열로 옮기기
		char[] phoneNumArr = new char[phoneNum.length()];
		for(int i=0;i<=phoneNum.length();i++) {
			phoneNumArr[i] = phoneNum.charAt(i);
		}

		//만들어진 배열을 복사(.clone()메서드 이용)
		char[] phoneNumArr2 = phoneNumArr.clone();
		
		//만들어진 배열을 복사(System.arraycopy() 메소드 이용)
		
		
		//복사본의 가운데 4자리(4,5,6,7번)을 *로 변경
		for(int i=4;i<=7;i++) {
			phoneNumArr2[i] = '*'; 
		}
		
		System.out.println(phoneNumArr2);
	}
	
	//전화번호를 입력받아 문자열로 저장
	//가운데 4자리를 *로 가리기
	//단, 문자열을 복사해서 사용하세요
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요(13자리) : ");
		String phoneNum = sc.next();
		
		//문자열(전화번호)복사본 생성
		String phoneNum2;

		//복사본의 가운데 4자리 변경
		//case1 : 가운데 4자리 제외 나머지 출력후 4자리 *출력
		//String java.lang.String.substring(int beginIndex, int endIndex)
//		phoneNum2 = phoneNum.substring(0,3) + "****" + phoneNum.substring(8,12);
		phoneNum2 = phoneNum.substring(0,4) + "****" + phoneNum.substring(8,13);
//		System.out.println(phoneNum2.charAt(13));
		//case2 : 가운데 4자리 replace사용
//		phoneNum2 =phoneNum.replace(phoneNum.substring(4,8), "****");
		
		System.out.println(phoneNum2);
	}
}
