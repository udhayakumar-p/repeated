import java.util.*;
public class Tree
{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String str2="";
    LinkedHashSet<String> lh=new LinkedHashSet<String>();
    for(int i=0;i<str.length()-1;i++)
    {
    lh.add(str.substring(i,i+1));
    }
    str2=lh.toString();
    System.out.print(lh);
    String str3=str2.replace("[","").replace("]","").replace(",","").replace(" ","");
    System.out.println(str3);

}
}



