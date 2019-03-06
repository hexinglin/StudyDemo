package DessignMode.CreatMode.SimpleFactory;

public class main {

    public static void main(String[] args){
        int time =1;
        Task task = new MemoryTask();
        task.creatTodayTask(time);
        task.accomplishOne(1);
        Task task2 = new WordTask();
        task2.creatTodayTask(time);
        task2.accomplishOne(1);
    }




}
