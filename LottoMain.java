package kr.ac.kopo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 로또 게임");
		System.out.println("게임 수를 입력하세요.:");
		int num = sc.nextInt();
		
		Random rn = new Random();
		ArrayList<String> list = new ArrayList();
		// list에 랜덤숫자를 배열로 받아서 저장하기
		
		
		int num1 = (int)((Math.random()*44)+1);
		// 1. 숫자를 랜덤으로 생성하고, 2. 들어가게 하는 list를 생성한다.
		// 3. 중복된 숫자가 나오면 제거하고 다시 입력한다.
		
		
		
		

	}

}
