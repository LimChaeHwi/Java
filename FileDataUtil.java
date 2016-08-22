package day7;
import java.io.*; 

public class FileDataUtil { 

	// main 메서드는 수정하지 마세요.
	public static void main(String[] args) throws Exception {		
		FileDataUtil fdu = new FileDataUtil();		
		fdu.dataCheck("./src/data1.txt", "./src/data2.txt", "./src/output.txt");
	}
	
	
	public void dataCheck(String file1 , String file2, String file3) throws Exception{
		
		// 구현하세요~ ---------------------------------------------------
		// 비교 대상 파일인 file1 과 file2 에는 문자열 데이터의 라인수가 같다고 가정합니다~!!
		FileReader fr1 = new FileReader(file1);
		BufferedReader br1 = new BufferedReader(fr1);
		FileReader fr2 = new FileReader(file2);
		BufferedReader br2 = new BufferedReader(fr2);
		FileWriter fw = new FileWriter(file3);
		String str1=null;
		String str2=null;
		int cnt =0;
		while(true){
			str1 = br1.readLine();
			str2 = br2.readLine();
			if(str1==null||str2==null) break;
			System.out.println(str1+" "+str2);
			if(str1.length()==str2.length()){
				cnt++;
				fw.write("Line "+cnt+" : Equal \n");
				
			}else{
				cnt++;
				fw.write("Line "+cnt+" : Not Equal \n");
				
			}			
		}
		fw.close();
		br2.close();
		br1.close();
		// --------------------------------------------------------------
		
	}	

}

