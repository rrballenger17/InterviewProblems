
// reverse a number 

public class PrimeTest{



	static boolean isPrime(int num){


		if(num < 0) num *= -1;

		if(num ==0 )return false;

		for(int f=num -1; f > 1; f--){


			if((num%f) == 0) return false;

		}

		return true;


	}



	public static void main(String[] args) {


    	System.out.println(isPrime(22));
    	System.out.println(isPrime(31));
    	
    	System.out.println(isPrime(105));
    	System.out.println(isPrime(659));

   	}




}
