package kh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Test6 t6 = new Test6();
		t6.test();
		
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int arrLength = sc.nextInt();
		int[] arrInt = new int[arrLength];
		int subInt = 1;
		
		for(int i=0;i<=arrInt.length-1;i++) {
			if(i <= arrInt.length/2) {
				arrInt[i]=i+1;
			}
			else {
				arrInt[i]=i-subInt;
				subInt=subInt+2;
			}
		}
		
		System.out.println(Arrays.toString(arrInt));
	}
}
