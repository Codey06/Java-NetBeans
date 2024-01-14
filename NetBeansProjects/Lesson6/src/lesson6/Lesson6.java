
package lesson6;


public class Lesson6 {


    public static void main(String[] args) {
//        Method1.display();
//        
//        Method1 n=new Method1();
//           n.show("ali");
//           n.show(" hussin");
//           n.show(" yasyeste");
Method2 n2=new Method2();
        System.out.println(n2.getBalance());
n2.setBalance(200);
        System.out.println(n2.getBalance()>300?"sufficient blanace":"insufficient balace");
    
    }
    
}
