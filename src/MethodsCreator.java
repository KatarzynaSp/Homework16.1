import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MethodsCreator {
    static Scanner scanner = new Scanner(System.in);

    static void playerListCreator() throws IOException {
        List<Player> playerList = new ArrayList<>();
        String data;
        do {
            System.out.println("Podaj imię i nazwisko oraz wynik kolejnego gracza (lub stop):");
            data = scanner.nextLine();
            if ((data.toUpperCase()).equals("STOP")) {
                sort(playerList);
                write(playerList);
            } else {
                playerList.add(new Player(data, scanner.nextInt()));
                scanner.nextLine();
            }
        } while (!(data.toUpperCase()).equals("STOP"));
    }

    private static void sort(List<Player> playerList) {
        System.out.println("Dane posortowano i zapisano do pliku stats.csv.");
        ResultComparator resultComparator = new ResultComparator();
        playerList.sort(resultComparator);
    }

    private static void write(List<Player> playerList) throws IOException {
        BufferedWriter bfW = new BufferedWriter(new FileWriter(new File("stats.csv")));
        for (Player osoba : playerList) {
            bfW.write(osoba.toCsv());
        }
        bfW.close();
    }
}