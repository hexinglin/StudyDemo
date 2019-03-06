package DessignMode.CreatMode.Builder;

public class Main {
    
    public static void main(String[] args){
        Person person = new Person.Builder(1, "张小毛")
                .age(22).sex("男").desc("使用builder模式").build();
        System.out.println(person.toString());
    }
    
    
}
