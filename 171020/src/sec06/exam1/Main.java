package sec06.exam1;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terran marine = new Terran();
		marine.attack();
		Protoss dragon = new Protoss();
		dragon.attack();
		Zerg hydralisk = new Zerg();
		hydralisk.attack();
		
		System.out.println("====��ü ����ȯ�� �������̵��� �̿�====");
		Starcraft obj = new Terran();
		
		obj.attack();
		obj = new Protoss();
		obj.attack();
		obj = new Zerg();
		obj.attack();
		obj = new Starcraft();
		obj.shot();
	}
}