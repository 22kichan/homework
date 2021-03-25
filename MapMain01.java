package kr.ac.kopo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapMain01 {
	
	/*
	 * Map : key value로 쌍으로 구성된 데이터의 집합, 키는 중복이 안된다.
	 * key는 순서도 없다.
	 * 구현 클래스는  해쉬맵 트리맵이다.
	 */
	public static void main(String[] args) {
		//<
		Map<String, String> map = new HashMap<>();
		map.put("AAAA", "1111");
		map.put("BBBB", "2222");
		map.put("CCCC", "3333");
		map.put("DDDD", "4444");
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 변경 서비스 입니다. :" );
		System.out.println("id를 입력하세요");
		String id = sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 아이디"+id+"는 존재 x");
			System.out.println("종료");
			System.exit(0);
		}
		System.out.println("현재 비밀번호 입력하세요");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 달라요");
			System.out.println("종료");
			System.exit(0);}
		
		System.out.println("변경할 password를 입력하세요");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("password변경되었습니다.");
		
		System.out.println("<<전체 회원 정보출력>>");
		Set<Entry<String, String>> entrySet  = map.entrySet();// set형이 리턴된다.
		for(Entry<String, String> e:entrySet ) {
			System.out.println(e.getKey() + "비밀"+e.getValue());
		}
		
		 Set<String> keys = map.keySet();
		 for(String key : keys) {
			 System.out.println(key + map.get(key));
		 }
	//  맵에 키들을 모아서 set으로 변환해주고	
		// 이건 엔트리형으 ㄹ뽑아서 한거지만, key를 알면 get메서드 값을 알 수있다.
		// map에 있는 key들을 뽑아서 set으로 반환해줘
		
		
		
		// set은 중복된 data가 있다. 하지만 map은 key에 대한 중복을 허용하지 않음.
		// 덮어쓰게 된다. 동일한 key가 있을경우
		
		
		// 문자열 비교는 == 안된다. equals로 비교하자
		
		
	}

}
