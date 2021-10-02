package Logic;

public class Person {
    private String username;
    private String password;    
    
    public Person(){}
    
    public Person (String username , String password){
        this.username=username;
        this.password=password;
    }
    
   public String getName(){
       return username;
   } 
   
   public String getPassword(){
       return password;
   }
   
}
