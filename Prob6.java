package day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Prob6 {
	public static void main(String[] args) {
		Prob6 p = new Prob6();
		String movieName = "���� ����";
		String movieStar = p.getMovieStar(movieName);
		System.out.println(movieStar);
		
		movieName = "�±ر� �ֳ�����";
		movieStar = p.getMovieStar(movieName);		
		System.out.println(movieStar);
	}

	public String getMovieStar(String movieName){
		BufferedReader br = null;
		String result = "��ȭ������ �����ϴ�.";
		String str = null;
		StringTokenizer stok =null;
		int year ;
		String movie;
		try{
			// TODO �̺κ��� �ۼ�
			br = new BufferedReader(new FileReader("src/movie.txt"));
			while(true){
				String name = "";
				str = br.readLine();
				if(str==null) break;
				stok = new StringTokenizer(str,",",false);
				movie = stok.nextToken();
				year = Integer.parseInt(stok.nextToken());
				while(stok.hasMoreTokens())
					name = stok.nextToken();
				if(movie.equals(movieName))
					result = name;
			}
			br.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{ if(br != null) br.close(); }catch(Exception e){}
		}
		return result;
	}
}



















