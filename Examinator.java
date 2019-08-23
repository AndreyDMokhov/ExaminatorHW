package homework.exercises;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import homework.exercises.opetations.Operation;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    List<Class<? extends Operation>> exercisesClass;
final int MIN = 0;
final int MAX = 100;

    public Examinator() {
        Reflections scanner = new Reflections("homework.exercises.opetations");
        Set<Class<? extends Operation>> classes = scanner.getSubTypesOf(Operation.class);
        exercisesClass = classes.stream().filter(iClass -> !Modifier.isInterface(iClass.getModifiers())).collect(Collectors.toList());
    }

    public List<Exercise> getExercises(int amount) {
        List<Exercise> exercises = new ArrayList<>();
        for (int i=0; i<amount; i++) {
            exercises.add(getOperation().getExercise(MIN,MAX));
        }
        return exercises;
    }


    @SneakyThrows
    private Operation getOperation()  {
        int i = RandomUtil.getRandomInRangeInteger(0, exercisesClass.size());
        return exercisesClass.get(i).getDeclaredConstructor().newInstance();
    }

}
