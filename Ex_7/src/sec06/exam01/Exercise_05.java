package sec06.exam01;

class Product {
	int price;
	int bonusPoint;
	
	Product() {}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class TV extends Product {
	Tv() {}
	
	public String toString() {
		return "TV";
	}
}

public class Exercise_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t = new Tv();
	}
}

// Product Ŭ������ �⺻ ������ Product()�� ���� ������ ������ �߻�
// Product Ŭ������ �⺻ ������ Product�� �߰����ش�.
