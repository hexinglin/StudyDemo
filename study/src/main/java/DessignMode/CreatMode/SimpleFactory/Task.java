package DessignMode.CreatMode.SimpleFactory;

import java.util.List;

public interface Task {
    List<Integer> creatTodayTask(int time);
    void accomplishOne(int id);
    Integer getOneTask();

}
