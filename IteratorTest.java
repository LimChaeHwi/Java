package day6;

import java.util.ArrayList;

public class IteratorTest {

	public static void main(String[] args) {

		Board b1 = new Board(1, "첫방문", "핑크공주", "게시판 오픈을 축하합니다.");
		Board b2 = new Board(2, "송년회", "개구리", "메드포 갈릭에서 송년 모임이 있습니다.");
		Board b3 = new Board(3, "졸업작품", "콩쥐", "좋은 날 함께하고 싶습니다.");
		Board b4 = new Board(4, "주문", "동방신기", "시작은 달콤하게 평범하게 나에게 끌려");
		Board b5 = new Board(5, "총맞은것처럼", "백지영", "총 맞은 것처럼 정신이 너무 없어");
		
		// 위에서 생성한 Board 객체를 하나의 Collection안에 생성합니다.
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		// print  메서드를 호출하면서 앞에서 생성한 Collection 객체를 인자로 넘겨줍니다.
		print(list);
	}
	
	public static void print(ArrayList<Board> list){
		//인자로 받는  Collection 안의 객체들의 내용들을 출력해줍니다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNo());
			System.out.println(list.get(i).getSubject());
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getContent());
		}
		
	}

}
