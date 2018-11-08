import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {

	public static boolean checker(String Regex_Pattern, String Test_String) {
		Pattern p = Pattern.compile(Regex_Pattern);
		Matcher m = p.matcher(Test_String);
		return m.find();
	}
	
	public static void main(String[] args) {
		String regex = "([1-3][120][xs0][30Aa][xsu][.,])";
		String test = "1203x.";
		String test2="1203xk";
		System.out.println("Check String has 6 characters.");
		System.out.println("First character: 1, 2 or 3");
		System.out.println("Second character: 1, 2 or 0");
		System.out.println("Third character: x, s or 0");
		System.out.println("Fourth character: 3, 0 , A or a");
		System.out.println("Fifth character: x, s or u");
		System.out.println("Sixth character: . or ,");
		System.out.println("Let Check string " +test);
		System.out.println(checker(regex, test));
		System.out.println("Let Check string " +test2);
		System.out.println(checker(regex, test2));
	}
}
