package tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    enum Status {
        CREATED(0), STARTED(1), IN_PROGRESS(2), COMPLETED(3);

        private final int value;

        Status(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // read-only field
    private final int id;
    private String name;
    private Status status;
    // read-only field
    private final Date createdAt;

    public Task(String name) {
        this.id = this.hashCode();
        this.name = name;
        this.status = Status.CREATED;
        this.createdAt = new Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if (status.getValue() <= this.status.getValue()) {
            throw new IllegalArgumentException("A task cannot be set to a status whose value is less than or equal to its current status");
        }
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss aaa .SSSZ");
        return "|Task ID#: <<" + id + ">>.\n" + 
                "|Task Name: <<" + name + ">>.\n" +
                "|Task created on <<" + dateFormat.format(createdAt)+">>.\n"+
                "|Task status <<" + status +">>.";
    }
}