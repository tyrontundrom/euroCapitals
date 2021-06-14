package podstawy.zadaniaProgramistyczne4;

import java.util.Random;
import java.util.Scanner;

public class Capitals {


    Random rand = new Random();
    private int counter = 0;

    Scanner keybord = new Scanner(System.in);
    String userText;
    int rand1;

    void assign() {
        rand1 = rand.nextInt(44);
        switch (rand1) {
            case 0:
                System.out.println("Albania");
                break;
            case 1:
                System.out.println("Andora");
                break;
            case 2:
                System.out.println("Austria");
                break;
            case 3:
                System.out.println("Belgia");
                break;
            case 4:
                System.out.println("Białoruś");
                break;
            case 5:
                System.out.println("Bośnia i Hercegowina");
                break;
            case 6:
                System.out.println("Bułgaria");
                break;
            case 7:
                System.out.println("Chorwacja");
                break;
            case 8:
                System.out.println("Czarnogóra");
                break;
            case 9:
                System.out.println("Czechy");
                break;
            case 10:
                System.out.println("Dania");
                break;
            case 11:
                System.out.println("Estonia");
                break;
            case 12:
                System.out.println("Finlandia");
                break;
            case 13:
                System.out.println("Francja");
                break;
            case 14:
                System.out.println("Grecja");
                break;
            case 15:
                System.out.println("Hiszpania");
                break;
            case 16:
                System.out.println("Holandia");
                break;
            case 17:
                System.out.println("Irlandia");
                break;
            case 18:
                System.out.println("Islandia");
                break;
            case 19:
                System.out.println("Liechtenstein");
                break;
            case 20:
                System.out.println("Litwa");
                break;
            case 21:
                System.out.println("Luksemburg");
                break;
            case 22:
                System.out.println("Łotwa");
                break;
            case 23:
                System.out.println("Macedonia Połnocna");
                break;
            case 24:
                System.out.println("Malta");
                break;
            case 25:
                System.out.println("Mołdawia");
                break;
            case 26:
                System.out.println("Monako");
                break;
            case 27:
                System.out.println("Niemcy");
                break;
            case 28:
                System.out.println("Norwegia");
                break;
            case 29:
                System.out.println("Polska");
                break;
            case 30:
                System.out.println("Portugalia");
                break;
            case 31:
                System.out.println("Rosja");
                break;
            case 32:
                System.out.println("Rumunia");
                break;
            case 33:
                System.out.println("San Marino");
                break;
            case 34:
                System.out.println("Serbia");
                break;
            case 35:
                System.out.println("Słowacja");
                break;
            case 36:
                System.out.println("Słowenia");
                break;
            case 37:
                System.out.println("Szwajcaria");
                break;
            case 38:
                System.out.println("Szwecja");
                break;
            case 39:
                System.out.println("Turcja");
                break;
            case 40:
                System.out.println("Ukraina");
                break;
            case 41:
                System.out.println("Węgry");
                break;
            case 42:
                System.out.println("Wielka Brytania");
                break;
            case 43:
                System.out.println("Włochy");
                break;

        }
    }

    void getUserText() {
        userText = keybord.nextLine();

    }

    int getCouner() {
        return counter;
    }

