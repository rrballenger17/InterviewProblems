
//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

public class ReverseString{






	static String reverse(String str, String result){
		
		if(str.length() == 0) return "";

		result = str.charAt(str.length() - 1 ) + result;

		if(str.length() == 1){
			return result;
		}

		return reverse(str.substring(0, str.length()-2), result);

	}


	public static void main(String[] args) {
    	System.out.println(reverse("howdy"));
    	System.out.println(reverse("hello"));
   	}

}