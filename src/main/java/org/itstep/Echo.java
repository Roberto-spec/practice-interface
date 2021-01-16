package org.itstep;

public class Echo implements Command{
    @Override
    public void execute(String... args) {
        System.out.println("Hello World");
    }
}
