//3) Print all permutation of String both iterative and Recursive way? (solution)


import java.util.*;

class RecursivePermutations{


	static void printIteration(String input){

		printIteration(input, "", new HashSet<Integer>());
	}

	static void printIteration(String orig, String result, Set<Integer> used){
		if( orig.length() == result.length()){
			System.out.println(result);
			return;
		}

		for(int i=0; i<orig.length(); i++){
			if(!used.contains(i)){
				String newResult = result + orig.charAt(i);

				used.add(i);
				printIteration(orig, newResult, used);

				used.remove(i);

			}
		}
	}



	public static void main(String []args) {

		String x = "dog";
		printIteration(x);

		

	}

}