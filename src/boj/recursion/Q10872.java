package boj.recursion;

import java.util.Scanner;

public class Q10872 {

	
	// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
	// 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
	// 첫째 줄에 N!을 출력한다.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int result = 1;
		
		while(N>1) {
			result *= N--;
		}
		
		System.out.println(result);
	
		sc.close();
		
	}
	
}
