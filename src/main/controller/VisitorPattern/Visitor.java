package main.controller.VisitorPattern;

import java.util.List;

public class Visitor implements VisitorInterface{
    private final List<VisitorInterface> commands;

    public Visitor(List<VisitorInterface> commands) {
        this.commands = commands;
    }


    @Override
    public void accept(CommandVisitor commandVisitor) {
        for(VisitorInterface c : commands){
            c.accept(commandVisitor);
        }
    }
}
