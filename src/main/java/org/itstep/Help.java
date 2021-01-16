package org.itstep;

public class Help implements Command {
    @Override
    public void execute(String... args) {
        System.out.println("Help executed");
    }
}
