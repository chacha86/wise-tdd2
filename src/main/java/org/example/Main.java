package org.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = """
                1
                2
                """;
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        PrintStream origin = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream customOut = new PrintStream(outputStream);
        System.setOut(customOut);

        System.out.println("aaaa");
        System.out.println("bbbb");
        System.out.println("1");
        System.setOut(origin);
        System.out.println("2");
        System.out.println(outputStream.toString());
        System.out.println("3");
    }
}