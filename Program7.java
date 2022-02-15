import java.util.*;
class Program7
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
            System.out.println("which element we have to insert");
            int in = sc.nextInt();
        for(i=0; i<n; i++)
        {
            if(i == 0)
                a1[i] = in ;
            break;
    
        }
          for(i=0; i<n; i++)
        {
            
            System.out.println(a1[i]);
        }
            
    }
}