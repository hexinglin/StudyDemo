package DessignMode.CreatMode.SimpleFactory;

public class WordTaskContent implements TaskContent {
    public boolean begin(int time) {
        System.out.println("this WordTaskContent begin");
        return false;
    }

    public boolean accomplish(int time) {
        System.out.println("this WordTaskContent accomplish");
        return false;
    }

    public boolean undone(int time) {
        System.out.println("this WordTaskContent undone");
        return false;
    }
}
