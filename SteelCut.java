//7�� ���� ����
import java.util.Scanner;

public class SteelCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	//�׽�Ʈ ���̽� ��
		int T[] = new int[t];
		int tmp =0;
		int time = 1;
		int min = 0;
		for (int i = 0; i < T.length; i++) {
			int n = sc.nextInt();
			min = n;	//�ּ� �ð� �ʱ�ȭ
			int N[][] = new int[n][2];
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 2; k++) {
					N[j][k] = sc.nextInt();
				}
			}
			//j�� �������� �� �յ� ���ؼ� �ּ� �ð� ���ϱ�
			for (int j = 0; j < n-1; j++) {
				for (int k = 0; k < 2; k++) {
					if(N[j][k]>N[j+1][k]&k==0){
						tmp = N[j][k];
						N[j][k] = N[j+1][k];
						N[j+1][k] = tmp;
						tmp = N[j][k+1];
						N[j][k+1] = N[j+1][k+1];
						N[j+1][k+1] = tmp;
					}
					
					if(k==0&&N[j][k+1]>N[j+1][k+1]){
						time++;
					}
				}
			}
			if(time<min)
				min = time;
			time = 1;
			//k�� �������� ��
			for (int j = 0; j < n-1; j++) {
				for (int k = 0; k < 2; k++) {
					if(N[j][k]>N[j+1][k]&k==1){
						tmp = N[j][k];
						N[j][k] = N[j+1][k];
						N[j+1][k] = tmp;
						tmp = N[j][k-1];
						N[j][k-1] = N[j+1][k-1];
						N[j+1][k-1] = tmp;
					}
					if(k==1&&N[j][k-1]>N[j+1][k-1]){
						time++;
					}
				}
			}
			if(time<min)
				min = time;
			time = 1;
//			for (int j = 0; j < n; j++) {
//				for (int k = 0; k < 2; k++) {
//					System.out.print(N[j][k]);
//				}
//				System.out.println();
//			}
			T[i] = min;	//�ּ� �ð� ��
		}
		for (int i = 0; i < T.length; i++) {
			System.out.println(T[i]);
		}
		
	}

}
