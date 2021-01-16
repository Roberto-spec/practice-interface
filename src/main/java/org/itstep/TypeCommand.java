package org.itstep;

public enum TypeCommand {
    Help, Echo, Now, Exit, Error;

    private Command command;

    TypeCommand() {
        switch (this.name()){
            case "Help":
                this.command = new Help();
                break;
            case "Echo":
                this.command = new Echo();
                break;
            case "Now":
                this.command = new Now();
                break;
            case "Exit":
                this.command = new Exit();
                break;
            default:
                this.command = new Error();
                break;
        }
    }
    public static TypeCommand convert(String str){
        switch (str){
            case "help":
                return Help;
            case "echo":
                return Echo;
            case "now":
                return Now;
            case "exit":
                return Exit;
            default:
                return Error;
        }
    }

    public Command getCommand() {
        return command;
    }
}
