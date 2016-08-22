package day7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Grade {
	public static void main(String[] args) throws Exception {
		Grade grade = new Grade();
		
		grade.calculateGrade(); 
	}
	
	/*  �̰��� calculateGrade �޼ҵ带 �ۼ��Ͻʽÿ�. */
	public void calculateGrade() throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("src/data3.txt"));
		StringTokenizer stok =null;
		String str=null;
		String name =null;
		
		double avg = 0.0;
		while(true){
			int sum=0;
			str = br.readLine();
			if(str==null) break;
			stok = new StringTokenizer(str);
			name = stok.nextToken();
			while(stok.hasMoreTokens())
				sum += Integer.parseInt(stok.nextToken());
			avg = Math.round(sum/3);
			System.out.println(name+"�� ����� "+avg+"�Դϴ�.");
		}
		br.close();
	}
}
