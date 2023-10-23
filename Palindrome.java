//java program to check the srting is palindrome or not
import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
       String s1=sc.nextLine();
       String s2="";
        int l=s1.length();
        for(int i=l-1; i>=0; i--)
        {
            s2=s2 + s1.charAt(i);
        }
        if(s1.equals(s2))
        
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
    }
}
