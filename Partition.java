import java.util.Scanner;

/*
 * ù�ٿ� �׽�Ʈ ���̽� T
 * �μ��� �� �� N 1<=N<=10000
 * �μ��� ����� ������ ũ�� S 10<=S<=5000
 */
public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] t = new int[T]; //�׽�Ʈ ���̽� ��
		int[] time = new int[T];
		for (int i = 0; i < t.length; i++) {
			t[i] = sc.nextInt();	//������ ��
			int[] s = new int[t[i]];
			for (int j = 0; j < t[i]; j++) {
				s[j] = sc.nextInt();	//������ ũ�⸦ �迭�� ����
			}
			time[i]=part(s);	//������
		}
		for (int i = 0; i < time.length; i++) {
			System.out.println(time[i]);
		}
		
	}
	public static int part(int[] s){
		int time=0;	//�ּ� �ð�
		int sum = 0; //�հ�
		
		for (int i = 0; i < s.length; i++) {
			sum += s[i];
		}
//		System.out.println("sum="+sum);
		sort(s); //�ִ밪�� ��������
		
		for(int i = 0;i<s.length-1;i++){
			time += sum;
			sum = sum - s[i];
		}
//		System.out.println("time = "+time);
		return time;
	}
	public static void sort(int[] s){
		int tmp = 0; //���� ���� ��
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if(s[i]>s[j]){
					tmp = s[j];
					s[j] = s[i];
					s[i] = tmp;
				}
			}
		}
//		System.out.println(s[0]+" "+s[1]+" "+s[2]);
	}

}
