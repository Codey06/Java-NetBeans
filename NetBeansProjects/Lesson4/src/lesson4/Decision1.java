
package lesson4;

import java.util.Scanner;

public class Decision1 {
    Scanner ne=new Scanner(System.in);
    public Decision1(){
        int n;
        System.out.println("Enter a Number ");
        n=ne.nextInt();
        if(n>100){
           System.out.println("Number is greater than "  +n);
        }
        
        else if(n<100)
        {
        System.out.println(n+" Number is less than 100 ");    
      }
        else
            System.out.println(n +" Is Equal to 100");
       
        
        }
        
    
}
    

