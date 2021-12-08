package main.model;

/**
 * POJO class for each Command
 * type = Type of instruction (Eg: MOVE, TURN etc.)
 * param = Distance/Degrees by which the turtle should move or turn
 */
public class Command {
    private String type;
    private String param;
    public Command(String type, String param) {
        this.type = type;
        this.param = param;
    }
}
