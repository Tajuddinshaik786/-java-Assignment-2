import java.util.*;
public class Program12{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String st1,st2="";
       st1=sc.next();
       System.out.println("enter any string");
       for(int i=st1.length()-1;i>0;i--){
           st2=st2+st1.charAt(i);
       }
       if(st1.equalsIgnorecasest2()){
            System.out.println("it is palindrome");
       }
       else{
       System.out.println("it is not palindrome");
          
       }
      
    }
}