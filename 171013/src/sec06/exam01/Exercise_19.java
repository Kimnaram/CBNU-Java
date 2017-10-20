package sec06.exam01;

public class Exercise_19 {
	
	public static void change(String str) {
		str += "456";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change :" + str);
	}
}

// 실행결과 : ABC123
// After change : ABC123