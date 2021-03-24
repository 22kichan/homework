package kr.ac.kopo.day10.homework;

import java.util.Random;

public class Dice implements Game {
/* 처음 클래스 Dice를 인터페이스를 상속받을경우
	예외가 발생하는데, 컴파일 시점의 에러이다.
	해결방안은, 클래스가 game의 오버라이드 하거나
	*오버라이드 : 상속받은 메서드를 변경
	*오버로딩 : 기존에 없는 새로운 메서드를 정의
	*Dice 클래스를 추상화클래스로 만들어주어야한다.
	*/
	Random r = new Random();
	
	
	@Override
	public int startGame(int you) {
		int num = 0;
		int me = (int)((Math.random()*6)+1);
		
		if(me == you) {
			System.out.println("You Win");
			num =1;
		}
		else {
			System.out.println("You lose");
			num = 0;
		}
		return num;
	}

}