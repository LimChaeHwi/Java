import java.util.Scanner;

/* 
 * N���� ������ ��������.
 * K���� ������ ������ �ִµ� ���̰� ��������.
 * K���� ������ �߶� ���� ������ ������ N�� ��������.
 * ���� ���� ���̷� �ڸ��� �ڸ��� ���� ���� �������Ѵ�.
 * �Է�1: ������ ���� K , �ʿ��� ������ ���� N, K<=N
 * �Է�2: ������ ����
 */

public class CutLan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();	//�Է� ����
		int N = sc.nextInt();	//ã�� ����
		int Lan[]= new int[K];
		insert(Lan);	//�Է�
		sort(Lan);		//���� ����..
		cut(Lan,N);		//��
	}
	public static void insert(int[] Lan){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < Lan.length; i++) {
			Lan[i] = sc.nextInt();	//������ŭ �Է�
		}
	}
	public static void sort(int[] Lan){
		int temp = 0;
		for (int i = 0; i < Lan.length; i++) {
			for (int j = 0; j < Lan.length; j++) {
				if(Lan[i]<Lan[j]){		//��������
					temp = Lan[i];
					Lan[i] = Lan[j];
					Lan[j] = temp;
				}
			}
		}
	}
	public static void cut(int[] Lan, int N){
		int sum = 0;
		int result = 1;
		
		for (int i = 0; i < Lan.length; i++) {
			sum += Lan[i];
		}
		int cnt=0;
		result = sum / N;
		while(true){
			cnt =0;
			for (int i = 0; i < Lan.length; i++) {
				cnt += (Lan[i]/result);
			}		
			if(cnt==N)	//result�� ������ �ڸ� ������ N���� ������ break
				break;
				result--;
		}
		System.out.println(result);
	}
}
