package Lab.Factory;

import Lab.Elements.File;

/**
 * Created by User on 09.05.2018.
 */
public class FileCreator {
    public static File Create(String path) {
        return new File(path);
    }
}
