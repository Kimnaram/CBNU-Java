package sec06.exam01;

class PlayingCard {
	int kind;
	int num;
	
	static int width;
	static int height;

	PlayingCard(int k, int n) {
	kind = k;
	num = n;
	}
}

public class Exercise_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayingCard card = new PlayingCard(1, 1);
	}
}

// Ŭ���� ���� : width, height
// �ν���Ʈ ���� : kind, num
// �������� : k, n, card