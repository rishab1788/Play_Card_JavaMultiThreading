import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

    final String fileName = "GameOfCards";
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

    FileOperation() throws IOException {
    }

    public void usingBufferedWritter(Players p) throws IOException {
        writer.append(p.toString());
        //  Runtime.getRuntime().exec("notepad GameOfCards");
    }

    public void closeFileConnection() throws IOException {
        writer.close();
    }

}