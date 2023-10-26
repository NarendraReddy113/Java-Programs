package Array_StringPrograms;

public class StringProgram {
	public static void main(String[] args) {
		// To find number of vowels in a String
		String s = "JavaDeveloper";
		String s1 = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		System.out.println("Number of vowels are " + count);

		// To count the numbers in a String
		String str = "java12dev345";
		int count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				count1++;
			}
		}
		System.out.println("There are " + count1 + " numbers in a String");

		// To check if the String is Palindrome or not
		String ss = "madam";
		System.out.println(Palindrome(ss) ? "Palindrome" : "Not a Palindrome");
	}

	static boolean Palindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) == s.charAt(end)) {
				start++;
				end--;
			}
		}
		if ((s.length() % 2 == 0 && start == end + 1) || start == end) {
			return true;
		}
		return false;
	}

}
