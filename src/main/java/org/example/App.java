package org.example;

import java.util.Scanner;

public class App {
    private final Scanner scanner;
    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        String cmd = scanner.nextLine();
        if(cmd.equals("종료")) {
            System.out.println("명언앱을 종료합니다.");
        }
    }
}
