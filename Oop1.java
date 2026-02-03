package oop1;

class Account {

private String name ;
private String number ;
private int blance ;


public String getname(){


return name ;
}
  
public void setname(String name){

this.name = name ;
}

public void printdata(){
System.out.println(name + " : " +  number + " : " +  blance  +   " : ");
   

}

public int add(int a , int b ){


return a+b ;
}
public Account(){
        
System.out.println("Hi  con1");
}

public Account(String s){
        
System.out.println("Hi  con2");
}

    

public Account(String s,String w){

    System.out.println("Hi  con3");
    }


}





public class Oop1 {

    public static void main(String[] args) {
   
    Account ac1 = new Account();
       
    ac1.setname("Ahmd");

    
    
    /*Account ac2 = new Account("Fuck you");
     Account ac3 = new Account("why man"  +  "i dont now ");
     System.out.println( ac1  );
     System.out.println( ac2  );
     
     ac1.printdata();
     
   System.out.println(ac2.getname()) ;
   int s = ac2.add(10, 20);
     System.out.println("result is "  + s);
     
     if (s > 50 )
         System.out.println(" false ");  
     
     
    int f = 3 *  ac2.add(10, 20);*/
    

    
    } 
}
