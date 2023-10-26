package Array_StringPrograms;

public class StringPalindrome {
	public static void main(String[] args) {
		String s1 = "madam";
		for (int i = 0; i < s1.length() - 1; i++)// i=0;2<4;i++
		{
			for (int j = i + 2; j <= s1.length(); j++)// j=3;4<5;j++
			{
				String s2 = s1.substring(i, j);// (1,4)//ada
				if (isPalindrome(s2)) {
					System.out.println(s2);// ada
				}
			}
		}
	}

	public static boolean isPalindrome(String s2) {
		s2 = s2.toLowerCase();// ada
		int i = 0;// 0
		int j = s2.length() - 1;// 2
		while (i < j)// 0<2//1<1
		{
			if (s2.charAt(i) != s2.charAt(j))// a!=a
			{
				return false;
			}
			i++;// 1
			j--;// 1
		}
		return true;
	}

}
