import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
//8번 연 소수 구하기
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
			StringTokenizer stok = new StringTokenizer(String.valueOf(list.get(a)),"[], ");// "[], " 네 가지 문자를 구획문자로 
			while(stok.hasMoreTokens()){
				System.out.println(stok.nextToken());
			}
			System.out.println();
			a++;
		}
	}
	public static ArrayList Prime(int n){
		int start = Integer.parseInt(String.valueOf(Math.round(Math.pow(10, (n-1)))));	//n의 자릿수의 최소값 => n=4 , 1000
		int last = Integer.parseInt(String.valueOf(Math.round(Math.pow(10, n)-1)));		//n의 자릿수의 최대값 => n=5 , 9999
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
				int sum = 0;	//소수 판별하기 위해
				for (int k = 0; k < j+1 ; k++) {
					sum += box[j-k]*Integer.parseInt(String.valueOf(Math.round(Math.pow(10, k))));
				}
		
				int cnt = 0;	//소수를 구하기 위해 카운트
				for (int m = 2; m < sum; m++) {
					if(sum % m == 0)
						break;	//i 의 부분 값인 sum이 소수이면 count 증가
					cnt++;
				}
				
				if(cnt==(sum-2)){
					count++;	//cnt값과 그 수의 소수에서 2를 뺀 값이 같으면 i의 부분 값이 소수임을 체크
				}
			}
			if(count==n){
				list.add(i);	//count 와 n이 같으면 부분 값들이 전부 소수임
			}
		}
		return list;
		
	}

}
