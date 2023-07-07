import java.io.*;
import java.util.Scanner;
 
class RevStr {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch;
       String nstr=" ";
      
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
    }
}