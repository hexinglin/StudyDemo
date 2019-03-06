package DessignMode.CreatMode.AbstractFactory;

import java.util.List;

public class TokgoTask implements Task {
    private TaskContent memoryTaskContent;
    private TaskContent wordTaskContent;


    public List<Integer> creatTodayTask(int time) {
        memoryTaskContent = new MemoryTaskContent();
        wordTaskContent = new WordTaskContent();
        wordTaskContent.begin(time);
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

