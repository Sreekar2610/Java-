class Superhero{
	String sname,spower,behaviour;
	int age;
	Superhero(String name,String pwr,String bhvr,int ag)
	{
	this.sname=name;
	this.spower=pwr;
	this.behaviour=bhvr;
	this.age=ag;
	}
	void display()
	{
	System.out.println("your hero is");
	System.out.println("Name:"+sname);
	System.out.println("spower:"+spower);
	System.out.println("behaviour:"+behaviour);
	System.out.println("age:"+age);
	}
}