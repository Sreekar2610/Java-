class Ironman extends Superhero{
	String mov;
	Ironman(String name,String pwr,String bhvr,int ag,String moviename){
        super(name,pwr,bhvr,ag);
  	this.mov=moviename;
	}
	void display()
	{
	super.display();
	System.out.println("moviename:"+mov);
	}
}