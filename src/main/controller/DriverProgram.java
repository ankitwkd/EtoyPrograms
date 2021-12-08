package main.controller;


import main.controller.VisitorPattern.CommandExecutor;
import main.controller.VisitorPattern.Visitor;
import main.controller.VisitorPattern.VisitorInterface;
import main.model.Turtle;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Class that reads a file and runs the program.
 */
public class DriverProgram {
    private Turtle turtle;
    DriverProgram(){
        turtle = new Turtle();
    }

    public static void main(String args[]) throws IOException{
        ArrayList<VisitorInterface> commands = new ArrayList<>();
        Turtle turtle = new Turtle();
        ProgramReader programReader = new ProgramReader("/Users/wkd/IdeaProjects/EtoyPrograms/src/main/controller/TurtleProgram.txt", turtle);
        commands = programReader.read();

        //Pass to commands to Visitor
        Visitor visitor = new Visitor(commands);
        visitor.accept(new CommandExecutor());
        turtle.print();
    }
}
