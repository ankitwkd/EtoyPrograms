package main.controller.VisitorPattern;

public class Move implements VisitorInterface{
    private Integer param;

    public Move(Integer param){
        this.param = param;
    }

    @Override
    public void accept(CommandVisitor commandVisitor) {
        commandVisitor.visit(this);
    }
}
