package OOPs_Factory;
import java.text.SimpleDateFormat;
import java.util.Date;

class time{
    time(){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(" HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate);
    }

}
public class smartWatch {
    public static void main(String[] args) {
        time t1 = new time();
//        System.out.println(t1.formattedDate);

    }
}
