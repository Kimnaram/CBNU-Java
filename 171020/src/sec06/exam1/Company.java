package sec06.exam1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Company {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		Employee emp = null;
		Manager mng = null;
		String empNO = null;
		String name = null;
		String part = null;
		String position = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("��� �Է�(��)A1010 : ");
			empNO = in.readLine();
			System.out.println("�̸� �Է�(��)�ڹ��� : ");
			name = in.readLine();
			System.out.println("�μ� �Է�(��)��ȹ : ");
			part = in.readLine();
			System.out.println("��å �Է�(��)���-1, �븮-2, ����-3 : ");
			position = in.readLine();
		}catch (Exception e ) {
			System.out.println("�Է� ����");
		}
		if(position.equals("1")) {
			emp = new Employee(empNO, name, part);
			result += emp.resultStr();
		} else {
			position = (position.equals("2")) ? "�븮" : "����";
					mng = new Manager(empNO, name, part, position);
		}
			
			System.out.println(result);
	}

}
