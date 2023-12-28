import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int len1=s1.length();
        System.out.println("The Length of first string is "+len1);
        int len2=s2.length();
        System.out.println("The Length of second string is "+len2);
        if(len1==len2)
        {
            System.out.println("The length of the two strings are the same");
        }
        else{
            System.out.println("The length of the two strings is not the same");
        }
        if(s1.equals(s2)){
            System.out.println("Two strings are equal");
        }
        else{
            System.out.println("Two strings are not equal");
        }
	}
}
