package org.itstep;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            TypeCommand command = TypeCommand.convert(scanner.nextLine());
            command.getCommand().execute();
        }
    }
}
