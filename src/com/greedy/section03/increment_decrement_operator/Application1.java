package com.greedy.section03.increment_decrement_operator;

public class Application1 {

	public static void main(String[] args) {
		/* 증감 연산자 
		 * 피연산자의 앞 또는 뒤에 사용 가능
		 * ++ : 1 증가
		 * -- : 1 감소
		 */
		
		int num = 20;
		System.out.println("num : " + num);
		
		num++;
		System.out.println("num : " + num);
		
		++num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		
		--num;
		System.out.println("num : " + num);
		
		int firstNum = 20;
		int result1 = firstNum++ * 3;	// 20(21) * 3 -> 다른 연산 처리 후, 마지막에 증감
		System.out.println("result1 : " + result1);
		System.out.println("firstNum : " + firstNum);
		
		int secondNum = 20;
		int result2 = ++secondNum * 3;	// 21(21) * 3 -> 증가 후, 다른 연산 처리
		System.out.println("result2 : " + result2);
		System.out.println("secondNum : " + secondNum);
		
		System.out.println("=======문제========");
		int num1 = 10;	
		int num2 = 20;	
		int num3 = 30;
		
		System.out.println(num1++);	// 10
		//num1 = 10(11) , num2 =20 , num3 =30 
		System.out.println((++num1) + (num2++)); // 12 + 20
		//num1 = 12(12) , num2 = 20(21) , num3 =30 
		System.out.println((num1++) + (--num2) + (--num3));// 12 + 20 + 29
		//num1 = 12(13) , num2 = 20(20), num3 = 29(29)
		System.out.println("num1 : " + num1 );
		System.out.println("num2 : " + num2 );
		System.out.println("num3 : " + num3 );
		
		
		

		
		
		
		
		
		
		
	}

}
