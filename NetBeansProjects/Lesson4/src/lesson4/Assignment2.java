/**  Assignment 2
 *  Odd  and Even  Number
 */
package lesson4;

import java.util.Scanner;

public class Assignment2 {
    Scanner kb=new Scanner(System.in);
    public Assignment2(){
        int num;
        System.out.println("Enter Any Number");
        num=kb. nextInt();
        if(num % 2==0){
            System.out.println(num+"this number is Even");
        }else
        {
            System.out.println(num+"this number is Odd");
                }
        
    }
    
}
