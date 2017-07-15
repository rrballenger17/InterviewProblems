// 1) Write code to check a String is palindrome or not? (solution)

class Palindrome{


	public static Boolean palindrome(String input){

		for(int i=0; i<input.length();i++){
			char x = input.charAt(i);
			char y = input.charAt(input.length() - 1 - i);

			if(x != y) return false;

		}

		return true;

	}



	public static void main(String []args) {

		String x = "racecar";
		System.out.println(palindrome(x));

		x = "boston";
		System.out.println(palindrome(x));

	}

}