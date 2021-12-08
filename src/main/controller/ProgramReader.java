package main.controller;

import main.controller.VisitorPattern.Move;
import main.controller.VisitorPattern.Turn;
import main.controller.VisitorPattern.VisitorInterface;
import main.model.Turtle;

import java.io.*;
import java.util.ArrayList;

public class ProgramReader {
    private static File file;
    private static BufferedReader br;
    private Turtle turtle;

    public ProgramReader(String programName, Turtle turtle){
        file = new File(programName);
        try {
            br = new BufferedReader(new FileReader(file));
            this.turtle = turtle;
        } catch (FileNotFoundException e) {
            //Handle exception
        }
    }
    public ArrayList<VisitorInterface> read() throws IOException {
        String line, type;
        Integer param;
        String[] tokens;
        ArrayList<VisitorInterface> output = new ArrayList<>();
        while((line = br.readLine()) != null){
            tokens = line.split(" ");
            type = tokens[0];
            param = Integer.parseInt(tokens[1]);
            VisitorInterface command = null;
            if (type.equalsIgnoreCase("MOVE")){
                command = new Move(param, turtle);
            }else if (type.equalsIgnoreCase("TURN")){
                command = new Turn(param, turtle);
            }
            output.add(command);
        }
        return output;
    }
}
