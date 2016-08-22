package day7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Prob3 {
	public static void main(String[] args) throws Exception{
		Prob3 p3 = new Prob3();
		Vector scores = p3.getScore("src/data.txt");
		for(int i=0; i<scores.size(); i++){
			Score score = (Score)scores.get(i);
			System.out.println(score.getName()+" : "+score.getKor()+" "+score.getEng()+" "+score.getMath()+" "+score.getSum() );
		}

	}
	
	public Vector getScore(String fileName)throws Exception{
		// 이 부분을 구현하시오.
		Vector list = new Vector();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String str = null;
		String c[] = null;
		int sum =0;
		while(true){
			str = br.readLine();
			if(str==null)break;
			c=str.split("/");
			
			sum = Integer.parseInt(c[1])+Integer.parseInt(c[2])+Integer.parseInt(c[3]);
			list.add(new Score(c[0],Integer.parseInt(c[1]),Integer.parseInt(c[2]),Integer.parseInt(c[3]),sum));
			
		}
		br.close();
		return list;
	}
	
	
}


class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	public Score(String name, int kor, int eng, int math, int sum) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
	
}