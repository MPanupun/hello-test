import java.util.List;

public class MyRange {
    public static final int ASCII_VALUE_OF_1 = 48;
    public final String input;

    public  MyRange(String input) {
        this.input = input;
    }

    public  boolean isStartWithInclude() {
        return  this.input.startsWith("[");
    }
    public int getStart() {
        int StartNumber = Integer.parseInt(String.valueOf(this.input.charAt(1)));
        if (isStartWithInclude())
            return StartNumber;
        return totalStartNumber(StartNumber ,+ 1);
    }
    public boolean isEndWithExclude() {
        return  this.input.endsWith("]");
    }

    public int getEnd() {
        int StartNumber = Integer.parseInt(String.valueOf(this.input.charAt(3)));
        if (isEndWithExclude())
            return StartNumber;
        return totalStartNumber(StartNumber ,- 1);
    }
    public int totalStartNumber(int StartNumber,int num)
    {
        return  StartNumber + num;
    }
}
