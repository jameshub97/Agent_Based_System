import javax.xml.namespace.QName;
import java.util.*;

public class Data {
    private String name;
    private int value;
    private int id;

    public Data(int id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public int getID() {
        return this.id;
    }


    @Override
    public String toString() {
        return this.id + this.name + this.value;
    }




        };







