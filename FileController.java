package day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Stack;

public class FileController {
	public void reverseLine(String oldf , String newf) throws Exception{
		
		//reverseLine 메소드 구현
		Stack<String> stack = new Stack<String>();
		FileReader fr = new FileReader(oldf);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(newf);
		String str = null;
		while(true){
			str = br.readLine();
			if(str==null) break;
			stack.push(str+"\n");
		}
		while(true){
			fw.write(stack.pop());
			if(stack.isEmpty()) break;
		}
		fw.close();
		br.close();
	}	
	public static void main(String[] args) throws Exception{
		FileController fc = new FileController();
		fc.reverseLine("src/source.txt", "src/sourceout.txt");
	}
}
