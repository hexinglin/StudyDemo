package DessignMode.CreatMode.Prototype;

import java.io.*;

public class CloneTest3
{
    public static void main(String[] args) throws Exception
    {
        Teacher3 teacher3 = new Teacher3();
        teacher3.setAge(23);
        teacher3.setName("niesong");

        Student3 student3 = new Student3();
        student3.setAge(50);
        student3.setName("wutao");
        student3.setTeacher3(teacher3);

        Student3 ss = (Student3)student3.deepCopt();
        System.out.println(ss.getAge());
        System.out.println(ss.getName());

        System.out.println("---------------------");
        System.out.println(ss.getTeacher3().getAge());
        System.out.println(ss.getTeacher3().getName());

        System.out.println("-----------------------");

        ss.getTeacher3().setAge(7777);
        ss.getTeacher3().setName("hhhhh");

        System.out.println(teacher3.getAge());
        System.out.println(teacher3.getName());
        //虽然上面的已经改了，但是改的是那个复制对象后的那个里面的，然后那个原来的那个里面的并没有改，下面验证：：：

        System.out.println("-----------------");

        System.out.println(ss.getTeacher3().getAge());
        System.out.println(ss.getTeacher3().getName());





    }


}

class Teacher3 implements Serializable
{
    //  上面的那个警告可以直接消除，除了使用在设置中不显示这个警告，还可以使用下面的这两条语句中的任何一条语句
//	这个serialVersionUID为了让该类别Serializable向后兼容
//	private static final long serialVersionUID = 1L;
//	private static final long serialVersionUID = 8940196742313994740L;
    private int age;
    private String name;
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
class Student3 implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
    private Teacher3 teacher3;
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Teacher3 getTeacher3()
    {
        return teacher3;
    }
    public void setTeacher3(Teacher3 teacher3)
    {
        this.teacher3 = teacher3;
    }
    //使得序列化student3的时候也会将teacher序列化
    public Object deepCopt()throws Exception
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //将当前这个对象写到一个输出流当中，，因为这个对象的类实现了Serializable这个接口，所以在这个类中
        //有一个引用，这个引用如果实现了序列化，那么这个也会写到这个输出流当中

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
        //这个就是将流中的东西读出类，读到一个对象流当中，这样就可以返回这两个对象的东西，实现深克隆
    }
}