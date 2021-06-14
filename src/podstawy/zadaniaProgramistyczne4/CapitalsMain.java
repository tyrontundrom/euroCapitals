package podstawy.zadaniaProgramistyczne4;

import java.util.Random;
import java.util.Scanner;

public class CapitalsMain {
    public static void main(String[] args) {

        Capitals capitals = new Capitals();
        System.out.println("Dopasuj odpowiednią stolicę do państw");

        int i = 1;
        while (i < 44) {
            capitals.assign();
            capitals.getUserText();
            capitals.equalCapital();
            capitals.falseAnswer();
            i++;
        }

        int result = (capitals.getCouner() * 100) / 44;
        System.out.println("Twój wynik to " + result + "%");
    }


}
