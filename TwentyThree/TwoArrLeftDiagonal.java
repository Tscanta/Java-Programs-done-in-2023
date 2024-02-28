package TwentyThree;

//TWo Dimensional left diagonal
import java.util.*;
class TwoArrLeftDiagonal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements in the "+n+" x "+n+" matrix one by one");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        } 
        System.out.println("The left diagonal");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        } 
    }
}