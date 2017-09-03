import java.io.*;
import java.util.*;
public class camel
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
      String st=s.nextLine();
      String str="";
      char c=st.charAt(0);
      str=str+Character.toUpperCase(c);
      for(int i=1;i<st.length();i++)
      {
          char a=st.charAt(i);
          char b=st.charAt(i-1);
          if(b==' ')
          {
              str=str+Character.toUpperCase(a);
          }
          else
          {
              str=str+a;
          }
      }
     
           
      
       System.out.print(str);
    }
}




