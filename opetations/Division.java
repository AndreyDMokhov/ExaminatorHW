package homework.exercises.opetations;

import homework.exercises.Exercise;
import homework.exercises.OperationEnum;

import static homework.exercises.RandomUtil.getRandomInRangeInteger;

public class Division implements Operation {

    @Override
    public Exercise getExercise(int min, int max) {
        double a = getRandomInRangeInteger(min, max);
        double b;
        do{
             b = getRandomInRangeInteger(min, max);
        }while (b==0);

        double answer =  a / b;
        return Exercise.builder().
                a(a).
                b(b).
                answer(answer).
                operationEnum(OperationEnum.DIV)
                .build();
    }
}
