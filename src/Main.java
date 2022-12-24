public class Main {
	public static void main(String[] args) {
		// Match all the letter in a "cat" word.
		System.out.println("cat".matches("cat"));

		// Match all the letter without case sensitivity on the letter C.
		System.out.println("Cat".matches("[cC]at"));

		// Match the all the first word in the bracket.
		System.out.println("Bat".matches("[cCbB]at"));

		// Range of letter you want to match.
		System.out.println("eat".matches("[a-fA-F]at"));

		// Avoid matching using ^, or any character except c or C,
		// this will return false.
		System.out.println("Bat".matches("[^cC]at"));

		// IT IS IMPORTANT TO KNOW THAT IN JAVA, WE'RE USING DOUBLE BACKSLASH RATHER THAN SINGLE
		// BACKLASH TO DECLARE A REGEX SYMBOL.

		// Backslash "w" (\w) matches any latin character in the utf-8 encoding system or ASCII.
		// note that "\w" also include "_"(underscore).

		// To specify the count of repetition of how many words should be use, we use digit then
		// encapsulated it in a curly braces, like the example below.

		// Any word within 3 letters.
		System.out.println("cat".matches("\\w{3}"));
		// Any word within 6 letters.
		System.out.println("Henson".matches("\\w{6}"));

		// "\d" matches to any digit like 0 to 9.
		// "+" means one or more of the character before the declaration of the symbol
		// "?" means optional (zero or one of the character before the declaration)
		// "()" you can encapsulate a pattern inside parenthesis
		// "." means all the character available.
		// if you delete the "1-", it will still return true.
		System.out.println("1-321-333-7652".matches("(\\d.+)?(\\d{3}.+){2}\\d{4}"));

		// We can declare a minimum and maximum of ranges in the digit count.
		// This will return false because the minimum count for the last group of digit is 3.
		System.out.println("1-321-333-76".matches("(\\d.+)?(\\d{3}.+){2}\\d{3,4}"));

		// "\s" means space character
		System.out.println("apple orange".matches("\\w*\\s\\w*"));

		// "*" means many of the character declared after the declaration.
		System.out.println("321-       333---------   7652".matches("\\d{3}[-.,\\s]*\\d{3}[-,.\\s]*\\d{4}"));
	}
}
