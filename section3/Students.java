package section3;


	public class Students {
		int rollnum;
		String name;
		public Students(String name,int rollnum) {
			this.rollnum=rollnum;
			this.name=name;
			
		}
		public static void main(String[] args) {
			Students s=new Students("taqi ",100);
			Students s1=new Students("maaz ",101);
			System.out.println(s);
			System.out.println(s1);
		}
		@Override
		public String toString() {
			return name+rollnum;
		}
		

	}