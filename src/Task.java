import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "taskID", "taskName", "taskStatus", "taskDescription", "createdAt", "updatedAt" })
public class Task {
    private int taskID;
    private String taskName;
    private String taskStatus;
    private String taskDescription;
    private Instant createdAt;
    private Instant updatedAt;

    public Task() {
    }

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
        return "ID: " + taskID + ", taskName=" + taskName + ", taskStatus=" + taskStatus + ", taskDescription="
                + taskDescription + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Task other = (Task) obj;
        return taskID == other.taskID;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(taskID);
    }

}
