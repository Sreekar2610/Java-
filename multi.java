import java.util.*;
class multi{
	public static void main(String[] args){
	 int marks[][]=new int[10][2];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter roll no and marks:");
	 for(int i=0;i<marks.length;i++)	
	 {
  	   System.out.println("enter roll no:");
	   marks[i][0]=sc.nextInt();
    	   System.out.println("enter  marks:");
	   marks[i][1]=sc.nextInt();
	 }
	for(int j=0;j<marks.length;j++)
	{
	   System.out.println("rollno:"+marks[j][0]+" marks:"+marks[j][1]);
	}
  }
}