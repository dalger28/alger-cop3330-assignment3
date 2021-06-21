package ex42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

public class ex42
    {

        public ex42(String last, int first, float salary) {

        }

        public static void main(String [] args )
        {
            List<ex42> invItem = new ArrayList<>();
            try
            {
                BufferedReader br = new BufferedReader(new FileReader("exercise42_input.txt"));

                String fileRead = br.readLine();

                while (fileRead != null)
                {
                    String[] tokenize = fileRead.split(",");

                    String last = tokenize[0];
                    int first = Integer.parseInt(tokenize[1]);
                    float salary = Float.parseFloat(tokenize[2]);

                    ex42 tempObj = new ex42(last, first, salary);

                    invItem.add(tempObj);

                    fileRead = br.readLine();
                }
                br.close();
            }
            catch (FileNotFoundException fnfe)
            {
                System.out.println("file not found");
            }

            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
            for (ex42 each : invItem)
            {
                System.out.println("====================");
                System.out.println(each);
                System.out.println();
            }

        }

    }