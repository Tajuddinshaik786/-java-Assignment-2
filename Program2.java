import java.util.*;
class program2
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
        System.out.println("enter for which elemet you have");
        int ele = sc.nextInt();
        
        for(i=0; i<n; i++)
        {
            if(a1[i] == ele)
            {
                    System.out.println("element is found "+a1[i]+" possion");
            }
        }
        if(i == n)
            System.out.println("element is not found");
    }
}