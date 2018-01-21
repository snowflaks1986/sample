package palindrome;

public class Palindrome {

	/*
	 * 回文かどうか判定
	 * @param str1 1つ目の文字列
	 * @param str2 2つ目の文字列
	 * @return boolean true:回文 false:回文ではない
	 */
	public boolean isPalindrome(String str) {
		boolean isPalindrome = true;
		int minLen = 0;
		int maxLen = str.length() - 1;
		while(minLen < maxLen) {
			if(str.charAt(minLen++) != str.charAt(maxLen--)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
}
