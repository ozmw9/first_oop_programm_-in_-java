
package first_oop_programm;

class Account {
   private String name ;
   private String number ;
   private Double blance;
   
  
  // للقراءة المتفير  
   public String getname(){
  return name ;
  
  }

// للتعديل على ال النيم لانه المتغير برايفت 
   public void setName(String newName ){
   name = newName;
   }
    // لطباعة المتفيرات 
   public void printData(){
   System.out.println(name + " : "   + number + " : " + blance );

   }
   
   
   public int add (int a, int b){
   return a+b ;
   
   }

}

public class First_oop_programm {
    public static void main(String[] args) {
     
        // انشاء اوبجيكت 
        Account ac1 = new Account ();
        Account ac2 = new Account ();
        // افتراضيا سيطبع عنوان الاوبجيكت 
        System.out.println(ac1);
          System.out.println(ac2);
          
          //  استدعاء دالةعن طريق الاوبجيكت 
          ac1.printData();
          
         System.out.println(ac2.getname());
         int o = ac2.add(10,20);
         System.out.println("result : " + o );
         if (ac2.add(10,20) >50 )
             System.out.println ("larg");
         
             int m = 3 *ac2.add(10,20);
          
          
    
    
             
    }
    
}
