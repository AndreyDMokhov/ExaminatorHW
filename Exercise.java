package homework.exercises;

import lombok.*;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Exercise {

private double a;
private double b;
private double answer;
private OperationEnum operationEnum;  //enum


    @Override
    public String toString() {

        return "Exercise  " +
                 a +
                 operationEnum.getSymbol() +
                 b +
                 "=" +
                answer;
    }
}
