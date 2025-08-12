import java.util.*;
class Primenumber{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int s=sc.nextInt();
 boolean isprime=true;
 for(int i=n;i<=s;i++){
   for (int j=2;j<=i/2;i++){
   if(i%j==0){
         System.out.println("no");
       }
   else{
 System.out.print("yes"+i);
    }
 }
}

}
}