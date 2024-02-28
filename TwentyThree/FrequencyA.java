package TwentyThree;

import java.util.Scanner;
public class FrequencyA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(i==0&&(s.charAt(i)=='A'))
            c++;
            if(i>0)
                if((s.charAt(i-1)==' ')&&(s.charAt(i)=='A'))
                c++;
        }
        System.out.println(c);
    }
}
