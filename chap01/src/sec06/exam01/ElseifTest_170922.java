package sec06.exam01;

public class ElseifTest_170922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu = 140;
		if(jumsu >= 90 && jumsu < 100) {
			System.out.println("����� ������ A�Դϴ�.");
		}
		else if(jumsu >= 80 && jumsu < 70) {
			System.out.println("����� ������ B�Դϴ�.");
		}
		else if(jumsu >= 70 && jumsu < 60) {
			System.out.println("����� ������ C�Դϴ�.");
		}
		else if(jumsu >= 60 && jumsu < 50) {
			System.out.println("����� ������ D�Դϴ�.");
		}
		else if(jumsu >= 0 && jumsu < 50) {
			System.out.println("����� ������ F�Դϴ�.");
		}
		else {
			System.out.println("�߸��� �����Դϴ�. 0 �̻� 100 ������ ������ �Է����ּ���.");
		}
	}

}
