//Other alternative includes using Enum as Singleton in Java.
// Enum guarantees a lot of features required by Singleton pattern out-of-the-box like initialization
// to Enum constants are thread-safe, Enum also provides Serialization guarantee that
// only one instance of Singleton will exit and it's very easy to code as seen below:


public enum ThreadSafeSingleton {
    INSTANCE;
}
