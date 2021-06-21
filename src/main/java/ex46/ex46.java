package ex46;

import java.util.*;
import java.io.*;

public class ex46 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner console = new Scanner(System.in);
        Scanner input = new Scanner(new File("exercise46_input"));

        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            } else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }

        System.out.println("Total words = " + wordCounts.size());
        int min = console.nextInt();
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count >= min)
                System.out.println(count + "\t" + word);
        }
    }
}
