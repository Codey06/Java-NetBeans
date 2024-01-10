
package lesson4;

import java.util.Scanner;
public class Switch {
    Scanner kb=new Scanner(System.in);
    public Switch(){
        int num;
        System.out.println("Enter Number :");
        num=kb.nextInt();
        System.out.println("Choose\n1:Square\n2:Cubic");
        int ch=kb.nextInt();
        
        switch(ch){
            case 1:
                System.out.println(num==0?"Your Enter 0":"square of "+num*num);
                break;
                case 2:
                System.out.println("Cubic of "+num*num*num);
                break;
                
                default:
                    System.out.println("Macsalaamo");
                    break;
        // ? if :else
        
        }
        
    }
    
}
