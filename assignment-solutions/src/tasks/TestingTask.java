package tasks;

import tasks.Task.Status;

public class TestingTask {
  public static void main(String[] args) {
      System.out.println("Enumeration values:");
      for (Status status : Status.values()) {
          System.out.println("|(Status, Value)=("+status+","+status.getValue()+").");
      }

      Task task = new Task("Lab 2");
      System.out.println(task);
      task.setStatus(Status.STARTED);
      System.out.println("\n"+task);
      task.setStatus(Status.IN_PROGRESS);
      System.out.println("\n"+task);
      task.setStatus(Status.COMPLETED);
      System.out.println("\n"+task);
  }
}