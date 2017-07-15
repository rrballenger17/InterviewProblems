//3) Print all permutation of String both iterative and Recursive way? (solution)


import java.util.*;

class Factors{

	private static  Set<Integer> facts = new HashSet<Integer>();

	private static void recurseFactors(int arg ){

		boolean factors = false;

		for(int i=2; i<arg; i++){

			if((arg%i) == 0){
				factors = true;
				recurseFactors(i);
			}
		}


		if(!factors) facts.add(arg);
	}


	private static void findFactors(int arg){
		recurseFactors(arg);

		for(Integer x: facts){
			System.out.println(x);
		}
	}



	public static void main(String []args) {

		findFactors(3450920);




	}



}