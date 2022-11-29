import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("03/11/2022 13:40");
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

