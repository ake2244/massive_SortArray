package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static long getLineCount(File file) throws IOException {

        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(file), 1024)) {

            byte[] c = new byte[1024];
            boolean empty = true,
                    lastEmpty = false;
            long count = 0;
            int read;
            while ((read = is.read(c)) != -1) {
                for (int i = 0; i < read; i++) {
                    if (c[i] == '\n') {
                        count++;
                        lastEmpty = true;
                    } else if (lastEmpty) {
                        lastEmpty = false;
                    }
                }
                empty = false;
            }

            if (!empty) {
                if (count == 0) {
                    count = 1;
                } else if (!lastEmpty) {
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) throws IOException {

        String namef = "notes1.txt";

        //System.out.print(getLineCount("C:\\Users\\Alina\\IdeaProjects\\Massive\\m.txt"));
    int count1=0;

        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(namef), 2048)) {

            byte[] c = new byte[2048];
            boolean empty = true,
                    lastEmpty = false;
            //int count1 = 0;
            int read;
            while ((read = is.read(c)) != -1) {
                for (int i = 0; i < read; i++) {
                    if (c[i] == '\n') {
                        count1++;
                        lastEmpty = true;
                    } else if (lastEmpty) {
                        lastEmpty = false;
                    }
                }
                empty = false;
            }

            if (!empty) {
                if (count1 == 0) {
                    count1 = 1;
                } else if (!lastEmpty) {
                    count1++;
                }
            }

            // return count;


        } catch(Exception e){}

        System.out.print("\n Строк\n");
        System.out.println(count1);


//D:\Massive\ip_addresses
      //  FileReader input = new FileReader(namef);

       // LineNumberReader count = new LineNumberReader(input);

         //  while (count.skip(Long.MAX_VALUE) > 0) {
          //  }
       //     Long l1 = Long.parseUnsignedLong("17916881237904312345");

       //  Long l1 = count.getLineNumber();
        //    System.out.println("Строк " + l1);


        File f = new File(namef);

        System.out.println(f.exists());

        Scanner scanner = new Scanner(f);

        String[] myInts = new String[count1];
        int mySpot = 0;
        while (scanner.hasNext()) {
            myInts[mySpot] = scanner.next();
            mySpot++;
        }

        Arrays.sort(myInts);

        int x = 0;
        int y=0;
        for (int i=0; i<count1-1; i++){
            if(myInts[i].equals(myInts[i+1])){
                x=x+1;
                            }
            else {
                y=y+1;
            }
        }
        System.out.print("\n Повтор\n");
        System.out.println(x);
        System.out.print("\n Не повтор\n");
        System.out.println(y+1);

    }


}