    void equalCapital() {
        if (rand1 == 0 && userText.equalsIgnoreCase("tirana")) {
            System.out.println("dobrze");
            counter += 1;

        } else if (rand1 == 1 && userText.equalsIgnoreCase("andora")) {
            System.out.println("dobrze");
            counter += 1;

        } else if (rand1 == 2 && userText.equalsIgnoreCase("wiedeń")) {
            System.out.println("dobrze");
            counter += 1;

        } else if (rand1 == 3 && userText.equalsIgnoreCase("bruksela")) {
            System.out.println("dobrze");
            counter += 1;

        } else if (rand1 == 4 && userText.equalsIgnoreCase("mińsk")) {
            System.out.println("dobrze");
            counter += 1;

        } else if (rand1 == 5 && userText.equalsIgnoreCase("sarajewo")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 6 && userText.equalsIgnoreCase("sofia")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 7 && userText.equalsIgnoreCase("zagrzeb")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 8 && userText.equalsIgnoreCase("podgorica")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 9 && userText.equalsIgnoreCase("praga")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 10 && userText.equalsIgnoreCase("kopenhaga")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 11 && userText.equalsIgnoreCase("talinn") || userText.equalsIgnoreCase("talin")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 12 && userText.equalsIgnoreCase("helsinki")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 13 && userText.equalsIgnoreCase("paryż")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 14 && userText.equalsIgnoreCase("ateny")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 15 && userText.equalsIgnoreCase("madryt")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 16 && userText.equalsIgnoreCase("amsterdam")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 17 && userText.equalsIgnoreCase("dublin")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 18 && userText.equalsIgnoreCase("rejkjavik") || userText.equalsIgnoreCase("reykjavik")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 19 && userText.equalsIgnoreCase("vaduz")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 20 && userText.equalsIgnoreCase("wilno")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 21 && userText.equalsIgnoreCase("luksemburg")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 22 && userText.equalsIgnoreCase("ryga")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 23 && userText.equalsIgnoreCase("skopje")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 24 && userText.equalsIgnoreCase("valetta")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 25 && userText.equalsIgnoreCase("kiszyniów")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 26 && userText.equalsIgnoreCase("monako")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 27 && userText.equalsIgnoreCase("berlin")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 28 && userText.equalsIgnoreCase("oslo")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 29 && userText.equalsIgnoreCase("warszawa")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 30 && userText.equalsIgnoreCase("lizbona")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 31 && userText.equalsIgnoreCase("moskwa")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 32 && userText.equalsIgnoreCase("bukareszt")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 33 && userText.equalsIgnoreCase("san marino")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 34 && userText.equalsIgnoreCase("belgrad")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 35 && userText.equalsIgnoreCase("bratysława")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 36 && userText.equalsIgnoreCase("lublana")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 37 && userText.equalsIgnoreCase("berno")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 38 && userText.equalsIgnoreCase("sztokholm")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 39 && userText.equalsIgnoreCase("ankara")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 40 && userText.equalsIgnoreCase("kijów")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 41 && userText.equalsIgnoreCase("budapeszt")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 42 && userText.equalsIgnoreCase("londyn")) {
            System.out.println("dobrze");
            counter += 1;
        } else if (rand1 == 43 && userText.equalsIgnoreCase("rzym")) {
            System.out.println("dobrze");
            counter += 1;
        } else {
            System.out.println("źle");
        }
    }

