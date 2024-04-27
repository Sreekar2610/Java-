public class AcionMovie extends Movie
{
	private String actor;
AcionMovie(String title,int year,String mainActor){
super(title,year);
this.actor=mainActor;
}
public void display()
{
super.display();
System.out.println("Main actor:"+actor);
}
}