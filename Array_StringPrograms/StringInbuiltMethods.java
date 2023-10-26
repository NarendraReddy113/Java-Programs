package Array_StringPrograms;

public class StringInbuiltMethods {
	public static void main(String[] args) {
		String name = "Independance";
		String names = name.toUpperCase();
		System.out.println(names);

		String names1 = names.toLowerCase();
		System.out.println(names1);

		String s1 = "Apple";
		String s2 = s1.concat("Mango");
		System.out.println(s2);

		String s3 = " Cakes ,Cookies & Ice Creams ";
		String s4 = s3.trim();
		System.out.println(s4);

		String str = "Chocolates";
		String str1 = str.substring(5);
		String str2 = str.substring(0, 5);
		System.out.println(str1);
		System.out.println(str2);

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(alphabet.charAt(15));
		System.out.println(alphabet.charAt(1));

		int index = alphabet.indexOf('W');
		int index1 = alphabet.indexOf('a');
		System.out.println(index);
		System.out.println(index1);

		int index2 = alphabet.indexOf('Y', 23);
		System.out.println(index2);

		String freedom = "Independance";
		int lastIdx = freedom.lastIndexOf('e');
		int lastIdx1 = freedom.lastIndexOf('d');
		System.out.println(lastIdx);
		System.out.println(lastIdx1);

		String l = "Ram Kumar";
		System.out.println(l.length());

		String strs = "Apple";
		System.out.println(strs.equalsIgnoreCase("apple"));

		String nothing = "";
		System.out.println(nothing.isEmpty());

		String present = "Independance";
		System.out.println(present.contains("n"));
		System.out.println(present.contains("i"));

		String character = "Boxing";
		char ch[] = character.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		String s = "Today is Independance day";
		String words[] = s.split("\\s");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}