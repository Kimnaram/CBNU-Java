package sec06.exam01;

public class BreakContinue_170922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				break; // break는 아예 조건이 만족되면 for문을 나오기 때문에 i가 3일 때, 조건문을 빠져나와 sum이 3이 된다.
			}
			sum += i;
		}
		System.out.println("Break Sum의 합" + sum);
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue; // continue는 조건이 만족되더라도 for문을 계속 돌리기 때문에 조건을 만족하는 i가 계속 더해져서 sum이 37이 된다
			}
			sum += i;
		}
		System.out.println("Continue Sum의 합" + sum);
	}

}
