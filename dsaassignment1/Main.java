package DsaAssignment1;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        Task task1 = new Task("do physical activity", "run walk for 30 minutes");
        Task task2 = new Task("doing homework ", "finish physics homework");
        Task task3 = new Task("take exam ", "taking Biology exam");

        toDoList.addToDo(task1);
        toDoList.addToDo(task2);
        toDoList.addToDo(task3);

        toDoList.markToDoAsCompleted("do physical activity");

        toDoList.viewToDoList();
    }
}