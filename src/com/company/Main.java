package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("file");

        for (int i = 48; i <= 57; i++)
            writer.write((char) i + " ");
        writer.write("      ");

        for (int i = 65; i <= 90; i++)
            writer.write((char) i + " ");
        writer.write("      ");

        for (int i = 97; i <= 122; i++)
            writer.write((char) i + " ");

        writer.close();
        FileReader reader = new FileReader("file");
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }
    }
}
