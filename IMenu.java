interface IMenu {}

class Salad implements IMenu{
	Info info;
	boolean isVegetarian;
	
	Salad(Info info, boolean isVegetarian){
		this.info = info;
		this.isVegetarian = isVegetarian;
	}
}

class Soup implements IMenu{
	Info info;
	boolean isVegetarian;
	
	Soup(Info info, boolean isVegetarian){
		this.info = info;
		this.isVegetarian = isVegetarian;
	}
}

class Sandwich implements IMenu{
	Info info;
	Filling fill;
	String bread;
	
	Sandwich(Info info, Filling fill, String bread){
		this.info = info;
		this.fill = fill;
		this.bread = bread;
	}
}

class Info{
	String name;
	double price;
	
	Info(String name, double price){
		this.name = name;
		this.price = price;
	}
}

class Filling{
	String fill1;
	String fill2;
	
	Filling(String fill1, String fill2){
		this.fill1 = fill1;
		this.fill2 = fill2;
	}
}

class ExamplesIMenu {
  ExamplesIMenu(){}
  
 // For Salad 
  Info info1 = new Info("Chicken Salad", 20);
  Info info2 = new Info("Greek Salad", 25);
  
  Salad salad1 = new Salad(this.info1, false);
  Salad salad2 = new Salad(this.info2, true);
 
// For Soup
  Info info3 = new Info("Bacon Soup", 15);
  Info info4 = new Info("Carrot Soup", 10);
  
  Soup soup1 = new Soup(this.info3, false);
  Soup soup2 = new Soup(this.info4, true);
  
// For Sandwich
  Filling fill1 = new Filling("Peanut Butter", "Jelly");
  Filling fill2 = new Filling("Ham", "Cheese");
  
  Info info6 = new Info("Peanut Butter & Jelly Sandwich", 10);
  Info info7 = new Info("Ham & Cheese Sandwich", 10);
  
  Sandwich sandwich1 = new Sandwich(this.info6, this.fill1, "White Bread");
  Sandwich sandwich2 = new Sandwich(this.info7, this.fill2, "English Muffin");
  
  
  
}
