import java.util.Scanner;
/*
 * 테스트 케이스 수 입력 T
 * 번호표 수 입력 N, 직원 수 입력 M, 구할 경우의 수 갯수 입력 P
 * 입력한 경우의 수들 중에 번호표를 수집하는 순서가 가능한 순서를 맞추는 프로그램
 * 입력
 * 1
 * 5 3 2
 * 1 2 3 4 5
 * 2 1 4 3 5
 * 출력
 * 11
 */

public class ServiceCenter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	//테스트 케이스
		String e[] = new String[T];
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();	//번호표 수
			int M = sc.nextInt();	//직원 수
			int P = sc.nextInt();	//구할 경우의 수 갯수
			int[][] a = new int[P][N];
			insert(N,P,a);		//값 입력
			e[i] = check(N,M,P,a);
		}
		for(int i =0;i<T;i++){
			System.out.println(e[i]);	//출력
		}
	}
	public static void insert(int N, int P, int[][] a){
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < P; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	public static String check(int N, int M, int P, int[][] a){
		int h[] = new int[M];	//직원 수만큼 배열
		String str ="";	//문자열로 붙여서 리턴

		for (int i = 0; i < P; i++) {
			int cnt =0;
			int ticket = 0;
			for (int q = 0; q < M; q++) {
				h[q] = ticket++;	
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if(a[i][j]==h[k]){
//						System.out.print("a["+i+"]["+j+"]="+a[i][j]+" h["+k+"]="+h[k]+" ");
						h[k]=ticket++;
						cnt++;
						break;
					}	
				}
//				System.out.println();
			}
			if(cnt==N)
				str+=1;
			else
				str+=0;
		}
//		System.out.println(str);
		return str;
	}

}
