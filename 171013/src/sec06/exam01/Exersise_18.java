package sec06.exam01;

class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	static int cv2 = iv; // cv2�� static �����̱� ������ �ν���Ʈ ������ ����ؼ� �ʱ�ȭ�� �� ����
	
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv); // static �޼��忡���� �ν���Ʈ ���� ����� �Ұ����ϴ�
	}
	
	void instanceMethod1( ) {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		instanceMethod1(); // static �޼��忡�� �ν���Ʈ �޼��� ����� �Ұ����ϴ�
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}

