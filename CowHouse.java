import java.util.Scanner;
//9�� �ܾ簣 ��ġ��
public class CowHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int S[] = new int[T];
		for (int i = 0; i < S.length; i++) {
			int M = sc.nextInt();	//������ ������ ����
			int N = sc.nextInt();	//�ܾ簣�� �� ����(�ܾ簣�� 1���� ��ġ)
			int C = sc.nextInt();	//�Ұ� �����ִ� �ܾ簣�� ��
			int p[] = new int[C];
				for (int j = 0; j < p.length; j++) {
					p[j] = sc.nextInt();	//�Ұ� �����ִ� �ܾ簣�� ��ȣ
				}
			int max = p[0];
			int min = p[0];
			for (int j = 0; j < p.length; j++) {
				if(max<p[j]){
					max = p[j];
				}
				if(min>p[j]){
					min = p[j];
				}
			}
		}
	}

}
