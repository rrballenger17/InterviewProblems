//3) Print all permutation of String both iterative and Recursive way? (solution)


import java.util.*;

class Powers{


	static Boolean checkPowerTwo(int input ){
		int powers = 1;

		while(true){

			if(input == powers) return true;

			powers *= 2;

			if(powers > input || powers < 0) return false;
		}



	}



	public static void main(String []args) {

		System.out.println(checkPowerTwo(2));


		System.out.println(checkPowerTwo(32));

		System.out.println(checkPowerTwo(34));


		System.out.println(checkPowerTwo(Integer.MAX_VALUE));



	}



}