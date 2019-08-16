package kh.java.test.array;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	
	public void test() {
		//case 1
		String[] fruit = new String[5];
		fruit[0]="딸기";
		fruit[1]="복숭아";
		fruit[2]="키위";
		fruit[3]="사과";
		fruit[4]="바나나";
		
		//case 2
//		String[] fruit = {"딸기", "복숭아", "키위" , "사과", "바나나"};
		
		System.out.println(fruit[4]);
		
	}
}
