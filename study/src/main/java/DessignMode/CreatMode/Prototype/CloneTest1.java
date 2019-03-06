package DessignMode.CreatMode.Prototype;

public class CloneTest1
{
    public static void main(String[] args) throws Exception
    {
        Student student = new Student();
        student.setAge(24);
        student.setName("niesong");
        Student student2 = (Student)student.clone();
        //这个是调用下面的那个方法，然后把这个这个对象Clone到student
        System.out.println("Age:" + student2.getAge() + " " + "Name:" + student2.getName());

        System.out.println("---------------------");
        student2.setAge(23);
        //克隆后得到的是一个新的对象，所以重新写的是student2这个对象的值

        System.out.println(student.getAge());
        System.out.println(student2.getAge());
    }


}
//克隆的对象必须实现Cloneable这个接口，而且需要重写clone方法

class Student implements Cloneable
{
    private int age;
    //定义为private说明这个成员变量只能被被当前类中访问，如果外部需要获得，那么就只能通过getAge方法进行获取
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
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Object object = super.clone();
        return object;
    }
}
