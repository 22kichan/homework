package kr.ac.kopo;


class A{
	
	private Object obj;
	
	public A(Object obj) {
		this.obj = obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public void getObj() {
		return this.obj;
	}
	public void info(Object obj) {
		this.obj = obj
	}


}
//<> 이게 제네릭이고 <T>여기 타입이 들어가면 오브젝트형이 아니라 T형 
class B<T>{
	private  T obj;
	

	
	public A(T obj) {
		this.obj = obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public void getObj() {
		return this.obj;
	
}

public class GenericMain {

	public static void main(String[] args) {
		
		B<String> b01 = new B(new String("Hello")); 
		// 스트링형을 가지 B형 클래스
		B<Random> b02 = new B<Random>(new Random());
		
		
		
		B b01 = new A(new Stirng("hello"));
		B b02 = new A(new Random());
		// 묵시적 형변환으로 가능하다.
		System.out.println("길이를 구하려고 할때" + b01.getObj().length(););
		// 묵시적형변환을 해줄 수 있다./
		// 특징 1개더 
		b01 = new B<02>
		// 이렇게 하면 오류난다 왜나면 b01은 처음 컴파일형이기때문
		a01.obj
		b02.b02
		//
		a02.info();
		
		
		System.out.println(((String)a01.getobj()).length());
		System.out.println(((Random)a02.getobj()).nextInt());
		// 리턴타입이 오브젝트형이여서 에러난다.
		// 이게 안좋다...
		A [] arr = new A[2];
		arr[0] = a01;
		arr[1] = a02;
		// 이러게 하면 스트링 랜덤으로 계속바꾸어주여야한다.
		
		
		
		
		
		
	}

}
