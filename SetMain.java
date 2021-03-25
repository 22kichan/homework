package kr.ac.kopo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	
	
	/*
	 * set 순서x 중복 x
	 * 검색속도가 빠르다.
	 * 구현클래스에는 : hashset treeset
	 */
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		// 문자입력에는 사전순으로 a-z순으로 출력된다.
		boolean bool = set.add("one");
		System.out.println("원 데이터 삽입여부"+ (bool ? "성공 ": "실패"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one"); // one은 왜 안나오냐 중복을 허용하지 안흔다.
		// 중복데이터 적용할경우 false가 나온다.
		/*
		 * set의 전체데이터 출력방식
		 * 1. 1.5버젼의 for문은 사용가능
		 * 2. 이터레이터
		 * 3. 투어레이 메서드이용하기		
		 */
	System.out.println("1,5for문사용");
	
	for(String str : set) {
		System.out.println(str);
	}
		
		/*
		 * iterlator이용
		 */
	Iterator<String> ite = set.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
		// 다음데이터가 없을때까지 찍어라
	}
	
	System.out.println("toarray메서드 이용");
	Object[] arr = set.toArray();
	System.out.println(Arrays.toString(arr));
		
		
	}
	
	
}
