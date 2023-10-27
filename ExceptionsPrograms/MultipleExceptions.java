package ExceptionsPrograms;

public class MultipleExceptions extends Program {
	public static void main(String[] args) {
		// ArithmeticException
		int a = 10;
		int b = 5;

		// Null Pointer Exception
		String s = "Apple";

		// ArrayIndexOutOfBoundsException
		int e[] = { 1, 2, 3, 4, 5 };

		// StringIndexOutOfBoundsException
		String game = "Foot ball";

		// ClassCastException
		Program p = new Program();

		try {
			int res = a / b;
			System.out.println(res);
			System.out.println(s.toUpperCase());
			for (int i = 0; i < e.length; i++) {
				System.out.print(e[i] + " ");
			}
			System.out.println();
			System.out.println(game.charAt(8));
			MultipleExceptions me = (MultipleExceptions) p;
		} catch (ArithmeticException g) {
			System.out.println("Don't divide by zero");
		} catch (NullPointerException g) {
			System.out.println("Don't use null in the operations");
		} catch (ArrayIndexOutOfBoundsException g) {
			System.out.println("Try to access the elements within the limit");
		} catch (StringIndexOutOfBoundsException g) {
			System.out.println("Try to access the String wihtin the limit");
		} catch (ClassCastException g) {
			System.out.println("Don't downcast without upcasting");
		} catch (Exception g) {
			System.out.println("Something went wrong");
		} catch (Throwable g) {
			System.out.println("Something went wrong");
		}
	}
}