package Lab.Factory;

import Lab.Elements.Directory;

/**
 * Created by User on 09.05.2018.
 */
public class DirectoryCreator {
    public static Directory Create(String path) {
        return new Directory(path);
    }
}
