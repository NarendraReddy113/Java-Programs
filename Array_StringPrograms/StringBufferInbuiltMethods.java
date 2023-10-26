package Array_StringPrograms;

public class StringBufferInbuiltMethods {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());

		StringBuffer sb1 = new StringBuffer("SpiderMan");
		System.out.println(sb1.length());

		System.out.println(sb1.charAt(2));

		StringBuffer sb2 = new StringBuffer("Movie");
		System.out.println(sb1.append(sb2));

		System.out.println(sb2.insert(1, "abc"));

		System.out.println(sb1.delete(0, 2));

		System.out.println(sb2.deleteCharAt(0));

		System.out.println(sb2.reverse());

		sb2.setLength(4);
		System.out.println(sb2);

		StringBuffer sbb = new StringBuffer("QueenOfIndia");
		System.out.println(sbb.substring(7));
		System.out.println(sbb.substring(0, 7));

		System.out.println(sbb.replace(0, 7, "Mother"));

		System.out.println(sbb.capacity());

		sbb.trimToSize();
		System.out.println(sbb.capacity());

		sbb.setCharAt(4, 'E');
		System.out.println(sbb);

		sbb.ensureCapacity(20);
		System.out.println(sbb.capacity());
	}

}