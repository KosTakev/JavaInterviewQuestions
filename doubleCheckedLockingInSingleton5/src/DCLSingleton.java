public class DCLSingleton {

    private static volatile DCLSingleton _instance = null;

    private DCLSingleton() {
    }

    public static DCLSingleton instance() {
        if (_instance == null) { //first check
            synchronized (DCLSingleton.class) {
                if (_instance == null) { //second check
                    _instance = new DCLSingleton();
                }
            }
        }
        return _instance;
    }
}
