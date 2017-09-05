class Person {
  String name;
  int age;
  String gender;
  Address address;
	  
  Person(String name, int age, String gender, Address address){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.address = address;
  }
}

class Address {
	String city;
	String state;
	
	Address(String city, String state){
		this.city = city;
		this.state = state;
	}
}

class ExamplesPerson {
  ExamplesPerson(){}
	Address add1 = new Address("Boston", "MA");
	Address add2 = new Address("Warwick", "RI");
	Address add3 = new Address("Nashua", "NH");
	
  Person a = new Person("Tim", 20, "M", this.add2);
  Person b = new Person("Pat", 19, "F", this.add1);
  Person c = new Person("Kim", 17, "F", this.add1);
  Person d = new Person("Dan", 22, "M", this.add3);
}