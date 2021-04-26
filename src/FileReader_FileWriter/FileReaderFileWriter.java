package FileReader_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriter {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("C:\\Users\\DELL\\Desktop\\Java_core\\text.txt");
            writer = new FileWriter("C:\\Users\\DELL\\Desktop\\Java_core\\ContainWriter.txt");
            int check;
            while ((check=reader.read())!=-1){
                System.out.print((char)check);
                writer.write(check);
            }
            writer.write("\nĐây là file Writer!!!");
        } catch (IOException e) {
            System.err.println("Không tìm thấy file !!!");
        }
        finally {
            if(reader !=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(writer !=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
