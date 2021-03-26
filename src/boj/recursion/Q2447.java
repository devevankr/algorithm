package boj.recursion;

import java.util.Scanner;

public class Q2447 {

	// 미완료 ㅜㅜ
	
	// 재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.

	// 크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

	// 첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.

	// 첫째 줄부터 N번째 줄까지 별을 출력한다.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int Ncp = N;
		int p = 1;

		while (Ncp > 3) {
			p++;
			Ncp /= 3;
		}
		
		
		
		sc.close();

	}

}
