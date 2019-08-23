package homework.exercises.opetations;

import homework.exercises.Exercise;
import homework.exercises.OperationEnum;

import static homework.exercises.RandomUtil.getRandomInRangeInteger;

public class Sum implements Operation {

    @Override
    public Exercise getExercise(int min, int max) {
        int a = getRandomInRangeInteger(min, max);
        int b = getRandomInRangeInteger(min, max);
        int answer = a + b;
        return Exercise.builder().
                a(a).
                b(b).
                answer(answer).
                operationEnum(OperationEnum.SUM)
                .build();
    }
}
