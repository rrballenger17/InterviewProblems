

import java.util.*;



class Comparisons{



	public static void main(String []args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(20));

		list.add(new Student(18));

		list.add(new Student(15));

		list.add(new Student(23));


		Collections.sort(list, new AgeComparator());


		for(Student x: list){
			System.out.println(x.age);
		}

	}

}




class Student {

	public int age;


	Student(int age){
		this.age = age;
	}
}




class AgeComparator implements Comparator {

	public int compare(Object x, Object y){
		return ((Student)x).age - ((Student)y).age;
	}


}














