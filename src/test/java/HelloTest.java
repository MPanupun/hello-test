public class HelloTest {
    // name = "Hello Panupun"
    @Test
    public  void case01() {
        Hello hello =  new Hello();
        String name = "panupun";
        String result = hello.sawadee(name);
        assertEquals("Hello panupun",result);
    }

}
