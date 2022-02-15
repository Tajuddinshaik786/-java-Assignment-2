import java.util.*;
class Program4
{
    public static void main(String[] arg)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. elements in an arry ");
        int n = sc.nextInt();
        int a1[] = new int[n];
        
        System.out.println("enter arry elements ");
        for( i=0; i<n; i++)
        {
            a1[i] = sc.nextInt();
        }
        
        for(i=0; i<n; i++)
        {
            if(i == n)
                a1[i] = 0 ;
            break;
    
        }
          for(i=0; i<n; i++)
        {
            if(i == n)
            System.out.println((char)a1[i]);
            System.out.println(a1[i]);
        }
            
    }
}