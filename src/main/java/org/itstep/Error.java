package org.itstep;

public class Error implements Command{
    @Override
    public void execute(String... args) {
        System.out.println("Error");
    }
}
