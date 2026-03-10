import java.time.Instant;

public class Task {
    private int taskID;
    private String taskName;
    private String taskStatus;
    private String taskDescription;
    private Instant createdAt;
    private Instant updatedAt;

    public Task(int taskID, String taskName, String taskStatus, String taskDescription, Instant createdAt,
            Instant updatedAt) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskStatus = taskStatus;
        this.taskDescription = taskDescription;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Task [taskID=" + taskID + ", taskName=" + taskName + ", taskStatus=" + taskStatus + ", taskDescription="
                + taskDescription + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

}
