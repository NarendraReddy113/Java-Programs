package programs;

public class Program {

	//Static variable
		static int a;
		
		static int b=10;
		
		static {
			System.out.println(b);
		}
		
		public static void main(String[] args) {
			int a=4;
			Program.a=6;
			System.out.println(a);
		}
	
}
