package com.greedy.section06.ternary_operator;

public class Application1 {

	public static void main(String[] args) {
		/* 삼항 연산자 
		 * 자바에서 유일하게 피연산자 항목이 3개인 연산자
		 * 항목이 3개 : (조건식)? 참일때 사용할 값(식)1 : 거짓일때 사용할 값(식)2
		 */
		
		int num1 =10;
		int num2 = -10;
		
		// num1이 0보다 크면 양수, 아니면 양수X
		String result1 = (num1 > 0)? "양수" : "양수X";
		String result2 = (num2 > 0)? "양수" : "양수X";
		System.out.println("num1은 " + result1);
		System.out.println("num2은 " + result2);
		
		
		
		
		
		
		
		
		
		// 중첩 사용 가능
		int num3 = 5;
		int num4 = 0;
		int num5 = -5;
		
		// num3이 0보다 크면? 양수, 아니면 num3은 0과 같은가? 같으면 0, 아니면 음수이다.
		String result3 = (num3 > 0)? "양수" : (num3 == 0) ? "0" : "음수";
		String result4 = (num4 > 0)? "양수" : (num4 == 0) ? "0" : "음수";
		String result5 = (num5 > 0)? "양수" : (num5 == 0) ? "0" : "음수";

		System.out.println("num3은 " + result3);
		System.out.println("num4은 " + result4);
		System.out.println("num5은 " + result5);
		
		
		
		

	}

}
