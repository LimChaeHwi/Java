import java.util.Scanner;
/*
 * �׽�Ʈ ���̽� �� �Է� T
 * ��ȣǥ �� �Է� N, ���� �� �Է� M, ���� ����� �� ���� �Է� P
 * �Է��� ����� ���� �߿� ��ȣǥ�� �����ϴ� ������ ������ ������ ���ߴ� ���α׷�
 * �Է�
 * 1
 * 5 3 2
 * 1 2 3 4 5
 * 2 1 4 3 5
 * ���
 * 11
 */

public class ServiceCenter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	//�׽�Ʈ ���̽�
		String e[] = new String[T];
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();	//��ȣǥ ��
			int M = sc.nextInt();	//���� ��
			int P = sc.nextInt();	//���� ����� �� ����
			int[][] a = new int[P][N];
			insert(N,P,a);		//�� �Է�
			e[i] = check(N,M,P,a);
		}
		for(int i =0;i<T;i++){
			System.out.println(e[i]);	//���
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
		int h[] = new int[M];	//���� ����ŭ �迭
		String str ="";	//���ڿ��� �ٿ��� ����

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
