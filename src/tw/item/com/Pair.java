package tw.item.com;

/**
 * Created by 欣 on 2014/12/2.
 */
public class Pair {
    private String name;
    private Integer value;

    public Pair(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public Pair(String name, String value) {
        this.name = name;
        this.value = Integer.valueOf(value);
    }

    public String GetName() {
        return name;
    }

    public Integer GetValue() {
        return value;
    }
}
