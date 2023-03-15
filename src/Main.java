import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    byte currentArrayCount;
    BufferedReader bF = new BufferedReader(new InputStreamReader(System.in));

    String tempInput;
    public int tempage;
    String tempName = tempInput;


    public String[] names = new String[100];
    public byte[] ages = new byte[100];

    public void addUser(String name, byte age) {
        if (currentArrayCount < names.length) {
            names[currentArrayCount] = name;
            ages[currentArrayCount] = age;
            currentArrayCount++;
        } else {
            System.out.println("You cannot add more than 100 Users!");
        }

    }

    public int getUser(String name) {
        for (int i = 0; i < names.length; ) {
            if (name.equals(names[i])) {
                tempage = ages[i];
                break;
            } else {
                i++;
            }
        }
        return tempage;
    }


    public static void main(String[] args) throws IOException {
        Main m = new Main();
        Ui UI = new Ui(m);
        UI.setVisible(true);


    }


}

