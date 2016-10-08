import java.util.Scanner;
//대칭행렬
public class Symmetrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	//테스트 케이스 수
		int N[] = new int[T];	//테스트 케이스에 대한 길이 값
		
		for (int i = 0; i < T; i++) {
			N[i] = sc.nextInt();	//길이 값
			String s[] = new String[N[i]];
			String a2[][] = new String[N[i]][N[i]];
			
			int cnt =0;	//4개 묶음 수
			cnt = N[i]/4;
			
				for (int k = 0; k < s.length; k++) {
					s[k] = sc.next();	//초기 문자열 입력
				}
				a2 = matrix(s);
				for (int k = 0; k < a2.length; k++) {
					for (int l = 0; l < a2.length; l++) {
						System.out.print(a2[k][l]+" ");
					}
					System.out.println();
				}
				System.out.println();

		}
		
		sc.close();
	}
	public static String[][] matrix(String[] s){
		int cnt = s.length/4;
		int p =0;
		int x = 0;
		int y = 0;
		String a1[][] = new String[s.length][s.length];
		for (int a = 0; a < cnt*4; a=a+4) {
			
			x=0;
			y=a;
			
			for (int b = 0; b < cnt*4; b=b+4) {
				
				if(p>=s.length)
					p=0;
				if(a>0&b<1)
					p=a;
				
				for (int i = 0; i < 4; i++) {
					a1[i+y][i+x] = s[p];
				}
				p++;
				for (int i = 0; i < 4; i++) {
					if(i%2==0)
						a1[i+y][i+1+x] = s[p];
					if(i%2!=0)
						a1[i+y][i-1+x] = s[p];
				}
				p++;
				for (int i = 0; i < 4; i++) {
					if(i<2)
						a1[i+y][i+2+x] = s[p];
					if(i>=2)
						a1[i+y][i-2+x] = s[p];
				}
				p++;
				for (int i = 0; i < 4; i++) {
					a1[i+y][4-(i+1)+x] = s[p];
				}
				p++;
				
				if(x<=y)
					x+=4;
				else if(x>y)
					y+=4;
				
			}
		}
		
		
		return a1;
	}
	
	
}
