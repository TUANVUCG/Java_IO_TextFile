package ReadFileExample;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\DELL\\Desktop\\Java_core\\number.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine())!=null){
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum : "+sum);
        } catch (FileNotFoundException e) {
            System.out.println("Not find.....");;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

