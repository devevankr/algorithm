package boj.recursion;

import java.util.Scanner;

public class Q10872 {

	
	// 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
	// ù° �ٿ� N!�� ����Ѵ�.

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
