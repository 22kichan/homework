package kr.ac.kopo.day10.homework;

import java.util.Random;
import java.util.Scanner;

public class ScissorsRockPaper implements Game {
// 클래스가 인터페이스를 상속받을때는 implements키워드를 사용한다.
	
	
	@Override
	public int startGame(int you) {
		
		
		int num =0;
		int me = (int)((Math.random()*3)+1);
		// you를 메서드로 받기..
		if(me == you) {
			System.out.println("비겼습니다.");
			num =0;
		}
		if((me == 1) && (you == 3)) {
			System.out.println("You Lose");
			num =0;
		}
		if((me == 1) && (you == 2)) {
			System.out.println("You Win");
			num =1;
		}
		if((me == 2) && (you == 1)) {
			System.out.println("You Lose");
			num =0;
		}
		if((me == 2) && (you == 3)) {
			System.out.println("You Win");
			num =1;
		}
		if((me == 3) && (you == 1)) {
			System.out.println("You Win");
			num =1;}
//		if((me == 3) && (you == 1)) {
//			System.out.println("You Lose");
//			num =0;
//		}
		return num;
		// you win이 출력되면 1을 저장
		// 비긴경우 0, 진경우 0 반영
		}
}