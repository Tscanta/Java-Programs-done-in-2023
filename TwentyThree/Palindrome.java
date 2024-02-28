package TwentyThree;

import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1="";
        System.out.println("Enter a word");
        String s2=sc.next();
        for(int i=s2.length()-1;i>=0;i--)
        {
            s1=s1+s2.charAt(i);
        }
        if(s1.equals(s2))
        System.out.println("Palindrome");
        else
        System.out.println("No, palindrome");
    }
}
        
