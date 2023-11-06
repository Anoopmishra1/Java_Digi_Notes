package OOPs_Factory;
class constructorFiles{
    private int id;
    private  String name;
    constructorFiles(int i, String n){
        id = i;
        name = n;
    }
    constructorFiles(){
        id = 34;
        name = "anooooppppppppp";
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
}
public class Constructors {
    public static void main(String[] args) {
        constructorFiles s1 = new constructorFiles(37,"anoop" );
        constructorFiles s2 = new constructorFiles();
        System.out.println(s1.getid());
        System.out.println(s1.getname());
        System.out.println(s2.getid());
        System.out.println(s2.getname());

    }
}
