package Lab.Pattern;

import Lab.Elements.Directory;
import Lab.Elements.File;
import Lab.Factory.DirectoryCreator;
import Lab.Factory.FileCreator;

import java.util.ArrayList;

/**
 * Created by User on 09.05.2018.
 */
public class SubSystem {
    private ArrayList<File> files = new ArrayList<>();
    private ArrayList<Directory> directories = new ArrayList<>();

    public SubSystem() {
        //Initialize directory
        directories.add(DirectoryCreator.Create("C:/Windows"));
        directories.add(DirectoryCreator.Create("root/home"));
        //Initialize Files
        files.add(FileCreator.Create(directories.get(0).getPath()+"first.txt"));
        files.add(FileCreator.Create(directories.get(1).getPath()+"start.sh"));
        files.add(FileCreator.Create(directories.get(1).getPath()+"my.bat"));
    }

    public void DropSystem() {
        files.clear();
        directories.clear();
    }

    public boolean CreateDirectory(String path) {
        for (Directory directory : directories) {
            if (directory.getPath().equals(path)) {
                return false;
            }
        }
        return directories.add(DirectoryCreator.Create(path));
    }

    public boolean CreateFile(String path) {
        for (File file : files) {
            if (file.getPath().equals(path)){
                System.out.println("File already exist");
                return false;
            }
        }
        return files.add(FileCreator.Create(path));
    }

    public int GetCountDirectiories() {
        return directories.size();
    }

    public int GetCountFiles() {
        return files.size();
    }

    public boolean RmDir(String path) {
        for (Directory directory : directories) {
            if (directory.getPath().equals(path)) {
                directories.remove(directory);
                return true;
            }
        }
        return false;
    }

    public boolean RemoveFile(String path) {
        for (File file : files) {
            if (file.getPath().equals(path)) {
                files.remove(file);
                return true;
            }
        }
        return false;
    }
}
