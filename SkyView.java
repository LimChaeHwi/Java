import java.util.Scanner;
/*
 * 테스트 케이스 수 T
 * 별자리를 입력해서 별자리의 수와 별자리들 중 가장 많은 별의 수를 출력
 * 하나의 별자리는 1이 상하좌우로만 연결되있는 경우임. 대각선은 안됨.
 * 입력
 * 1
 * 5
1 1 0 0 1
1 0 1 0 1
1 1 1 0 0
0 0 0 0 1
1 1 0 0 0
 * 출력
 * 4 7
 */
public class SkyView {
	static int starmap = 0;	//별자리 수
	static int star = 0; // 별의 갯수
	static int max_star = 0;	//최대 별갯수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스크 케이스 수
		int N[] = new int[T]; // 크기 5<= N <=25
		int K[][];  // 별 입력 1 or 0
		int S[] = new int[T]; // 별자리의 수
		int C[] = new int[T]; // 별의 갯수
		int V[][];	//복사용 배열
		for (int i = 0; i < T; i++) {
			N[i] = sc.nextInt();
			if(N[i]<5||N[i]>25){
				System.out.println("5<=N<=25 !!");
				break;
			}
			K = new int[N[i]][N[i]];
			V = new int[N[i]][N[i]];
			for (int j = 0; j < N[i]; j++) {
				for (int j2 = 0; j2 < N[i]; j2++) {
					K[j][j2] = sc.nextInt();
				}
			}
			V = K; // K배열 복사
			sGetter(V, N[i]);
			S[i] = starmap;
			C[i] = max_star;
			star = 0;
			starmap = 0;
			max_star = 0;
		}
		for (int k = 0; k < T; k++) {
			System.out.print("별자리 갯수 : " + S[k] + " ");
			System.out.println("최대 별갯수 : " + C[k]);
		}
		sc.close();
	}

	public static void sGetter(int V[][], int N) {
		// 별자리의 수

		int center = (int) N / 2;

		// 가운데를 기준으로 1이면 제거 후 시작
		if (V[center][center] == 1) {
			V[center][center] = 0;
			// System.out.println("V["+center+"]["+center+"]");

			star++;
			remove(V, center, center, N);
			starmap++;
			starChange();
		}
		for (int a = 1; a < N - center; a++)
			move(V, center + a, center + a, N, center);
		for (int a = 1; a < N - center; a++)
			move(V, center + a, center - a, N, center);
		for (int a = 1; a < N - center; a++)
			move(V, center - a, center + a, N, center);
		for (int a = 1; a < N - center; a++)
			move(V, center - a, center - a, N, center);
		for (int a = 1; a < N - center; a++)
			move(V, center + a, center, N, center);
		for (int a = 1; a < N - center; a++)
			move(V, center, center + a, N, center);
		for (int a = 1; a < N - center; a++)
			move(V, center - a, center, N, center);
		for (int a = 1; a < N - center; a++)
			move(V, center, center - a, N, center);

	}

	public static void move(int V[][], int i, int j, int N, int center) {

		for (int a = 1; a < N - center; a++) {
			if (V[(i)][(j)] == 1) {
				V[(i)][(j)] = 0;
				System.out.println("V[" + i + "][" + j + "]");

				star++;
				remove(V, i, j, N);

				starmap++;

			} else {
				Cross(V, N, i, j);

			}
		}

		starChange(); // 별자리들의 별의 갯수

	}

	public static void remove(int V[][], int i, int j, int N) {

		if (i > 0 && V[(i - 1)][j] == 1) {
			// 상
			V[(i - 1)][j] = 0;
			System.out.println("V[" + (i - 1) + "][" + j + "]");
			star++;
			// System.out.println("V["+(i-1)+"]["+(j)+"]="+"상");

			remove(V, i - 1, j, N);

		}
		if (i < N - 1 && V[(i + 1)][j] == 1) {
			// 하
			V[(i + 1)][j] = 0;
			System.out.println("V[" + (i + 1) + "][" + j + "]");
			// System.out.println("V["+(i+1)+"]["+(j)+"]="+"하");

			star++;
			remove(V, i + 1, j, N);

		}
		if (j > 0 && V[i][(j - 1)] == 1) {
			// 좌
			V[i][(j - 1)] = 0;
			// System.out.println("V["+i+"]["+(j-1)+"]="+"좌");
			System.out.println("V[" + i + "][" + (j - 1) + "]");

			star++;
			remove(V, i, j - 1, N);

		}
		if (j < N - 1 && V[i][(j + 1)] == 1) {
			// 우
			V[i][(j + 1)] = 0;
			System.out.println("V[" + i + "][" + (j + 1) + "]");
			// System.out.println("V["+i+"]["+(j+1)+"]="+"우");

			star++;
			remove(V, i, j + 1, N);
		}

	}

	public static void Cross(int V[][], int N, int i, int j) {

		if (j + 1 < N - 1 && V[(i)][(j + 1)] == 1) {

			V[(i)][(j + 1)] = 0;
			System.out.println("V[" + i + "][" + (j + 1) + "]");
			star++;
			remove(V, i, j + 1, N);

			starmap++;

			starChange();
		}
		if (j - 1 > 0 && V[(i)][(j - 1)] == 1) {

			V[(i)][(j - 1)] = 0;

			System.out.println("V[" + i + "][" + (j - 1) + "]");
			star++;
			remove(V, i, j - 1, N);

			starmap++;

			starChange();
		}
		if (i + 1 < N - 1 && V[(i + 1)][(j)] == 1) {

			V[(i + 1)][(j)] = 0;
			System.out.println("V[" + (i + 1) + "][" + (j) + "]");
			star++;
			remove(V, i + 1, j, N);

			starmap++;

			starChange();
		}
		if (i - 1 > 0 && V[(i - 1)][(j)] == 1) {

			V[(i - 1)][(j)] = 0;
			System.out.println("V[" + (i - 1) + "][" + (j) + "]");
			star++;
			remove(V, i - 1, j, N);

			starmap++;

			starChange();
		}

	}

	public static void starChange() {
		if (star >= max_star) {
			max_star = star;
			star = 0;
		}
		System.out.println("------------");
	}

}
