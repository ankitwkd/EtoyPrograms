package main.controller;

import main.controller.VisitorPattern.Move;
import main.controller.VisitorPattern.Turn;
import main.controller.VisitorPattern.VisitorInterface;
import main.model.Command;

import java.io.*;
import java.util.ArrayList;

public class ProgramReader {
    private static File file;
    private static BufferedReader br;

    public ProgramReader(String programName){
        file = new File(programName);
        try {
            br = new BufferedReader(new FileReader(file));
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
            VisitorInterface command;
            if (type == "MOVE"){
                command = new Move(param);
            }else{
                command = new Turn(param);
            }
            output.add(command);
        }
        return output;
    }
}
