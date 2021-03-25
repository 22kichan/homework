package kr.ac.kopo;

import java.util.Calendar;

public class CalendarUtil {
		// util이 붙으면 
	
	/*
	 * private calendar 
	 */
	
	public void showDayByYear(int year) {
		// 특정년도에 해당하는 만년달력을 출력해야함..
		for(int month =1; month <= 12; month++)		
			showDayByMonth(year, month);
	}
	
	public void showDayByMonth(int year, int month) {
		
		Calendar c = Calendar.getInstance();
		// c가 가져온 정보는 현재정보인데, 받는 년도, 월에 해당하는 결정되어 있어야한다.
		// 이때 set메서드 쓴다. 일은 며칠이 되겠는가?
		c.set(year,month-1,1);//year-month-1로 날짜정보변경한것

		//month /1의 요일 알아야하고
		int week = c.get(Calendar.DAY_OF_WEEK);
		//month의 마지막 날수?
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(year+"년"+ month+"월");
		
		showDay(week, lastDay);
	}
	
	
	private void showDay(int week, int lastDay) {
		// 일반적으로 메서드는 퍼블릭을쓰지만, 이같은 경우는 private써도됨
		// 위크가 1이면 일요일 3이면 화요일에 찍혀야됨.
		System.out.println("-----------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("-----------");
		int cnt = 0;
		for(int i =1; i <week ; i++) {
			System.out.println("\t");
		}
		for(int day =1; day <= lastDay;  day++) {
			System.out.println(day+"\t");
			if(++cnt % 7 == 0)
				System.out.println();
		}
		if(cnt % 7 != 0) {
			System.out.println();
		}
		System.out.println("-----------");
		
	}
	
}











