package day3_3;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(1);
	}
	public static void gugudan(int num){
		if(num<2||num>9){
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}
		for(int i = 1; i<=9; i++){
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
