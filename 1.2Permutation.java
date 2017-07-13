
//Check Permutation: Given two strings,write a method to decide if one is a permutation of the
//other.




class Permutation {

	

	public static Boolean permuteTest(String one, String two){

		StringBuilder sb = new StringBuilder(two);


		if(one.length() != two.length()){
			return false;
		}

		for(int i=0; i<one.length(); i++){

			Character c = one.charAt(i);

			for(int j=0; j<sb.length(); j++){


				if(c.equals(sb.charAt(j))){

					sb.deleteCharAt(j);

					break;

				}

			}

		}

		return sb.length() == 0;

	}

	public static void main(String[] args) {
   		System.out.println(permuteTest("howdy", "ydwoh"));
   		System.out.println(permuteTest("hello", "nope"));

   		System.out.println(permuteTest("old", "ldo"));
   		System.out.println(permuteTest("oldz", "ldo"));

   	}

}


