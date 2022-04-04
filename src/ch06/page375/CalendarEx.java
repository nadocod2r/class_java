package ch06.page375;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		
	}
	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		printCalendar("현재", now);
		
		Calendar firstDate=Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2022, 11, 11);
		
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트한 날은 ", firstDate);
	}
}
