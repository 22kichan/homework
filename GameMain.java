package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
	
		int you = 0;
		int Losecount = 0 ;
		int mucount = 0 ;
		int Wincount =0;
	while(true)	{
		//int you = 0;
		//int Losecount = 0 ;
		//int mucount = 0 ;
		//int Wincount =0; 여기는 안된다.
		System.out.println("게임을 선택하세요");
		System.out.println("A. 가위바위보");
		System.out.println("B. 주사위 값 맞추기");
		System.out.println("C. 종료");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0); // 받은 문자열을 문자로 반환
	
		if(ch == 'A'|| ch =='1') {
			Game gm = new ScissorsRockPaper();
			System.out.println("가위바위보 중 하나를 선택하세요 1.가위 2. 바위. 3. 보");
			int you1 = sc.nextInt();
			//sc.nextLine();
			int num = gm.startGame(you1);
			// 몰랐다... 날라오는 num을 받아주자...
			// 여기에 승리이면 누적되는 코드 작성하기, n
				if(num == 1) {
					Wincount++;}
				// num이 1이 출력되면 누적해서 count를 해준다.
				//
				if(num == 0) {
					Losecount++;
						/// 비겼을때는?
								}
			
			}
					// num을 받아주려면 어떻게 하지?
		//만약 if로하게되면 ?
		else if(ch == 'B'|| ch =='2') {
			System.out.println("주사위를 선택하세요(1~6값 중 하나)");
			
			Game gm = new Dice();
			int you21 = sc.nextInt();
			gm.startGame(ch);
			int num = gm.startGame(you21);
			
				if(num == 1) {
					Wincount++;}
				
				if(num == 0) {
					Losecount++;}
			
		
		}
		
		else if(ch == 'C'|| ch =='3') {
			System.out.println("게임을 종료합니다.");
			System.out.printf("당신의 게임전적은 %d승 %d패 %d무",Wincount,Losecount,Losecount);	
				break;}
		
		else {
					System.out.println("다시 입력하세요");
					continue;
							}
		
		}
	}
}
	
