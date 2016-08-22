package day7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;


public class Prob2{
	public static void main(String args[]) throws Exception{
		Prob2 e = new Prob2();
		Vector scores = e.getList();
		for(int i=0; i<scores.size(); i++){
//			Pass pass = (Pass)scores.get(i);
//			System.out.println(pass.name+", "+pass.subject+", "+pass.point+", "+pass.pass);
			System.out.println(scores.get(i));			
		}
	}
 
	public Vector getList() throws Exception{
		// 구현하세요.
		Vector list = new Vector();
		Vector list2 = new Vector();
		BufferedReader br = new BufferedReader(new FileReader("./src/list.txt"));

		String pass = null;
		String c[] = null;
		String read ;
		while(true){
			read = br.readLine();
			if(read ==null) break; 
				
			c = read.split("/");
			if((c[1].equals("JAVA")||c[1].equals("java"))&&Integer.parseInt(c[2])>=80){
				pass = "수료";
			}else if((c[1].equals("SQL")||c[1].equals("sql"))&&Integer.parseInt(c[2])>=90){
				pass = "수료";
			}else{
				pass = "미수료";
			}
//			System.out.println(c[0]+c[1]+c[2]+pass);
			list.add(new Pass(c[0],c[1],Integer.parseInt(c[2]),pass));
		}
		
		for(int i =0;i<list.size();i++){
			Pass p = (Pass)list.get(i);
			list2.add(p.name+","+p.subject+","+p.point+","+p.pass);
			
		}
		
		br.close();
		return list2;
	}
}
class Pass {
	String name;
	String subject;
	int point;
	String pass;
	
	public Pass(String name, String subject, int point, String pass){
		this.name = name;
		this.subject = subject;
		this.point = point;
		this.pass = pass;
	}

}