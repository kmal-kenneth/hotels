package data;

public class GlobalData {
    private static GlobalData ourInstance = new GlobalData();

    public static GlobalData getInstance() {
        return ourInstance;
    }

    private GlobalData() {
    }
}
