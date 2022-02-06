import java.net.SocketOption;

public class dogprtp {
    double speed;
    String name;
    String race;

    void run(){
        String text = "";
        for (int i = 0; i< speed; i++){
            text +="run ";
        }
        System.out.print(text);
    }

    String info(){
        return "Name of a dog " + name + "race is " + race + "and speed are: " + speed;
    }
}
