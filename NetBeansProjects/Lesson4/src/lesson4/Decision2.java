
package lesson4;

import java.util.Scanner;

public class Decision2 {
    Scanner kb1=new Scanner(System.in);
    public Decision2(){
        int av,age;
        System.out.println("Enter Your Average ");
        av=kb1.nextInt();
        System.out.println("Enter Your Age ");
        age=kb1.nextInt();
         
        if(av >=50 && age >=18){
            System.out.println("You can Join The University");
        }
        else{
              System.out.println(" You can't Join Our University");
         }
        
        
        
        
        /**
         * 
         * Logical Operators
         * and  &&
         * or | |
         *  not !
         */
        
        
        
        
        
        
//        if(av> 50){
//              if(age >18)
//                  System.out.println("You can Join The University");
//        }else
//                  System.out.println(" You can't Join Our University");
//            int av;
//        System.out.println("Enter Your Average ");
//        av=kb1.nextInt();
//        if (av >=50)
//        { int age;
//            System.out.println("Enter Your Age ");
//          age=kb1.nextInt();
//               if(age > 18)
//                  System.out.println("You can Join The University");
//                    else
//                   System.out.println(" You can't Join Our University");}
//                 else
//                  System.out.println(" You can't Join Our University");
        
        
    }
    
}
