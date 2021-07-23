package com.greedy.section05.logical_operator;

public class Application2 {

	public static void main(String[] args) {
		/* 논리 연산자의 우선순위와 활용 
		 * 논리 and 연산자와 논리 or 연산자의 우선순위
		 * &&: 11순위
		 * ||: 12순위
		 * 논리 and 연산자 우선순위가 논리 or 연산자 우선순위보다 높다.
		 */
		
		// 1. 1부터 100사이의 값인지 확인
		int num1 = 55;
		System.out.println("1부터 100사이의 값인지 확인: " + (1 <= num1 && num1 <= 100));

		int num2 = 166;
		System.out.println("1부터 100사이의 값인지 확인: " + (1 <= num2 && num2 <= 100));

		// 2. 영어 대문자인지 확인
		char ch1 = 'G';
		System.out.println("대문자인지 확인: " + ('A' <= ch1 && ch1 <= 'Z'));
		
		char ch2 = 'g';
		System.out.println("대문자인지 확인: " + ('A' <= ch2 && ch2 <= 'Z'));
		
		// 3. 영어 대소문자상관없이 y인지 확인
		char ch3 = 'Y';
		System.out.println("영문자 y인지 확인: " + ('Y' == ch3 || ch3 == 'y'));
		
		char ch4 = 'g';
		System.out.println("영문자 y인지 확인: " + ('Y' == ch4 || ch4 == 'y'));
		
		// 4. 영문자인지 확인 (아스키코드표에서 91 ~ 96까지는 영문자가 아니므로 제외해야함)
		char ch5 = 'g';
		System.out.println("영문자인지 확인: " + (('a' <= ch5 && ch5 <= 'z') || ('A' <= ch5 && ch5 <= 'Z')));
		
		char ch6 = 'g';
		System.out.println("영문자인지 확인: " + ((97 <= ch6 && ch6 <= 122) || (65 <= ch6 && ch6 <= 90)));
		
		
		
	}

}
