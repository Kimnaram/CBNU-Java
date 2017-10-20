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
	int num; // ī���� ����
	boolean isKwang; // ���̸� true, �ƴϸ� false
	
	SutdaCard() {
		this(1, true);
	} // ����Ʈ ������
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	} // �����ִ� ������
	
	String info() {
		return num + (isKwang? "k" : "");
		// true�� ���ε�, card2�� ���ھ��� �����ڷ� �ʱ�ȭ�ȴ�. num = 1�� isKwang = true�� �ʱ�ȭ�ǹǷ� ���̴�
	}
}

