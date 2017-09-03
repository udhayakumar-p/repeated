import java.io.*;
import java.util.*;
public class vowelsremove
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
      String st=s.nextLine();
      String str="[aeiouAEIOU]";
      String str2=st.replaceAll(str,"");
       System.out.print(str2);
    }
}
