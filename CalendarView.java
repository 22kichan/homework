package kr.ac.kopo;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc;
	
	public CalendarView () {
		sc = new Scanner(System.in);
		// 스캐너 객체를 생성자에서 만들어줌
	}
	
	
	private int getInt(String msg) {
		System.out.println(msg);
		int no = sc.nextInt();
		sc.nextInt();
		return no;
		}
	
	public void process(){
		// 선택하는 코드 입력하기
		int command = getInt("항목을 선택하세요(1.특정년도 2. 특정월 3. 종료");
		CalendarUtil util = new  CalendarUtil();		
		int year, month;
		// getInput이란?
		
		while(true) {
		
			switch(command) 
			{
			
				year = getInt("년도를 입력하세요");
				case 1:
					year = getInt("년도를 입력하세요");
					util.showDayByYear();
					System.out.println("1번선택");
					break;
				case 2:
					year = getInt("년도를 입력하세요");
					month = getInt("월을 입력하세요");
					util.showDayByMonth(year, month);
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0); // 활용제한자 static exit는 시스템의 클래스
					//break loop; // 한번에 여러개 브레이스빠져나올때 이름을 붙인다.
				}
			}
			
		
		}
}
	
	

	
	

