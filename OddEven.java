package day3_3;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("sum(7)");
		System.out.println("결과 값 : "+sum(7));
		System.out.println("sum(10)");
		System.out.println("결과 값 : "+sum(10));
		System.out.println("sum(11)");
		System.out.println("결과 값 : "+sum(11));
	}

	public static int sum(int num) {
		
		if (num % 2 == 1) {
			// 홀수
			int sum = 1;
			for (int i = 3; i <= num; i=i+2) {
				sum += i;
			}
			return sum;
		} else {
			// 짝수
			int sum = 2;
			for (int i = 4; i <= num; i=i+2) {
				sum += i;
			}
			return sum;
		}
	}
}
