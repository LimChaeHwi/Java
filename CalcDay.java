package day3_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalcDay {
	public static void main(String[] args){
		System.out.println("3월은 "+calcDay(3)+" 일까지 있습니다.");
		System.out.println("2월은 "+calcDay(2)+" 일까지 있습니다.");
		System.out.println("13월은 "+calcDay(13)+" 일까지 있습니다.");
	}
	public static int calcDay(int month){
		Calendar cal = Calendar.getInstance();
		cal.set(2016, month-1, 1);
		int day = cal.getActualMaximum(cal.DAY_OF_MONTH);
		if(month>12){
			return 0;
		}else if(month==2){
			return 28;	//윤년 고려하지 않고
		}else{
			return day;
		}
	}
}
