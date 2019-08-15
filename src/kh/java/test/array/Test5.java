package kh.java.test.array;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 : ");
		String idNum = sc.next();
		
		//입력받은 주민등록번호를 배열로 저장
		char[] idNumArr = new char[idNum.length()];
		for(int i=0;i<idNum.length();i++) {
			idNumArr[i] = idNum.charAt(i);
		}
		
		//.clone 메소드 이용하여 배열 복사
//		char[] idNumArr_clone = idNumArr.clone();
		
		//System.arraycopy() 메소드 이용하여 배열 복사
		char[] idNumArr_clone = new char[idNum.length()];
		System.arraycopy(idNumArr, 0, idNumArr_clone, 0, idNumArr.length);
	
		//성별자리 이후 *로 가리기 : 9번째부터 14까지 * 처리
		for(int i=8;i<idNumArr_clone.length;i++) {
			idNumArr_clone[i] = '*';
		}
		System.out.println(idNumArr_clone);
	}
}
