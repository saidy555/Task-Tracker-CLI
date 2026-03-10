import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class tasks {

    public static ArrayList<Task> tasksList = new ArrayList<>(
            Arrays.asList(
                    new Task(1, "pray", "todo", "pray your 5 daily prayers", Instant.now(), null),
                    new Task(2, "study", "todo", "study java", Instant.now(), null),
                    new Task(3, "train", "todo", "back day", Instant.now(), null)));

    static void main(String[] args) {
        if (args.length == 0) {
            for (Task task : tasksList) {
                System.out.println(task.toString());
            }
        }
    }
}
