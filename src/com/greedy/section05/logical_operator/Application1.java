package com.greedy.section05.logical_operator;

public class Application1 {

	public static void main(String[] args) {
		/* 논리 연산자 
		 * 논리값(true/false)를 취급하는 연산자
		 */
		
		/* 논리 연산자의 종류
		 * 1. 논리 연결 연산자 : 두 개의 논리 식을 판단하여 참/거짓 판단(이항연산자, 왼쪽->오른쪽)
		 * 	1-1. &&(논리 AND): 두 개 논리식 모두 참이면 참, 둘 중 하나라도 거짓이면 거짓
		 *  1-2. ||(논리 OR) : 두 개 논리식 중 하나라도 참이면 참, 둘 다 거짓이면 거짓
		 * 
		 * 2. 논리 부정 연산자 : 논리식의 결과가 참이면 거짓, 거짓이면 참
		 * 	2-1. !(논리 NOT) : 논리식의 결과가 참이면 거짓, 거짓이면 참
		 * */
		
//		// 1. 논리 연산자 결과값 확인
//		System.out.println("논리 AND ");
//		System.out.println("true와 true 의 논리 and 연산 : " + (true && true));
//		System.out.println("true와 false 의 논리 and 연산 : " + (true && false));
//		System.out.println("false와 true 의 논리 and 연산 : " + (false && true));
//		System.out.println("false와 false 의 논리 and 연산 : " + (false && false));
//		
//		System.out.println("논리 OR ");
//		System.out.println("true와 true 의 논리 or 연산 : " + (true || true));
//		System.out.println("true와 false 의 논리 or 연산 : " + (true || false));
//		System.out.println("false와 true 의 논리 or 연산 : " + (false || true));
//		System.out.println("false와 false 의 논리 or 연산 : " + (false || false));
//		
//		System.out.println("논리 NOT ");
//		System.out.println("true 의 논리 not 연산 : " + (!true));
//		System.out.println("false 의 논리 not 연산 : " + (!false));

		
		// 2. 논리식에 논리 연산자 활용
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + ((a < b)&&(c < d)));
		System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + ((a < b)&&(c > d)));
		System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + ((a > b)&&(c < d)));
		System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + ((a > b)&&(c > d)));
		
		System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + ((a < b)||(c < d)));
		System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + ((a < b)||(c > d)));
		System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 : " + ((a > b)||(c < d)));
		System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + ((a > b)||(c > d)));
		

	}

}
