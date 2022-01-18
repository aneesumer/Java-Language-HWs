// Task 1(a)

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task1a {
    public static void main(String[] args) {
        File input = new File(args[0]);
        try {
        
            BufferedReader br = new BufferedReader(new FileReader(input));
            
            String line;
            
            while ((line = br.readLine()) != null) {
                int sum = 0;
                String[] parts = line.split(",");
                for (String num : parts) {
                    sum = sum + Integer.parseInt(num);
                }

                System.out.println(sum);
              
            }

            br.close();
         

        } catch (Exception e) {
            System.out.println("Error Catched");
        }
    }
}

// Task 1(b)

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

//import java.io.*;

class Task1b {
    public static void main(String[] args) {

        File input = new File(args[0]);
        File output = new File(args[1]);
        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            PrintWriter pr = new PrintWriter(output);
            String line;

            while ((line = br.readLine()) != null) {
                int sum = 0;
                String[] parts = line.split(",");
                for (String num : parts) {
                    sum = sum + Integer.parseInt(num);
                }

                System.out.println(sum);
                pr.println(sum);

            }

            br.close();
            pr.close();

        } catch (Exception e) {
            System.out.println("Error Catched");
        }
    }
}
