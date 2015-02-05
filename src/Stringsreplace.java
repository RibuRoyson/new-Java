
public class Stringsreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Strings are an important part of the Java programming language";

		String Str1 = str.replaceAll("a", "b");

		System.out.println(Str1);

		Str1 = Str1.replaceAll("e", "1");

		System.out.println(Str1);

		Str1 = Str1.replaceAll("t", "T");

		System.out.println(Str1);

		Str1 = Str1.replaceAll("p", "");

		System.out.println(Str1);

		Str1 = Str1.replaceAll("J", "That");

		System.out.println(Str1);


	}

}
