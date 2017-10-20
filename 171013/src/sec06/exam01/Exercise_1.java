package sec06.exam01;

public class Exercise_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	int num; // 카드의 숫자
	boolean isKwang; // 광이면 true, 아니면 false
	
	SutdaCard() {
		this(1, true);
	} // 디폴트 생성자
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	} // 인자있는 생성자
	
	String info() {
		return num + (isKwang? "k" : "");
		// true면 광인데, card2는 인자없는 생성자로 초기화된다. num = 1로 isKwang = true로 초기화되므로 광이다
	}
}

