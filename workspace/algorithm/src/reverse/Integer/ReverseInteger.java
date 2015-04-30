package reverse.Integer;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 1234506890;
		int last_digit, reversedNum = 0;
		while (input != 0) {
			last_digit = input % 10;
			// if (last_digit % 10 != 0) {
			reversedNum = reversedNum * 10 + last_digit;

			// }
			input = input / 10;
//			if (input == 0) {
//				reversedNum += input;
//			}

		}
		System.out.print(reversedNum);
	}

}
