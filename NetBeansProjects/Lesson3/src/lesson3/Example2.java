package lesson3;
import java.util.Scanner;
public class Example2 {
    Scanner kb=new Scanner(System.in);
    int n1 , n2;
    public void input(){
        System.out.println("Enter Number 1 ");
        n1=kb.nextInt();
        System.out.println("Enter NUmber 2 ");
        n2=kb.nextInt();   
    }// end of input method
    public void show(){
        int sum=n1+n2;
        
        System.out.println("The Total is " +sum);
        
    }// end of show method
    public Example2(){
        System.out.println("kani waa Constructor");
}
}// end of class
