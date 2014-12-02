/**
 * Created by 欣 on 2014/12/2.
 */
public class Pair {
    private String name;
    private Integer value;
    Pair(String name, Integer value) {
        this.name = name;
        this.value = value;
    }
    public String GetName(){
        return name;
    }
    public Integer GetValue(){
        return value;
    }
}
