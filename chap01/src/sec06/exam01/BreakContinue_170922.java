package sec06.exam01;

public class BreakContinue_170922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				break; // break�� �ƿ� ������ �����Ǹ� for���� ������ ������ i�� 3�� ��, ���ǹ��� �������� sum�� 3�� �ȴ�.
			}
			sum += i;
		}
		System.out.println("Break Sum�� ��" + sum);
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue; // continue�� ������ �����Ǵ��� for���� ��� ������ ������ ������ �����ϴ� i�� ��� �������� sum�� 37�� �ȴ�
			}
			sum += i;
		}
		System.out.println("Continue Sum�� ��" + sum);
	}

}
