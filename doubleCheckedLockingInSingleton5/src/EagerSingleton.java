//Another safe way to create thread-safe Singleton is using eager
// initialization which initializes Singleton instance at the time Singleton class
// is loaded into memory as opposed to when client class the getInstance() method.

public class EagerSingleton {

    public static EagerSingleton singleton = new EagerSingleton();
}
