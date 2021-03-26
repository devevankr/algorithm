package boj.recursion;

import java.util.HashMap;
import java.util.Scanner;

public class Q10870 {

	
	/*
		�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
		�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n �� 2)�� �ȴ�.
		n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
		n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.

		ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.

	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
		map.put(0,0);
		map.put(1,1);
		
		if(n==0) {
			System.out.println(map.get(0));
		}else if(n==1) {
			System.out.println(map.get(1));
		}else {
			for(int i=2; i<=n; i++) {
				map.put(i, map.get(i-1)+map.get(i-2));				
			}
			System.out.println(map.get(n));
		}
		
		sc.close();
		
	}

	
}
