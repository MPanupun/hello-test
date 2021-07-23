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
        if(isStartWithInclude()) {
            return this.input.charAt(1) - ASCII_VALUE_OF_1;
        }
        return  -1;
    }
}