    void falseAnswer() {
        if (rand1 == 0 && !userText.equalsIgnoreCase("tirana")) {
            System.out.println("poprawna odpowiedź: Tirana ");


        } else if (rand1 == 1 && !userText.equalsIgnoreCase("andora")) {
            System.out.println("poprawna odpowiedź: Andora");


        } else if (rand1 == 2 && !userText.equalsIgnoreCase("wiedeń")) {
            System.out.println("poprawna odpowiedź: Wiedeń");


        } else if (rand1 == 3 && !userText.equalsIgnoreCase("bruksela")) {
            System.out.println("poprawna odpowiedź: Bruksela");


        } else if (rand1 == 4 && !userText.equalsIgnoreCase("mińsk")) {
            System.out.println("poprawna odpowiedź: Mińsk");


        } else if (rand1 == 5 && !userText.equalsIgnoreCase("sarajewo")) {
            System.out.println("poprawna odpowiedź: Sarajewo");

        } else if (rand1 == 6 && !userText.equalsIgnoreCase("sofia")) {
            System.out.println("poprawna odpowiedź: Sofia");

        } else if (rand1 == 7 && !userText.equalsIgnoreCase("zagrzeb")) {
            System.out.println("poprawna odpowiedź: Zagrzeb");

        } else if (rand1 == 8 && !userText.equalsIgnoreCase("podgorica")) {
            System.out.println("poprawna odpowiedź: Podgorica");

        } else if (rand1 == 9 && !userText.equalsIgnoreCase("praga")) {
            System.out.println("poprawna odpowiedź: Praga");

        } else if (rand1 == 10 && !userText.equalsIgnoreCase("kopenhaga")) {
            System.out.println("poprawna odpowiedź: Kopenhaga");

        } else if (rand1 == 11 && !userText.equalsIgnoreCase("talinn") || userText.equalsIgnoreCase("talin")) {
            System.out.println("poprawna odpowiedź: Talinn");

        } else if (rand1 == 12 && !userText.equalsIgnoreCase("helsinki")) {
            System.out.println("poprawna odpowiedź: Helsinki");

        } else if (rand1 == 13 && !userText.equalsIgnoreCase("paryż")) {
            System.out.println("poprawna odpowiedź: Paryż");

        } else if (rand1 == 14 && !userText.equalsIgnoreCase("ateny")) {
            System.out.println("poprawna odpowiedź: Ateny");

        } else if (rand1 == 15 && !userText.equalsIgnoreCase("madryt")) {
            System.out.println("poprawna odpowiedź: Madryt");

        } else if (rand1 == 16 && !userText.equalsIgnoreCase("amsterdam")) {
            System.out.println("poprawna odpowiedź: Amsterdam");

        } else if (rand1 == 17 && !userText.equalsIgnoreCase("dublin")) {
            System.out.println("poprawna odpowiedź: Dublin");

        } else if (rand1 == 18 && !userText.equalsIgnoreCase("rejkjavik") || userText.equalsIgnoreCase("reykjavik")) {
            System.out.println("poprawna odpowiedź: Reykjavik");

        } else if (rand1 == 19 && !userText.equalsIgnoreCase("vaduz")) {
            System.out.println("poprawna odpowiedź: Vaduz");

        } else if (rand1 == 20 && !userText.equalsIgnoreCase("wilno")) {
            System.out.println("poprawna odpowiedź: Wilno");

        } else if (rand1 == 21 && !userText.equalsIgnoreCase("luksemburg")) {
            System.out.println("poprawna odpowiedź: Luksemburg");

        } else if (rand1 == 22 && !userText.equalsIgnoreCase("ryga")) {
            System.out.println("poprawna odpowiedź: Ryga");

        } else if (rand1 == 23 && !userText.equalsIgnoreCase("skopje")) {
            System.out.println("poprawna odpowiedź: Skopje");

        } else if (rand1 == 24 && !userText.equalsIgnoreCase("valetta")) {
            System.out.println("poprawna odpowiedź: Valletta");

        } else if (rand1 == 25 && !userText.equalsIgnoreCase("kiszyniów")) {
            System.out.println("poprawna odpowiedź: Kiszyniów");

        } else if (rand1 == 26 && !userText.equalsIgnoreCase("monako")) {
            System.out.println("poprawna odpowiedź: Monako");

        } else if (rand1 == 27 && !userText.equalsIgnoreCase("berlin")) {
            System.out.println("poprawna odpowiedź: Berlin");

        } else if (rand1 == 28 && !userText.equalsIgnoreCase("oslo")) {
            System.out.println("poprawna odpowiedź: Oslo");

        } else if (rand1 == 29 && !userText.equalsIgnoreCase("warszawa")) {
            System.out.println("poprawna odpowiedź: Warszawa");

        } else if (rand1 == 30 && !userText.equalsIgnoreCase("lizbona")) {
            System.out.println("poprawna odpowiedź: Lizbona");

        } else if (rand1 == 31 && !userText.equalsIgnoreCase("moskwa")) {
            System.out.println("poprawna odpowiedź: Moskwa");

        } else if (rand1 == 32 && !userText.equalsIgnoreCase("bukareszt")) {
            System.out.println("poprawna odpowiedź: Bukareszt");

        } else if (rand1 == 33 && !userText.equalsIgnoreCase("san marino")) {
            System.out.println("poprawna odpowiedź: San Marino");

        } else if (rand1 == 34 && !userText.equalsIgnoreCase("belgrad")) {
            System.out.println("poprawna odpowiedź: Belgrad");

        } else if (rand1 == 35 && !userText.equalsIgnoreCase("bratysława")) {
            System.out.println("poprawna odpowiedź: Bratysława");

        } else if (rand1 == 36 && !userText.equalsIgnoreCase("lublana")) {
            System.out.println("poprawna odpowiedź: Lublana");

        } else if (rand1 == 37 && !userText.equalsIgnoreCase("berno")) {
            System.out.println("poprawna odpowiedź:");

        } else if (rand1 == 38 && !userText.equalsIgnoreCase("sztokholm")) {
            System.out.println("poprawna odpowiedź: Sztokholm");

        } else if (rand1 == 39 && !userText.equalsIgnoreCase("ankara")) {
            System.out.println("poprawna odpowiedź: Ankara");

        } else if (rand1 == 40 && !userText.equalsIgnoreCase("kijów")) {
            System.out.println("poprawna odpowiedź: Kijów");

        } else if (rand1 == 41 && !userText.equalsIgnoreCase("budapeszt")) {
            System.out.println("poprawna odpowiedź: Budapeszt");

        } else if (rand1 == 42 && !userText.equalsIgnoreCase("londyn")) {
            System.out.println("poprawna odpowiedź: Londyn");

        } else if (rand1 == 43 && !userText.equalsIgnoreCase("rzym")) {
            System.out.println("poprawna odpowiedź: Rzym");


        }

    }
}

