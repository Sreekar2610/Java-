class Bicycle{
	void displayFeatures(){
		System.out.println("Features: pedals,Manual Power");
	}
}
class Motorbike extends Bicycle{
	void displayFeatures(){
	 super.displayFeatures();
	 System.out.println("Added feature by Motor: Engine");
	}
}
class ElectricBike extends Motorbike{
	void displayFeatures(){
	 super.displayFeatures();
	 System.out.println("Added feature by Electricbike: motor,battery");
	}
}
class MultilevelInheritance{
	public static void main(String args[]){
		ElectricBike ec=new ElectricBike();
	 ec.displayFeatures();
	}
}
