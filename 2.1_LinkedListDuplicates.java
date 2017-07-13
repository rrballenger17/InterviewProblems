
//Check Permutation: Given two strings,write a method to decide if one is a permutation of the
//other.
import java.util.*;



class LinkedListDuplicates {

	

	public static List<String> removeDup(List<String> list){

		Set<String> stringSet = new HashSet<String>();

		for(int i=0; i<list.size(); i++){

			if(stringSet.contains(list.get(i))){

				list.remove(i);
				i--;


			}else{
				stringSet.add(list.get(i));
			}

		}


		return list;

	}

	public static void main(String[] args) {
   		List<String> list = new LinkedList<String>();

   		list.add("yes");
   		list.add("we");
   		list.add("can");
   		list.add("yes");
   		list.add("we");
   		list.add("!");

   		list = removeDup(list);

   		for(String s: list){
   			System.out.println(s);
   		}

   	}

}
