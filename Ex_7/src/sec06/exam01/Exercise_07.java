package sec06.exam01;

class Parent {
	int x = 100;
	
	Parent() {
		this(200);
	}
	Parent(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;
	
	Child() {
		this(1000);
	}
	
	Child(int x) {
		this.x = x;
	}
}

public class Exercise_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		
		System.out.println("x = " + c.getX());
	}
}
// 호출되는 생성자의 순서 : Child() -> Child(int x) -> Parent() -> Parent(int x) -> Object()
// x = 200