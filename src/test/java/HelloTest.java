import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    // name = "Hello panupun"
    @Test
    @DisplayName("ทำการทดสอบ .....")
    public void case01() {
        // Arrange
        Hello hello = new Hello();
        String name = "panupun";
        // Act
        String actualResult = hello.sawadee(name);
        // Assert
        assertEquals("Hello panupun", actualResult);
    }

}
