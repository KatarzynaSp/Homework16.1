import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        try {
            MethodsCreator.playerListCreator();
        } catch (IOException | InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}