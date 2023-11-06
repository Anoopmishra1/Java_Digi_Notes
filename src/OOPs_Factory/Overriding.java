package OOPs_Factory;
class animal1{
    public void dog(){
        System.out.println("Dogs are bark animal1");
    }
    public void cat(){
        System.out.println("Cat are meows");
    }
}
class animal2 extends animal1{
    @Override
    public void dog(){
        System.out.println("Dogs are bark animal2");
    }
    public void birds(){
        System.out.println("birds are cheeuuuuu");
    }
}
public class Overriding {
    public static void main(String[] args) {
        animal1 s1 = new animal1();
        s1.dog();
        animal2 s2 = new animal2();
        s2.dog();
        animal1 s3 = new animal2();
        s3.dog();



    }
}
