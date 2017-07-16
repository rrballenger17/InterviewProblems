
// reverse a number 

public class ReverseInt{



	static String reverse(Integer n){
		return reverse(n.toString(), "");
	}


	static String reverse(String str, String result){
		
		if(str.length() == 0) return "";

		result = result + str.charAt(str.length() - 1 );

		if(str.length() == 1){
			return result;
		}

		return reverse(str.substring(0, str.length()-1), result);

	}


	public static void main(String[] args) {






    	System.out.println(reverse(123456));
    	System.out.println(reverse(4545));
   	}

}


