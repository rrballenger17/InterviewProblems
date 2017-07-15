// Incomplete - blueprint-design only  

class Shelter{

	List<Animal> data = new LinkedList<Animal>();

	public void enqueue (Animal input){
		data.add(input);
	}

	public Animal dequeue(){

		// check for size 0

		Animal result = data.get(0);
		data.remove(0);
		return result;

	}

	public Animal dequeueCat(){

		// check for size 0

		int i = 0;

		while(true){

			if(i==data.size()) return false;

			if(!data.get(i).dog) break;

			i++;

		}

		Animal result = data.get(i);

		data.remove(i);

		return result ;


	}







}



class Animal{
	public String name;
	public Boolean dog = false;
	public Integer id;
}