package DessignMode.StructureMode.Bridge;

public class MyBridge{

    private Sourceable sourceable;

    public MyBridge(String flag) {
        if ("s1".equals(flag))
            this.sourceable = new SourceSub1();
        else if ("s2".equals(flag)){
            this.sourceable = new SourceSub2();
        }


    }

    public void method(){
        sourceable.method();
    }

    public Sourceable getSource() {
        return sourceable;
    }

}  