import java.util.Scanner;

/*
 * 첫줄에 테스트 케이스 T
 * 부서의 총 수 N 1<=N<=10000
 * 부서별 사용할 공간의 크기 S 10<=S<=5000
 */
public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] t = new int[T]; //테스트 케이스 수
		int[] time = new int[T];
		for (int i = 0; i < t.length; i++) {
			t[i] = sc.nextInt();	//공간의 수
			int[] s = new int[t[i]];
			for (int j = 0; j < t[i]; j++) {
				s[j] = sc.nextInt();	//공간의 크기를 배열에 대입
			}
			time[i]=part(s);	//나누기
		}
		for (int i = 0; i < time.length; i++) {
			System.out.println(time[i]);
		}
		
	}
	public static int part(int[] s){
		int time=0;	//최소 시간
		int sum = 0; //합계
		
		for (int i = 0; i < s.length; i++) {
			sum += s[i];
		}
//		System.out.println("sum="+sum);
		sort(s); //최대값을 가져오기
		
		for(int i = 0;i<s.length-1;i++){
			time += sum;
			sum = sum - s[i];
		}
//		System.out.println("time = "+time);
		return time;
	}
	public static void sort(int[] s){
		int tmp = 0; //순서 섞는 값
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
