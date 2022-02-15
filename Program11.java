import java.util.*;
public class Program11{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String st1,st2=" ";
        
       st1=sc.next();
       System.out.println("enter any string");
       for(int i=st1.length()-1;i>0;i--){
           st2=st2+st1.charAt(i);
       }
       System.out.println("the reverse os string is"+st2);
    }
        
        
    
}