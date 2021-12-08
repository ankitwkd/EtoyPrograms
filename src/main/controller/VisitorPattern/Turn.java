package main.controller.VisitorPattern;

import main.model.Turtle;

public class Turn implements VisitorInterface{
    private Integer param;
    private Turtle turtle;

    public Turn(Integer param, Turtle turtle){
        this.param = param;
        this.turtle = turtle;
    }

    @Override
    public void accept(CommandVisitor commandVisitor) {
        commandVisitor.visit(this);
    }

    public void execute(){
        turtle.turn(param);
    }
}
