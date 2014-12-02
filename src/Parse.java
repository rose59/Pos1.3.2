import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 欣 on 2014/12/2.
 */
public abstract class Parse<T> {
    public List<T> Parse(String path) throws IOException {
        BufferedReader bufferedReader = getBufferedReader(path);
        List<T> valueList = new ArrayList<T>();
        int i = 0;

        while (bufferedReader.read() != -1)
        {
            String s = bufferedReader.readLine();
            valueList.add(convert(s));
        }
        return valueList;
    }
    private BufferedReader getBufferedReader(String path) throws FileNotFoundException {
        File file = new File(path);
        InputStreamReader reader = new InputStreamReader(new FileInputStream((file)));
        return new BufferedReader((reader));
    };
    public  abstract T convert (String line);
}
