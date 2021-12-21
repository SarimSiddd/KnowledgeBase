Car has types:

SportsCar, MiniVan, SUV




//Here ? means that someArray can contain a list of 
//objects of any type
	public void print(ArrayList<?> someArray)
	{
		int i =0;
		for (Object object = someArray.get(i); i<someArray.size(); i++)
		{
			System.out.println(object);
		}
	}


//Here ? extends Car means someArray has to be a list 
//of objects of type Car or its subtype
//This allows us to call methods of elements from the list
	public void doSomething(ArrayList<? extends Car> someArray)
	{
		for (Object object = someArray.get(i); i<someArray.size(); i++)
		{
			(sportsCar)object.race();
			someArray.add(new sportsCar); //illegal since someArray can be of some subtype MiniVan
		}	
	}

//Here ? super Car means someArray has to be a list
//of elements that are a Car or one of its super classes
//? super allows for adding or assigning not references
	public void doSomething(ArrayList<? super Car> someArray)
	{
		for (Object object = someArray.get(i); i<someArray.size(); i++)
		{
			(sportsCar)object.race(); //illegal since object can't be a descendant 
			someArray.add(new sportsCar); //Legal since we know someArray is atleat of type Car
			//but we cannot use any of the objects since we dont know the exact subtype
		}	
	}