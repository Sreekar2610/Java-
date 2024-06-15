class SuperHero{
	String name;
	String power;
 	
	public SuperHero(String name, String power){
	 this.name=name;
	 this.power=power;
	}
public void usepower(){
	System.out.println(name+"power is"+power);
}
}
class IronMan extends SuperHero{
	public IronMan(String name){
	 super(name," advanced technology");
 }
}

class Spiderman extends SuperHero{
	public Spiderman(String name){
	 super(name,"web and spidy jumps");
	}
}
public class HierarchicalInheritance{
	public static void main(String args[]){
	 IronMan ic=new IronMan("tony stark");
	 Spiderman sc=new Spiderman("peter is spidy");
	ic.usepower();
	sc.usepower();
 }
}
