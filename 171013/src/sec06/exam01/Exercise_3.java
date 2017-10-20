package sec06.exam01;

public class Exercise_3 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("ÀÌ¸§ : " + s.name);
		System.out.println("ÃÑÁ¡ : " + s.get_Total());
		System.out.println("Æò±Õ : " + s.get_Average());

		Student s1 = new Student("È«±æµ¿", 1, 1, 100, 60, 76); // º¹»ç»ý¼ºÀÚ
			
		System.out.println(s.info());

	}
}
	class Student {
		public String name;
		public int ban;
		public int no;
		public int kor;
		public int eng;
		public int math;
		
		public Student() {
			name = " ";
			no = 0;
			kor = 0;
			eng = 0;
			math = 0;
			}
		
		public Student(String name, int ban, int no, int kor, int eng, int math) {
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		public int get_Total() {
			int sum;
			sum = kor + eng + math;
			return sum;
			}
		
		public float get_Average() {
			int sum;
			sum = get_Total();
			return (int) (sum / 3f * 10 + 0.5f) / 10f;
			}
		
		String info() {
			return name + ","+ ban + "," + no + "," + kor
					+ "," + eng + "," + math + "," + get_Total() + "," + get_Average();
		}
		}
	