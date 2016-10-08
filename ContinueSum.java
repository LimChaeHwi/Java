import java.util.Scanner;

//5번 최대 연속 부분합

public class ContinueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//테스트 케이스 수
		
		int N[] = new int[n];
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();	//테스스 케이스 크기
			int T[] = new int[t];
			
			for (int j = 0; j < t; j++) {
				T[j] = sc.nextInt();	//값 대입
			}
			
			N[i] = sum(T);
		}
		for (int i = 0; i < N.length; i++) {
			System.out.println(N[i]);
		}
		
	}
	public static int sum(int T[]){
		int sum = 0;
		int max = T[0];	//음수일 경우를 대비해 배열값 중 하나 입력
		
		for(int j=1 ; j<T.length+1 ; j++){
			for(int s=0,f=j ; f<T.length+1 ; s++,f++){	//시작과 끝값을 넓이와 위치를 이동하면서 계산
				for (int i = s; i < f; i++) {
					sum += T[i];
					if(max<sum)
						max = sum;
				}
				sum=0;	//sum 초기화
			}
		}
		return max;
	}

}
