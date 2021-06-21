import java.io.*;
import java.util.*;

public class ex41
{
    TreeSet<String> tree=new TreeSet<String>();
    public static void main(String args[])
    {
        new ex41().go();
    }
    public void go()
    {
        getlist();
        System.out.println(tree);
    }
    void getlist()
    {
        try
        {
            File myfile= new File("C:/Users/Desktop/exercise41_input.txt");
            BufferedReader reader=new BufferedReader(new FileReader(myfile));
            String line=null;
            while((line=reader.readLine())!=null){
                addnames(line);
            }
            reader.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    void addnames(String a)
    {
        tree.add(a);
        for(int i=1;i<=a.length();i++)
        {
        }
    }
}
