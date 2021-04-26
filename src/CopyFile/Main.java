package CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\DELL\\Desktop\\Java_core\\text.txt");
            fileOutputStream = new FileOutputStream("C:\\Users\\DELL\\Desktop\\Java_core\\Contain text.txt");
            int check;
            while ((check = fileInputStream.read()) != -1) {
                System.out.print((char) check);
                fileOutputStream.write(check);
            }
        } catch (IOException e) {
            System.err.println("Không tìm thấy file !!!");
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
