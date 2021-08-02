package com.company;

import java.io.*;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) throws IOException {
            FileReader input = new FileReader("m1.txt");
            LineNumberReader count = new LineNumberReader(input);

            {
                while (count.skip(Long.MAX_VALUE) > 0) {
                    // Loop just in case the file is > Long.MAX_VALUE or skip() decides to not read the entire file
                }

                int result = count.getLineNumber();
                System.out.println(result);
            }

        }
    }