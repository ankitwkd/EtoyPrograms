package main.controller.VisitorPattern;

public class Turn implements VisitorInterface{
    private Integer param;

    public Turn(Integer param){
        this.param = param;
    }

    @Override
    public void accept(CommandVisitor commandVisitor) {
        commandVisitor.visit(this);
    }
}
