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
			System.out.println("사번 입력(예)A1010 : ");
			empNO = in.readLine();
			System.out.println("이름 입력(예)박문석 : ");
			name = in.readLine();
			System.out.println("부서 입력(예)기획 : ");
			part = in.readLine();
			System.out.println("직책 입력(예)사원-1, 대리-2, 과장-3 : ");
			position = in.readLine();
		}catch (Exception e ) {
			System.out.println("입력 오류");
		}
		if(position.equals("1")) {
			emp = new Employee(empNO, name, part);
			result += emp.resultStr();
		} else {
			position = (position.equals("2")) ? "대리" : "과장";
					mng = new Manager(empNO, name, part, position);
		}
			
			System.out.println(result);
	}

}
