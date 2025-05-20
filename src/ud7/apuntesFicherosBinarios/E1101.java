package ud7.apuntesFicherosBinarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class E1101 {

    static final int num = 10;
    static final int max = 5;
    static final String FILE_PATH = "src\\ud7\\apuntesFicherosBinarios\\e1101.bin";

    public static void main(String[] args) {
        saveIntsToBin();
        loadIntsFromBin();
    }

    private static void saveIntsToBin() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (int i = num; i < num+max; i++) {
                out.writeInt(i);
            } 
        }
        catch (IOException e) {
            System.out.println("Error de escritura E/S");
        }
    }

    private static void loadIntsFromBin() {
        ObjectInputStream in = new O
        throw new UnsupportedOperationException("Unimplemented method 'loadIntsFromBin'");
    }
}
