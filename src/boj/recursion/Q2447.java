package boj.recursion;

import java.util.Scanner;

public class Q2447 {

	// �̿Ϸ� �̤�
	
	// ������� �������� ���� ��� ����. N�� 3�� �ŵ�����(3, 9, 27, ...)�̶�� �� ��, ũ�� N�� ������ N��N ���簢�� ����̴�.

	// ũ�� 3�� ������ ����� ������ �ְ�, ����� ������ ��� ĭ�� ���� �ϳ��� �ִ� �����̴�.

	// ù° �ٿ� N�� �־�����. N�� 3�� �ŵ������̴�. �� � ���� k�� ���� N=3k�̸�, �̶� 1 �� k < 8�̴�.

	// ù° �ٺ��� N��° �ٱ��� ���� ����Ѵ�.

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
