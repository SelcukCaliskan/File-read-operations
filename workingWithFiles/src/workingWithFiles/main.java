package workingWithFiles;

import java.io.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\selçuk\\Desktop\\Bilisayardan aldýðýmýz bir dosya uzantýsýdýr\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluþturuldu.");
            } else {
                //Dosya oluþtulmuþsa ayný dosya oluþturulmayacaktý..
                System.out.println("Dosya zaten var..");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void getFileInfo() {
        File file = new File("C:\\Users\\selçuk\\Desktop\\Bilisayardan aldýðýmýz bir dosya uzantýsýdýr\\students.txt");
        if (file.exists()) {  //Böyle bir dosya varsa bu dosya ile bilgileri okumuþ oluyoruz..
            System.out.println("Dosya adý:" + file.getName());//Dosya adýný okuduk.
            System.out.println("Dosya yolu:" + file.getAbsolutePath());//Dosya path'i okuduk.
            System.out.println("Dosya yazýlabilir mi:" + file.canRead());//Dosya okunabilir mi.
            System.out.println("Dosya boyutu:" + file.length());//Dosya büyüklüðü uzunluðu.

        }


    }

    //Dosya okuma iþlemleri
//
    public static void readFile() {
        File file = new File("C:\\Users\\selçuk\\Desktop\\Bilisayardan aldýðýmýz bir dosya uzantýsýdýr\\students.txt");
        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);



            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\selçuk\\Desktop\\Bilisayardan aldýðýmýz bir dosya uzantýsýdýr\\students.txt",true));
            writer.newLine();
            writer.write("Selçuk");
            System.out.println("Dosya yazýldý.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

