package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaJa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڼ���: ");
		String str = sc.nextLine();
		sc.close();
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("�����ұ�", "����ĥ���� ��ġ�� ���� �Ͱ� ����.");
		map.put("�����ϻ�", "������� ������ ������ ��Ƴ���.");
		map.put("�ݻ�÷ȭ", "�������ٰ� �������� �� ���Ĵ�.");
		map.put("��������", "������ �����ϰ� ���� �����.");
		map.put("�ݽ��ʹ�", "������ ó������ ����.");
		map.put("�������", "�ѹ� ���� ���μ��� �������� ���Ѵ�.");
		if(map.containsKey(str))
			System.out.println(map.get(str));
		else	
			System.out.println("Ű�� �������� �ʽ��ϴ�.");
		
	}

}
