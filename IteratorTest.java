package day6;

import java.util.ArrayList;

public class IteratorTest {

	public static void main(String[] args) {

		Board b1 = new Board(1, "ù�湮", "��ũ����", "�Խ��� ������ �����մϴ�.");
		Board b2 = new Board(2, "�۳�ȸ", "������", "�޵��� �������� �۳� ������ �ֽ��ϴ�.");
		Board b3 = new Board(3, "������ǰ", "����", "���� �� �Բ��ϰ� �ͽ��ϴ�.");
		Board b4 = new Board(4, "�ֹ�", "����ű�", "������ �����ϰ� ����ϰ� ������ ����");
		Board b5 = new Board(5, "�Ѹ�����ó��", "������", "�� ���� ��ó�� ������ �ʹ� ����");
		
		// ������ ������ Board ��ü�� �ϳ��� Collection�ȿ� �����մϴ�.
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		// print  �޼��带 ȣ���ϸ鼭 �տ��� ������ Collection ��ü�� ���ڷ� �Ѱ��ݴϴ�.
		print(list);
	}
	
	public static void print(ArrayList<Board> list){
		//���ڷ� �޴�  Collection ���� ��ü���� ������� ������ݴϴ�.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNo());
			System.out.println(list.get(i).getSubject());
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getContent());
		}
		
	}

}
