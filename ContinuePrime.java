import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
//8�� �� �Ҽ� ���ϱ�
public class ContinuePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N[] = new int[T];
		ArrayList list = new ArrayList();
		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt();
			list.add(Prime(N[i]));
		}
		int a =0;
		while(list.size()>a){
			StringTokenizer stok = new StringTokenizer(String.valueOf(list.get(a)),"[], ");// "[], " �� ���� ���ڸ� ��ȹ���ڷ� 
			while(stok.hasMoreTokens()){
				System.out.println(stok.nextToken());
			}
			System.out.println();
			a++;
		}
	}
	public static ArrayList Prime(int n){
		int start = Integer.parseInt(String.valueOf(Math.round(Math.pow(10, (n-1)))));	//n�� �ڸ����� �ּҰ� => n=4 , 1000
		int last = Integer.parseInt(String.valueOf(Math.round(Math.pow(10, n)-1)));		//n�� �ڸ����� �ִ밪 => n=5 , 9999
		ArrayList list = new ArrayList();
		for (int i = start; i <= last; i++) {
			int[] box = new int[n]; 
			int p = i;
			int count = 0;
			for (int j = 0; j < box.length; j++) {
				box[j] = p/Integer.parseInt(String.valueOf(Math.round(Math.pow(10, (n-(j+1))))));
				p = p - box[j]*Integer.parseInt(String.valueOf(Math.round(Math.pow(10, (n-(j+1))))));
			}
			
			for (int j = 0; j < box.length; j++) {
				int sum = 0;	//�Ҽ� �Ǻ��ϱ� ����
				for (int k = 0; k < j+1 ; k++) {
					sum += box[j-k]*Integer.parseInt(String.valueOf(Math.round(Math.pow(10, k))));
				}
		
				int cnt = 0;	//�Ҽ��� ���ϱ� ���� ī��Ʈ
				for (int m = 2; m < sum; m++) {
					if(sum % m == 0)
						break;	//i �� �κ� ���� sum�� �Ҽ��̸� count ����
					cnt++;
				}
				
				if(cnt==(sum-2)){
					count++;	//cnt���� �� ���� �Ҽ����� 2�� �� ���� ������ i�� �κ� ���� �Ҽ����� üũ
				}
			}
			if(count==n){
				list.add(i);	//count �� n�� ������ �κ� ������ ���� �Ҽ���
			}
		}
		return list;
		
	}

}
