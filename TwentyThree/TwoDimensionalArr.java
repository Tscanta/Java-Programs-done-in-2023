package TwentyThree;

//Making a two dimensional array 
import java.util.*;
class TwoDimensionalArr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of elements");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements in the "+n+" x "+n+" array one by one");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The elements are:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}