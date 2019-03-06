package DessignMode.CreatMode.SimpleFactory;

import java.util.List;

public class MemoryTask implements Task{
    private MemoryTaskContent memoryTaskContent;


    public List<Integer> creatTodayTask(int time) {
        memoryTaskContent = new MemoryTaskContent();
        memoryTaskContent.begin(time);
        System.out.println("MemoryTask creatTodayTask ok");

        return null;
    }

    public void accomplishOne(int id) {
        memoryTaskContent.accomplish(1);
    }

    public Integer getOneTask() {
        return null;
    }
}
