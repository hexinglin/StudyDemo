package DessignMode.CreatMode.AbstractFactory;

public class MemoryTaskContent implements TaskContent {
    public boolean begin(int time) {
        System.out.println("this MemoryTaskContent begin");
        return false;
    }

    public boolean accomplish(int time) {
        System.out.println("this MemoryTaskContent accomplish");
        return false;
    }

    public boolean undone(int time) {
        System.out.println("this MemoryTaskContent undone");
        return false;
    }
}
