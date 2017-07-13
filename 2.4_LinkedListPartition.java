
//Check Permutation: Given two strings,write a method to decide if one is a permutation of the
//other.
import java.util.*;



class LinkedListPartition {

	

	public static List<Integer> partition(List<Integer> list, Integer partition){

		for(int i=0; i<list.size(); i++){


			//System.out.println(i);

			if(list.get(i) > partition){


				if(i > 0){
					if( list.get(i-1) >= partition){
						continue;
					}
				}

				list.add(list.get(i));
				list.remove(i);
				i--;
			}else if(list.get(i) < partition){
				list.add(0, list.get(i));
				list.remove(i+1);
			}


		}


		return list;

	}

	public static void main(String[] args) {
   		List<Integer> list = new LinkedList<Integer>();

   		list.add(1);
   		list.add(3);
   		list.add(12);
   		list.add(15);
   		list.add(6);
   		list.add(4);
   		list.add(2);

   		list = partition(list, 4);

   		for(Integer s: list){
   			System.out.println(s);
   		}

   	}

}