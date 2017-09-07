
interface IAT {}

class Unknown implements IAT{
	
	Unknown(){}
}

class Person implements IAT{
	String name;
	IAT dad;
	IAT mom;
	
	Person(String name, IAT dad, IAT mom){
		this.name = name;
		this.dad = dad;
		this.mom = mom;
	}
}

class ExamplesPerson{
  ExamplesPerson(){}
  
  IAT unknown = new Unknown();
  IAT ronaldinho = new Person("Ronaldinho", this.unknown, this.unknown);
  IAT diana = new Person("Diana", this.unknown, this.unknown);
  IAT pique = new Person("Pique", this.unknown, this.unknown);
  IAT shakira = new Person("Shakira", this.unknown, this.unknown);
  IAT zinedine = new Person("Zinedine", this.ronaldinho, this.diana);
  IAT rachel = new Person("Rachel", this.pique, this.shakira);
  IAT cristiano = new Person("Cristiano", this.zinedine, this.rachel);
 
}