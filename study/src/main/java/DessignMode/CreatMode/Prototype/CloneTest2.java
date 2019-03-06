package DessignMode.CreatMode.Prototype;

public class CloneTest2
{
    public static void main(String[] args) throws Exception
    {
        Teacher teacher = new Teacher();
        teacher.setAge(40);
        teacher.setName("teacher zhang");

        Student2 student2 = new Student2();
        student2.setAge(14);
        student2.setName("lisi");
        student2.setTeacher(teacher);

        Student2 student3 = (Student2)student2.clone();
        //这里是深复制，所以这时候Student2中的teacher就是teacher这个对象的一个复制，就和student3是student2的一个复制
        //所以下面teacher.setName只是对他原来的这个对象更改，但是复制的那个并没有更改
        System.out.println(student3.getAge());
        System.out.println(student3.getName());
        System.out.println(student3.getTeacher().getAge());
        teacher.setName("teacher niesong");//不会又任何影响
        System.out.println(student3.getTeacher().getName());

    }

}

class Student2 implements Cloneable
{
    private int age;
    private String name;
    private Teacher teacher;
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
    public Teacher getTeacher()
    {
        return teacher;
    }
    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        //这一步返回的这个student2还只是一个浅克隆，
        Student2 student2 = (Student2)super.clone();
        //然后克隆的过程中获得这个克隆的student2，然后调用这个getTeacher这个方方法得到这个Teacher对象。然后实现克隆。在设置到这个student2中的Teacher。
        //这样实现了双层克隆使得那个teacher对象也得到了复制。
        student2.setTeacher((Teacher)student2.getTeacher().clone());
        //双层克隆使得那个teacher对象也得到了复制
        return student2;
    }
}
class Teacher implements Cloneable
{
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
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
