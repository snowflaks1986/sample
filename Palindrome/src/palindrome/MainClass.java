package palindrome;

//回文かどうか判定を行うクラス
public class MainClass {
	public static void main(String[] args) {
		Palindrome pl = new Palindrome();
		boolean palindrome = pl.isPalindrome(args[0]);
		String consoleMessage = palindrome? "文字列は回文です":"文字列は回文ではありません";
		System.out.println(consoleMessage);
	}
}
