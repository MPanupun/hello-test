import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {
    @Test
    @DisplayName("ข้อมูล (11,5] ขึ้นต้นด้วย [ ผลที่ได้ False")
    public void startWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }
    @Test
    @DisplayName("ข้อมูล [11,5] ขึ้นต้นด้วย ( ผลที่ได้ True")
    public void startWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }
    @Test
    public void startNumberWithInclude () {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1,result);
    }
    @Test
    public void startNumberWithExclude () {
        MyRange myRange = new MyRange("(1,5]");
        int result = myRange.getStart();
        assertEquals(2,result);
    }
    @Test
    public void endNumberWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        int result = myRange.getEnd();
        assertEquals(4, result);
    }

    @Test
    public void endNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getEnd();
        assertEquals(5, result);
    }

    @Test
    public void endWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        boolean result = myRange.isEndWithExclude();
        assertFalse(result);
    }

    @Test
    public void endWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithExclude();
        assertTrue(result);
    }
    @Test
    @DisplayName("ผลลัพธืสุดท้าย")
    public void getResult() {
        MyRange myRange = new MyRange("[1,5)");
        int[] result = myRange.getResult();
        assertArrayEquals(new int[] {1,2,3,4}, result);
    }
}
