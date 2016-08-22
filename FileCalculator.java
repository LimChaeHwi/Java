package day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCalculator {

	public static void main(String[] args) throws Exception{
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("./src/calc.txt");
	}
	public void addCalculateResult(String inputFileName) throws Exception {
		FileReader fr = new FileReader(inputFileName);
		BufferedReader br = new BufferedReader(fr);
		
		String str = null;
		String str2 = "";
		int sum =0;
		int mul =1;
		while(true){
			
			str = br.readLine();
			
			if(str==null) break;
			sum += Integer.parseInt(str);
			mul *= Integer.parseInt(str);
			
			str2 +=str+"\n"; 
		}
		FileWriter fw = new FileWriter(inputFileName);
		
		fw.write(str2+sum+"\n"+mul);
		
		fw.close();
		br.close();
	}
}