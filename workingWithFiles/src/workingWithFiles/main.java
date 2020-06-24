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
        File file = new File("C:\\Users\\sel�uk\\Desktop\\Bilisayardan ald���m�z bir dosya uzant�s�d�r\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya olu�turuldu.");
            } else {
                //Dosya olu�tulmu�sa ayn� dosya olu�turulmayacakt�..
                System.out.println("Dosya zaten var..");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void getFileInfo() {
        File file = new File("C:\\Users\\sel�uk\\Desktop\\Bilisayardan ald���m�z bir dosya uzant�s�d�r\\students.txt");
        if (file.exists()) {  //B�yle bir dosya varsa bu dosya ile bilgileri okumu� oluyoruz..
            System.out.println("Dosya ad�:" + file.getName());//Dosya ad�n� okuduk.
            System.out.println("Dosya yolu:" + file.getAbsolutePath());//Dosya path'i okuduk.
            System.out.println("Dosya yaz�labilir mi:" + file.canRead());//Dosya okunabilir mi.
            System.out.println("Dosya boyutu:" + file.length());//Dosya b�y�kl��� uzunlu�u.

        }


    }

    //Dosya okuma i�lemleri
//
    public static void readFile() {
        File file = new File("C:\\Users\\sel�uk\\Desktop\\Bilisayardan ald���m�z bir dosya uzant�s�d�r\\students.txt");
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
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\sel�uk\\Desktop\\Bilisayardan ald���m�z bir dosya uzant�s�d�r\\students.txt",true));
            writer.newLine();
            writer.write("Sel�uk");
            System.out.println("Dosya yaz�ld�.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

