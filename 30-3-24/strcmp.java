import java.util.Scanner;
class strcmp{
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 String st=new String("python");
         System.out.println("new course is :"+st);
	 System.out.println("enter our name:");
	 String nam=sc.nextLine();
	 if(nam.equals("java")){
		 	 System.out.println("good choice !!");
	 }
	else{
	   System.out.println("you have entered"+nam);
	}
}
}
