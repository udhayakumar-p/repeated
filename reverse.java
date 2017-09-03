import java.io.*;
import java.util.*;
public class reverse
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       System.out.print(new StringBuffer(str).reverse().toString());
    }
}
