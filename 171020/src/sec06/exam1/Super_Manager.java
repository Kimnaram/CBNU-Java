package sec06.exam1;

class Manager extends Employee {
	private String position;
	
	public Manager(String empNO, String name, String part, String position) {
		super(empNO, name, part);
		this.position = position;
	}
	
	public String addStr() {
		String result = "";
		result += "Á÷Ã¥" + position + "\n";
		return result;
	}
}