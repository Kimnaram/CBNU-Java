package sec06.exam01;

public class DoWhileTest_170922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		do {
			a++; // a++이므로 나중에 1 증가
			System.out.println("a =" +a); // 그렇기 때문에 a가 0일 때, 1로 출력
		}
		while(a < 10); // a가 9일 때, 10까지 출력되고 a가 10이 되므로 끝
	}

}
