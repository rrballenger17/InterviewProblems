
// reverse a number 

import java.util.*;

public class CollectionSort{



	static Comparator<Integer> custom = new Comparator<Integer>() {
           
            public int compare(Integer e1, Integer e2) {
                return e2 - e1;
            }
    
    };



	public static void main(String[] args) {



		List<Integer> list = new ArrayList<Integer>();

		list.add(8);
		list.add(89);
		list.add(1);
		list.add(4);
		list.add(100);
		list.add(65);


		Collections.sort(list, custom);


    	System.out.println(list.toString());


   	}

}
