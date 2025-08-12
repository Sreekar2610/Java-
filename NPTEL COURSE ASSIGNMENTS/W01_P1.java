import java.util.Scanner;

public class W01_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
// Check if the number is Positive or Negative and print accordingly
if (number<0){
System.out.printf("Negative");}
else{
System.out.printf("Positive");
}
  
in.close();
    }
}
