package DessignMode.CreatMode.AbstractFactory;

public class main {

    public static void main(String[] args){
        int time =1;
        Task task = new TokgoTask();
        task.creatTodayTask(time);
        task.accomplishOne(1);
    }




}
