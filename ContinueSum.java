import java.util.Scanner;

//5�� �ִ� ���� �κ���

public class ContinueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//�׽�Ʈ ���̽� ��
		
		int N[] = new int[n];
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();	//�׽��� ���̽� ũ��
			int T[] = new int[t];
			
			for (int j = 0; j < t; j++) {
				T[j] = sc.nextInt();	//�� ����
			}
			
			N[i] = sum(T);
		}
		for (int i = 0; i < N.length; i++) {
			System.out.println(N[i]);
		}
		
	}
	public static int sum(int T[]){
		int sum = 0;
		int max = T[0];	//������ ��츦 ����� �迭�� �� �ϳ� �Է�
		
		for(int j=1 ; j<T.length+1 ; j++){
			for(int s=0,f=j ; f<T.length+1 ; s++,f++){	//���۰� ������ ���̿� ��ġ�� �̵��ϸ鼭 ���
				for (int i = s; i < f; i++) {
					sum += T[i];
					if(max<sum)
						max = sum;
				}
				sum=0;	//sum �ʱ�ȭ
			}
		}
		return max;
	}

}
