

import java.util.*;


class StackQueue {
	
	static Stack one = new Stack();
	static Stack two = new Stack();

	static void add(String input){
		one.push(input);
	}


	static String poll(){


		String x = (String) one.peek();

		while(true){
			if(one.empty()) break;
			String y = (String) one.pop();
			x = y;
			two.push(y);
		}


		if(!two.empty()){
			two.pop();
		}

		while(true){

			if(two.empty()) break;

			String z = (String) two.pop();
			one.push(z);
		}

		return x;

	}


	public static void main(String[] args) {
   		add("yes");
   		add("we");
   		add("can");

   		System.out.println(poll());
   		System.out.println(poll());
   		System.out.println(poll());

   	}







}