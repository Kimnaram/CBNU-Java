package sec06.exam01;

class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	static int cv2 = iv; // cv2는 static 변수이기 때문에 인스턴트 변수를 사용해서 초기화할 수 없다
	
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv); // static 메서드에서는 인스턴트 변수 사용이 불가능하다
	}
	
	void instanceMethod1( ) {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		instanceMethod1(); // static 메서드에서 인스턴트 메서드 사용이 불가능하다
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}

