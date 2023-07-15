import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class BookWithExternalizable implements Externalizable {

    private String author;

    private String title;

    private int numberOfPages;

    public BookWithExternalizable() {
    }

    public BookWithExternalizable(String author, String title, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(author);
        out.writeObject(title);
        out.writeInt(numberOfPages);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.author = (String) in.readObject();
        this.title = (String) in.readObject();
        this.numberOfPages = in.readInt();
    }

    /*
    In the above example, our Book implement Externalizable
    interface which is a sub-interface of Serializable, and it provides more
    fine-grained control of how your object is serialized or converted into byte stream.
     */

    /*
    It's also worth noting that by implementing Serializable and Externalizable interface your
    Class become stateful, and it may not be suitable in a Microservice architecture
    where stateless object are preferred as stateful object can cause problems in caching,
    replication, and scaling.
     */
}
