import java.io.*;
import java.util.*;
public class reverseDigit
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
       int str=s.nextInt();
       int c=0;
       while(str!=0)
       {c=c*10;
       c=c+str%10;
       str=str/10;          
       }
       System.out.print(c);
    }
}
