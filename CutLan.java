import java.util.Scanner;

/* 
 * N개의 랜선을 만들어야함.
 * K개의 랜선을 가지고 있는데 길이가 제각각임.
 * K개의 랜선을 잘라서 같은 길이의 랜선을 N개 만들어야함.
 * 정수 단위 길이로 자르고 자르고 남은 것은 버려야한다.
 * 입력1: 랜선의 갯수 K , 필요한 랜선의 갯수 N, K<=N
 * 입력2: 랜선의 길이
 */

public class CutLan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();	//입력 갯수
		int N = sc.nextInt();	//찾을 갯수
		int Lan[]= new int[K];
		insert(Lan);	//입력
		sort(Lan);		//정렬 굳이..
		cut(Lan,N);		//컷
	}
	public static void insert(int[] Lan){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < Lan.length; i++) {
			Lan[i] = sc.nextInt();	//갯수만큼 입력
		}
	}
	public static void sort(int[] Lan){
		int temp = 0;
		for (int i = 0; i < Lan.length; i++) {
			for (int j = 0; j < Lan.length; j++) {
				if(Lan[i]<Lan[j]){		//오름차순
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
			if(cnt==N)	//result로 랜선을 자른 갯수와 N값이 값으면 break
				break;
				result--;
		}
		System.out.println(result);
	}
}
