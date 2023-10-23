import java.io.*;

public class FileHandler {
    private String path;
    private boolean end;

    //private int countMark;
    private BufferedReader bufferedReader;
    public FileHandler(String path) throws FileNotFoundException {
        this.path = path;
        end = false;
        this.bufferedReader = new BufferedReader(new FileReader(path));
        //this.countMark = 0;
    }

    public boolean isEnd(){
        return end;
    }

    public String getText() throws IOException {
        StringBuilder  stringBuilder = new StringBuilder();
        //bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        int countMark=0;
        while ((line = bufferedReader.readLine()) != null && countMark++<6){
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        if(line == null){
            end = true;
            bufferedReader.close();
        }
        return stringBuilder.toString();
    }

    public void close() throws IOException {
        bufferedReader.close();
    }
    public static String getText(String path) throws IOException {
        StringBuilder  stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }
}
