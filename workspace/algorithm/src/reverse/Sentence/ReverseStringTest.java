package reverse.Sentence;

public class ReverseStringTest {

	public static String reverseSingle(String word) {
		StringBuilder sbSg = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) {
			sbSg.append(word.charAt(i));
		}
		return sbSg.toString();

	}

	public static String reverseMultiple(String sentence) {
		if (sentence.isEmpty()){
		    return "" ;
		    }
		String[] words = sentence.split(" ");
		StringBuilder sbMp = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			sbMp.append(reverseSingle(words[i]));
			if (i < words.length - 1) {
				sbMp.append(" ");
			}
		}
		return sbMp.toString();
	}

	public static void main(String[] args) {
		String test = "";
		System.out.println(reverseMultiple(test));
	}

}