package sec06.exam01;

public class ElseifTest_170922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu = 140;
		if(jumsu >= 90 && jumsu < 100) {
			System.out.println("당신의 학점은 A입니다.");
		}
		else if(jumsu >= 80 && jumsu < 70) {
			System.out.println("당신의 학점은 B입니다.");
		}
		else if(jumsu >= 70 && jumsu < 60) {
			System.out.println("당신의 학점은 C입니다.");
		}
		else if(jumsu >= 60 && jumsu < 50) {
			System.out.println("당신의 학점은 D입니다.");
		}
		else if(jumsu >= 0 && jumsu < 50) {
			System.out.println("당신의 학점은 F입니다.");
		}
		else {
			System.out.println("잘못된 점수입니다. 0 이상 100 이하의 점수를 입력해주세요.");
		}
	}

}
