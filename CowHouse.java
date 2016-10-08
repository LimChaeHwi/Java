import java.util.Scanner;
//9번 외양간 고치기
public class CowHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int S[] = new int[T];
		for (int i = 0; i < S.length; i++) {
			int M = sc.nextInt();	//가져올 판자의 갯수
			int N = sc.nextInt();	//외양간의 총 갯수(외양간은 1열로 배치)
			int C = sc.nextInt();	//소가 남아있는 외양간의 수
			int p[] = new int[C];
				for (int j = 0; j < p.length; j++) {
					p[j] = sc.nextInt();	//소가 남아있는 외양간의 번호
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
