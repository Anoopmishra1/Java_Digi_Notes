package OOPs_Factory;
import java.util.Scanner;
class Teacher {
    String name;
    String subject;
    float basic, da, hra, salary;

    float calcu() {
        salary = basic + da + hra;
        return salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        name = sc.next();
        System.out.println("Enter your Subject");
        subject = sc.next();
        System.out.println("Enter your Basic");
        basic = sc.nextFloat();
        System.out.println("Enter your DA");
        da = sc.nextFloat();
        System.out.println("Enter your HRA");
        hra = sc.nextFloat();

        calcu();
    }
    void output() {
        System.out.println("Teacher name is " + name);
        System.out.println("Teacher Subject is " + subject);
        System.out.println("Teacher total salary is " + salary);
    }
}


public class teachersSalary {
    public static void main(String[] args) {
//        Teacher t1 = new Teacher();
//        t1.input();
//        t1.output();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Teachers: ");
        int numTeachers = sc.nextInt();
        Teacher[] t1 = new Teacher[numTeachers];
        for (int i = 0; i < numTeachers; i++) {
            t1[i] = new Teacher();
            t1[i].input();
            t1[i].output();

        }

    }
}
