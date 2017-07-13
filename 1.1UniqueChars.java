
//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

public class UniqueChars{

	static Boolean uniqueChars(String str){
		str = str.toLowerCase();

		for(int i=0; i<str.length(); i++){
			Character c = str.charAt(i);
			for(int j=0; j<str.length(); j++){


				if( i == j) continue;

				if(c.equals(str.charAt(j))){
					return false;
				}

			}

		}

		return true;

	}


	public static void main(String[] args) {
    	System.out.println(uniqueChars("howdy"));
    	System.out.println(uniqueChars("hello"));
   	}

}