package homework.exercises;

import lombok.val;

import java.util.Random;

public class RandomUtil {

    private static Random random = new Random();

    public static int getRandomInRangeInteger( int min , int max) {
        return random.ints(min, max).findFirst().getAsInt();
    }

    public static double getRandomInRangeDouble( int min , int max) {
        return random.doubles().findFirst().getAsDouble();
    }
}
