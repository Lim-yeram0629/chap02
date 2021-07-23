package com.greedy.section01.arithmetic_operator;

public class Application1 {
	public static void main(String[] args) {
		/* 산술 연산자 
		 * 주로 사칙 연산과 관련된 연산자로 가장 기본적이며, 많이 사용되는 연산자이다. 
		 */
		
		/* 산술 연산자의 종류
		 * + : 왼쪽의 피연산자에 오른쪽 피연산자를 더한다.
		 * - : 왼쪽의 피연산자에 오른쪽 피연산자를 뺀다. 
		 * * : 왼쪽의 피연산자에 오른쪽 피연산자를 곱한다. 
		 * / : 왼쪽의 피연산자를 오른쪽 피연산자로 나눈다. 
		 * % : 왼쪽의 피연산자를 오른쪽 피연산자로 나눈 나머지를 구한다.
		 */
		
		// 산술연산자의 우선순위는 수학의 개념과 유사하다. () > *,/,% > +,-
		
		int num1= 20;	int num2 = 7;
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 * num2 = " + (num1*num2));
		System.out.println("num1 / num2 = " + (num1/num2));
		System.out.println("num1 % num2 = " + (num1%num2));
	}

}
