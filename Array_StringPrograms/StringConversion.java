package Array_StringPrograms;

public class StringConversion {
	public static void main(String[] args) {
		// Hello World to Heyyy Wyryd
		char a[] = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'l' || a[i] == 'o') {
				a[i] = 'y';
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		String str = "Hello World";
		String s1 = "";
		for (int i = 0; i < str.length(); i++)// Hello World
		{
			if (str.charAt(i) == 'o' || str.charAt(i) == 'l')
				s1 = s1 + 'y';// s1=yyyyy
			else
				s1 = s1 + str.charAt(i);// s1=He Wrd
		}
		System.out.println(s1);// Heyyy Wyryd

		System.out.println();
		// Hello Worllod
		String s = "Hello Worllod";
		String a1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'l' && s.charAt(i + 1) == 'l') {
				a1 += 'y';
				i++;
			} else if (s.charAt(i) == 'o') {
				a1 += 'y';
			} else {
				a1 += s.charAt(i);
			}
		}
		System.out.println(a1);
		System.out.println();

		// Hello Worllod
		String s2 = "Hello Worllod";
		String res = "";
		int start = 0;
		int end = s2.length();
		while (start < end) {
			if (s2.charAt(start) == 'l' && s2.charAt(start + 1) == 'l' && s2.charAt(start + 2) == 'o') {
				res = res + "yy";
				start = start + 3;
			} else {
				res = res + s2.charAt(start);
				start = start + 1;
			}
		}
		System.out.println(res);

	}
}