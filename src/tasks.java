import java.io.File;
import java.time.Instant;
import java.util.ArrayList;

import tools.jackson.databind.SerializationFeature;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.type.CollectionType;
import tools.jackson.databind.type.TypeFactory;

public class tasks {

    public static ArrayList<Task> tasksList;
    public static JsonMapper mapper = JsonMapper.builder().enable(SerializationFeature.INDENT_OUTPUT).build();

    static void main(String[] args) {
        loadJson();

        updateTask(2, "updated task", "task desc updated");

        if (args.length == 0) {
            for (Task task : tasksList) {
                System.out.println(task.toString());
            }
        }

        saveJson();
    }

    public static void loadJson() {
        try {

            CollectionType typeReference = TypeFactory.createDefaultInstance().constructCollectionType(ArrayList.class,
                    Task.class);
            tasksList = mapper.readValue(new File("." + File.separator + "tasks.json"), typeReference);

        } catch (Exception e) {
            tasksList = new ArrayList<>();
        }
    }

    public static void saveJson() {
        try {
            mapper.writeValue(new File("." + File.separator + "tasks.json"), tasksList);
        } catch (Exception e) {
            System.err.println("Failed to save tasks: " + e.getMessage());
        }
    }

    public static void addTask(String taskName, String taskDescription) {
        int newID = tasksList.get(tasksList.size() - 1).getTaskID() + 1;
        tasksList.add(new Task(newID, taskName, "todo", taskDescription, Instant.now(), null));
    }

    public static void deleteTask(int ID) {
        int index = tasksList.indexOf(new Task(ID, null, null, null, null, null));

        if (index == -1) {
            System.out.println("This ID: " + ID + " doesn't exist.");
        } else {
            System.out.println("This ID: " + ID + " does exist.");
            tasksList.remove(index);
        }
    }

    public static void updateTask(int ID, String taskName, String taskDesc) {
        int index = tasksList.indexOf(new Task(ID, null, null, null, null, null));
        if (index == -1) {
            System.out.println("This ID: " + ID + " doesn't exist.");
        } else {
            if (taskName != null) {
                tasksList.get(index).setTaskName(taskName);
                tasksList.get(index).setUpdatedAt(Instant.now());
            }
            if (taskDesc != null) {
                tasksList.get(index).setTaskDescription(taskDesc);
                tasksList.get(index).setUpdatedAt(Instant.now());
            }
        }
    }

    public static void listTasks() {
        for (Task task : tasksList) {
            System.out.println(task.toString());
        }
    }

}
