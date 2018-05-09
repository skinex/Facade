package Lab.Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 09.05.2018.
 */
public class Facade {
    private SubSystem subSystem;

    public List<Integer> Create() {
        subSystem = new SubSystem();
        ArrayList<Integer> results = new ArrayList<>();

        System.out.println(subSystem.GetCountDirectiories());
        results.add(subSystem.GetCountDirectiories());

        System.out.println(subSystem.GetCountFiles());
        results.add(subSystem.GetCountFiles());

        return results;
    }

    public List<Integer> Destroy() {
        subSystem.DropSystem();

        ArrayList<Integer> results = new ArrayList<>();

        System.out.println(subSystem.GetCountDirectiories());
        results.add(subSystem.GetCountDirectiories());

        System.out.println(subSystem.GetCountFiles());
        results.add(subSystem.GetCountFiles());

        return results;
    }

    public boolean AddFile(String path) {
        boolean isCreated = subSystem.CreateFile(path);

        System.out.println(isCreated);
        System.out.println(subSystem.GetCountFiles());

        return isCreated;
    }

    public boolean AddDirectory(String path) {
        boolean isCreated = subSystem.CreateDirectory(path);

        System.out.println(isCreated);
        System.out.println(subSystem.GetCountDirectiories());

        return isCreated;
    }

    public boolean DeleteFile(String path) {
        boolean isDeleted = subSystem.RemoveFile(path);

        System.out.println(isDeleted);
        System.out.println(subSystem.GetCountFiles());

        return isDeleted;
    }

    public boolean DeleteDirectory(String path) {
        boolean isDeleted = subSystem.RmDir(path);

        System.out.println(isDeleted);
        System.out.println(subSystem.GetCountDirectiories());

        return isDeleted;
    }
}
