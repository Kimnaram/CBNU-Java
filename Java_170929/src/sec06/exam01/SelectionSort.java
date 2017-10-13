package sec06.exam01;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[] = {20, 30, 40, 50, 10};
		int i, j, temp;
		System.out.println("정렬 전");
		for(i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 데이터" + test[i]);
		}
		for(i = 0; i < 4; i++) {
			for(j = i+1; j < 5; j++) {
				if(test[i] < test[j]) // 만약 test[i]보다 test[j]가 크다면 값을 스왑
				{
					temp = test[i];
					test[i] = test[j];
					test[j] = temp;
				}
			}
		}
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("정렬 후");
		for(i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 데이터" + test[i]);
		}
	}

}
