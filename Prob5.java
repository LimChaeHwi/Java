package day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class Prob5 {
	public static void main(String[] args) throws Exception {
		calcScore("src/input5.txt", "src/output5.txt");
	}

	private static void calcScore(String inputFile, String outputFile) throws Exception {
		// 구현하세요.
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		FileWriter fw = new FileWriter(outputFile);
		StringTokenizer stok =null;
		String str=null;
		String name =null;
		
		int avg = 0;
		while(true){
			int sum=0;
			str = br.readLine();
			if(str==null) break;
			stok = new StringTokenizer(str,":/",false);
			name = stok.nextToken();
			while(stok.hasMoreTokens())
				sum += Integer.parseInt(stok.nextToken());
			avg = sum/3;
			fw.write(name+" 의 평균 : "+avg+"\n");
			System.out.println(name+" 의 평균 : "+avg);
		}
		br.close();
		fw.close();
	}
}