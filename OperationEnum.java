package homework.exercises;

import homework.exercises.opetations.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public enum OperationEnum {
    SUM('+', new Sum()),
    MINUS('-', new Minus()),
    MULT('*', new Multiplication()),
    DIV('/', new Division());
    private char symbol;
    private final Operation handler;

    public Operation getOperation() {
        return handler;
    }

    public char getSymbol() {
        return symbol;
    }
}
