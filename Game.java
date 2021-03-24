package kr.ac.kopo.day10.homework;

import java.util.Random;

public interface Game {
	// 인터페이스의 키워드 interface {}으로 선언
	public static final int SCISSOR =1;
	public static final int ROCK =2;
	public static final int PAPER =1;
	/*
	 * 인터페이스의 변수는 무조건 상수로 선언되면서,
	 * final로 선언된다., 하지만 앞에 public static는
	 * 생략되어 있다. 
	 */
	
	/*
	 * 선언되는 메소드는 모두 추상메서드로 적용한다.
	 * void print(); 
	 * 앞에 abstract가 생략되어있지만, 
	 * 붙여주자.
	 * 
	 */
	// Random r = new Random();
	abstract int startGame(int you);
	
	

}