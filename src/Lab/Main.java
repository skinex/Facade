package Lab;

import Lab.Pattern.Facade;

/**
 * Created by User on 09.05.2018.
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.Create();
        facade.AddFile("D:/myfile.exe");
        facade.AddDirectory("C:/Home");
        facade.Destroy();
    }
}
