package FileCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\DELL\\Desktop\\Java_core\\File CSV.txt");
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String fileds[]=line.split(",");
//                System.out.print("stt: "+ fileds[0]+" ten viet tat: "+fileds[1]+"ten: "+fileds[2]+"\n");
                System.out.print("STT :");
                for(int i =0;i<fileds.length;i++){
                    System.out.print(fileds[i]);
                }
                System.out.println("");
            }
        } catch (IOException e){
            System.err.println("ko tim thay ");
        }
    }
}
