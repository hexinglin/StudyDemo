package DessignMode.CreatMode.Singleton;

public class Main {

    public static void main(String[] args){
        //使用私有的静态类来创建实例，能保证线程创建唯一，但如果构造函数出现异常将永远无法创建实例。
        Singleton.getInstance();
        //使用静态私有方法创建方法，优缺点和静态类相反
        SingletonTest.getInstance();
    }




}
