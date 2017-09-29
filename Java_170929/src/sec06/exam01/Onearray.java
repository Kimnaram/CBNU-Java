package sec06.exam01;

public class Onearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar = {10, 20, 30}; // 정수 배열 ar 선언 원소는 10, 20, 30
		for(int i = 0; i< ar.length; i++) { // 반복문, i를 0에서 배열 ar의 길이만큼 i++
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
	}

}
