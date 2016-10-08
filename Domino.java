import java.util.Scanner;

//6번 도미노 배치
/*
 * t = 4
1*4 2*0
1*2 2*1
1*0 2*2

t = 6
1*6 2*0
1*4 2*1
1*2 2*2
1*0 2*4
 */
public class Domino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//테스트 케이스 수
		
		int N[] = new int[n];
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();	//도미노 가로 길이
			int M = sc.nextInt();	//나눌 값
			int cnt = 0;
			for (int j = 0; j < t; j++) {
				if((1*(t-2*j)+2*(j))==t&&t-2*j>=0){
					System.out.println(t-2*j+":"+j+" 입력");
					cnt += facto(t-2*j+j)/facto(t-2*j)/facto(j);	//(1의갯수+2의갯수)!/(1의갯수)!/(2의갯수)!
					System.out.println("cnt: "+cnt+" "+facto(t-2*j+j)/facto(t-2*j)/facto(j)+" "+facto(t-2*j+j)+"/"+(facto(t-2*j)+"/"+facto(j)));
				}
			}
			N[i] = cnt%M;
		}
		for (int i = 0; i < N.length; i++) {
			System.out.println("값 : "+N[i]);
		}
		
	}
	public static int facto(int a){
		int fac = a;
		if(fac==0||fac==1){
			return 1;
		}
		while(true){
			fac = fac*(a-1);
			a--;
			if(a==1)
				break;
		}

		
		return fac;
	}

}
