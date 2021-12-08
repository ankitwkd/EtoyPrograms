package main.controller.VisitorPattern;

public interface CommandVisitor {
    void visit(Move move);
    void visit(Turn turn);
}
