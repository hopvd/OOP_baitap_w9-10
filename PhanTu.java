import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhanTu<T extends Comparable<T>> {
    private T own;

    public PhanTu(T own) {
        this.own = own;
    }

    public boolean isGreaterThan(T a) {
        return own.compareTo(a) > 0;
    }

    public T getValue() {
        return own;
    }

    public void setValue(T own) {
        this.own = own;
    }

    public static void main(String[] args) {
        List<Week10_Generic.PhanTu> pt = new ArrayList<>();
        try {
            File inputFile = new File(args[0]);
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                pt.add(new Week10_Generic.PhanTu(number));
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            File outputFile = new File(args[1]);
            FileWriter myWriter = new FileWriter(outputFile);
            for (int i = 0; i < pt.size(); i++) {
                myWriter.write(pt.get(i).getValue() + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}