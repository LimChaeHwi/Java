package day3_3;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact(5);
	}
	public static void fact(int num){
		int fact = 1;	//���� ��ų ����
		if(num<2||num>9){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}
		for(int i = 1; i<=num ; i++){
			System.out.println(i+" ! = "+fact*i);
			fact*=i;
		}
	}

}
