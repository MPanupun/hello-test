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
}
