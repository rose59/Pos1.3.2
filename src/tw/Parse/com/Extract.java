package tw.Parse.com;

import tw.item.com.Pair;

/**
 * Created by 欣 on 2014/12/2.
 */
public class Extract extends Parse<Pair> {
    private static final String MARK_DISCOUNT = ":";
    private static final String MARK_AMOUNT = "-";
    @Override
    public Pair convert(String line) {
        if (line.contains(MARK_DISCOUNT)) {
            String[] pair = line.split(MARK_DISCOUNT);
            return new Pair(pair[0], Integer.valueOf(pair[1]));
        } else if(line.contains(MARK_AMOUNT)) {
            String[] pair = line.split(MARK_AMOUNT);
            return new Pair(pair[0],Integer.valueOf(pair[1]));
        } else {
            return new Pair(line,1);
        }
    }
}
