package Lab.Elements;

/**
 * Created by User on 09.05.2018.
 */
public class File{
    private String path;

    public File(String path) {
        this.path = path;
    }

    public void open() {
        System.out.println("TextFile opened on path"+path);
    }

    public void close() {
        System.out.println("TextFile closed");
    }

    public String getPath() {
        return path;
    }
}