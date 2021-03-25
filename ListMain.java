package kr.ac.kopo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMain {

	/*
	 *List : 순서(O), 중복(O)
 	구현클래스 : ArrayList, LinkedList
 	
 	주요메소드
 	- add()			: 데이터 입력
 	- get()			: 해당 인덱스에 있는 데이터 추출
 	- remove()		: 데이터 삭제
 	- size()		: 리스트의 전체 데이터 개수
 	- clear()		: 리스트의 전체데이터 삭제
 	- isEmpty()		: 리스트가 비어있는지 체크(true/false)
 	- contains()	: 특정데이터의 존재여부 판단(true/false)
 	- iterator()	: Iterator 객체를 반환
	 */
	public static void main(String[] args) {
	//	List list = new ArrayList();	// 1.5미만의 방식
	//	List<String> list = new ArrayList<String>();	// 1.5버전의 Generic을 사용
	//	List<String> list = new ArrayList<>();			// 1.7버전이후의 Generic방식
		List<String> list = new ArrayList<>();			// 1.7버전이후의 Generic방식
		// List라는 자료구조에 String형 ArrayList를 스트링형으로 넣겠다.
	
		System.out.println("리스트의 총갯수" + list.size());
			// 리스트의 총 갯수, list.size로 파악한다.
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("6"); // 같은 문자열이 들어가는 것을 보아 중복을 허용한다.
		System.out.println("리스트의 총갯수" + list.size());
		// 리스트의 크기를 파악하니 7개가 출력된다.
		/*
		 * list의 전체데이터 출력
		 * 1. index를 이용한 get() 메소드 이용
		 * 2. 1.5버전의 for문 이용
		 * 3. toArray() 메소드 이용
		 * 4. iterator() 메소드 이용
		 */
		
		System.out.println("------get메서드를 이용한 인덱스 출력------");{
			for(int i = 0 ; i < list.size(); i++) {
				System.out.println(list.get(i));
				// get메서드를 받아서 출력받는다. 방식 외우기? get메서드 잘모르겠다.
			}
		}
		System.out.println("--------1.5 for 문을 활용한 출력--------");
			for(String str: list) { // 스트링형 이름 지정, 자료구조 이름 list
				System.out.println(str);
			}
		System.out.println("--------To array를 활용한 출력--------");
			Object []arr =list.toArray();
			System.out.println(Arrays.toString(arr));
			// 리스트를 배열에 넣어줘!! , 리턴타입은 오브젝트이다.
		System.out.println("---------iterator메서드 활용--------");
			Iterator<String> ite = list.iterator();
			while(ite.hasNext())// 이터레이터형 다음이 없을때까지
				System.out.println(ite.next()); // 출력해줘
			/*
			 * iterator의 주요 메서드
			 * hasnext() 추출한 다음 데이터의 존재여부 판단
			 * next() 데이터 추출
			 * 
			 * 
			 * 			 */
			
			
			
		System.out.println("원소의 갯수는 "+ list.size());
		list.clear();
		System.out.println("이후 원소으 ㅣ갯수는"+list.size());
		
		
		/* 전체데이터출력하기
		
		 * 1. 인덱스를 이용한 get() 메서드 사용
		 * 2. 1.5 버젼의 for문
		 * 3. 리스트의 모든 요소들을 배열에 저장해줘!!!라고 할수도 있다. 
		 *   toarray 메소드로 출력한ㄷ.ㅏ
		*/
		
		//System.out.println("getmethod이용한 출력방식");
		//for(int i =0; i < list.size(); i++) {
		//	System.out.println(list.get(i)); // 입력된 순서로 출력
		//}
		// 각각의 요소들이 스트링형이다, 리스트형 아님.
//		for(String str : list) {
//			System.out.println(str);
		/*
		 * 이터레이터 메서드를 사용하여 출력하는방식
		 * 순환자라고 이야기하면서, 
		 * 
		 * 이터레이터(순환자) 주요메서드 다음 데이터접근..
		 * -next() : 데이터를 추출하는것
		 * hasnext는 다음 데이터가 있는지 물어보는것 
		 * 추출한 다음 데이터의 존재여부 판단해주는것
		 * 
		 * 
		 * 
		 * 리스트를 이터레이터를 객체를 ㅅ통해서 출력하고싶은것이다.
		 */
//		list.iterator(); // 스트링타입임
//		Iterator<String> ite = list.iterator(); 
//		// 리스트를 접근하기위한이테러이러
//		
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//			
//		String searchStr = "two";
//		if(list.contains(searchStr)) {
//			System.out.println(searchStr+"은 존재합니다.");
//		}
//		else {
//			System.out.println(searchStr+"은 x.");
//			
//		}
//		boolean bool = list.remove("two");
//		String str =list.remove(0);
//		System.out.println();
//		}
	  List<String> sub = new LinkedList<>();
	  sub.add("봄");
	  sub.add("여름");
	  
	  list.addAll(sub); // 서브도 넣어도 문제없다.
	  
	  System.out.println(list.size());
	  
	  
	  
	  
	  
	  
	  
	}
		
}
