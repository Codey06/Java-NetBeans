
package lesson6;
/*
  4 approaches:------------
    1= Method no return and no parameter
    2= Method no return but has parameter
    3= Method with return  no parameter
    4= Method with return and parameter
==================================
Parameter : is variable declared inside method header when method is defining
Argument : is the value that we pass the function when is function is calling
*/
public class Method1 {
    static String name="hello";
    
    public static void display(){
        System.out.println("hello"+name);
        
    }
    public void show(String name){
        System.out.println("Asc"+name);
        
    }
    
}
