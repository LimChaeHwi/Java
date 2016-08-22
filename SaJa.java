package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaJa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("사자성어: ");
		String str = sc.nextLine();
		sc.close();
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("과유불급", "지나칠것은 미치지 못한 것과 같다.");
		map.put("구사일생", "죽을고비를 여러번 겪으며 살아나다.");
		map.put("금상첨화", "좋은데다가 좋은것을 더 보탠다.");
		map.put("감지덕지", "감사히 생각하고 고맙게 여긴다.");
		map.put("금시초문", "이제야 처음으로 들음.");
		map.put("낙장불입", "한번 발을 들인순간 물러나지 못한다.");
		if(map.containsKey(str))
			System.out.println(map.get(str));
		else	
			System.out.println("키가 존재하지 않습니다.");
		
	}

}
