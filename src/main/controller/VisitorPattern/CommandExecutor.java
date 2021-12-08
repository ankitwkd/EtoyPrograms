package main.controller.VisitorPattern;


public class CommandExecutor implements CommandVisitor {

    @Override
    public void visit(Move move) {
        move.execute();
    }

    @Override
    public void visit(Turn turn) {
        turn.execute();
    }
}
