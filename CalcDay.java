package day3_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalcDay {
	public static void main(String[] args){
		System.out.println("3���� "+calcDay(3)+" �ϱ��� �ֽ��ϴ�.");
		System.out.println("2���� "+calcDay(2)+" �ϱ��� �ֽ��ϴ�.");
		System.out.println("13���� "+calcDay(13)+" �ϱ��� �ֽ��ϴ�.");
	}
	public static int calcDay(int month){
		Calendar cal = Calendar.getInstance();
		cal.set(2016, month-1, 1);
		int day = cal.getActualMaximum(cal.DAY_OF_MONTH);
		if(month>12){
			return 0;
		}else if(month==2){
			return 28;	//���� ������� �ʰ�
		}else{
			return day;
		}
	}
}
