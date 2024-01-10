///**   Assignment 1
// * .. Age
// * Enter Your Age....
// * if age>=18 " Your are adult"
//// * if age <18  " You are Child"
//// *  else this year is reach
//// * 
//// * 
//// */
package lesson4;

import java.util.Scanner;
public class Assignment1 {
    Scanner kb=new Scanner(System.in);
    public Assignment1(){
        int year;
        int age;
        System.out.println("Enter Your Birth Year");
        year=kb.nextInt();
          age=2024-year;
        if(age >=18){
            System.out.println(age+" Your Are Adult");
        }else if (year >2024)
            System.out.println(year + " This Year is not Reach!!!!!!!!");
        
        else System.out.println(age+" You Are Young !!!");
    }
    
    
}
