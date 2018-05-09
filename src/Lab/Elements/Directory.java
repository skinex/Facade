package Lab.Elements;

/**
 * Created by User on 09.05.2018.
 */
public class Directory {
    private String path;

    public Directory(String path) {
        System.out.println("Directory created");
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
