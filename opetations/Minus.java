package homework.exercises.opetations;

import homework.exercises.Exercise;
import homework.exercises.OperationEnum;

import static homework.exercises.RandomUtil.getRandomInRangeDouble;
import static homework.exercises.RandomUtil.getRandomInRangeInteger;

public class Minus implements Operation {

    @Override
    public Exercise getExercise(int min, int max) {
        double a = getRandomInRangeInteger(min, max);
        double b = getRandomInRangeInteger(min, max);
        double answer = a-b;

       return Exercise.builder().
                a(a).
                b(b).
                answer(answer)
               .operationEnum(OperationEnum.MINUS)
               .build();
    }
}
