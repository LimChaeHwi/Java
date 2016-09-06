import java.util.Scanner;
/*
 * �׽�Ʈ ���̽� �� T
 * ���ڸ��� �Է��ؼ� ���ڸ��� ���� ���ڸ��� �� ���� ���� ���� ���� ���
 * �ϳ��� ���ڸ��� 1�� �����¿�θ� ������ִ� �����. �밢���� �ȵ�.
 * �Է�
 * 1
 * 5
1 1 0 0 1
1 0 1 0 1
1 1 1 0 0
0 0 0 0 1
1 1 0 0 0
 * ���
 * 4 7
 */
public class SkyView {
	static int starmap = 0;	//���ڸ� ��
	static int star = 0; // ���� ����
	static int max_star = 0;	//�ִ� ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // �׽�ũ ���̽� ��
		int N[] = new int[T]; // ũ�� 5<= N <=25
		int K[][];  // �� �Է� 1 or 0
		int S[] = new int[T]; // ���ڸ��� ��
		int C[] = new int[T]; // ���� ����
		int V[][];	//����� �迭
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
			V = K; // K�迭 ����
			sGetter(V, N[i]);
			S[i] = starmap;
			C[i] = max_star;
			star = 0;
			starmap = 0;
			max_star = 0;
		}
		for (int k = 0; k < T; k++) {
			System.out.print("���ڸ� ���� : " + S[k] + " ");
			System.out.println("�ִ� ������ : " + C[k]);
		}
		sc.close();
	}

	public static void sGetter(int V[][], int N) {
		// ���ڸ��� ��

		int center = (int) N / 2;

		// ����� �������� 1�̸� ���� �� ����
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

		starChange(); // ���ڸ����� ���� ����

	}

	public static void remove(int V[][], int i, int j, int N) {

		if (i > 0 && V[(i - 1)][j] == 1) {
			// ��
			V[(i - 1)][j] = 0;
			System.out.println("V[" + (i - 1) + "][" + j + "]");
			star++;
			// System.out.println("V["+(i-1)+"]["+(j)+"]="+"��");

			remove(V, i - 1, j, N);

		}
		if (i < N - 1 && V[(i + 1)][j] == 1) {
			// ��
			V[(i + 1)][j] = 0;
			System.out.println("V[" + (i + 1) + "][" + j + "]");
			// System.out.println("V["+(i+1)+"]["+(j)+"]="+"��");

			star++;
			remove(V, i + 1, j, N);

		}
		if (j > 0 && V[i][(j - 1)] == 1) {
			// ��
			V[i][(j - 1)] = 0;
			// System.out.println("V["+i+"]["+(j-1)+"]="+"��");
			System.out.println("V[" + i + "][" + (j - 1) + "]");

			star++;
			remove(V, i, j - 1, N);

		}
		if (j < N - 1 && V[i][(j + 1)] == 1) {
			// ��
			V[i][(j + 1)] = 0;
			System.out.println("V[" + i + "][" + (j + 1) + "]");
			// System.out.println("V["+i+"]["+(j+1)+"]="+"��");

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
