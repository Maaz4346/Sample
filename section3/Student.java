package section3;

public class Student {
	
		int rollnum;
		String name;
		static int count=1;
		public Student(String name,int rollnum) {
			this.rollnum=rollnum;
			this.name=name;
			
		}
		public static void main(String[] args) {
			Student s=new Student("taqi ",100);
			Student s1=new Student("maaz ",101);
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s.hashCode());	
			System.out.println(s1.hashCode());
			
		}
		@Override
		public String toString() {
			System.out.println("tostring running");
			
			return name+rollnum;
		}
		@Override
		public int hashCode(Object) {
			System.out.println("hash code running");
			return count++;
		
		}
	}
