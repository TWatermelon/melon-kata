package tw.kata.jason;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DemoTest {
    @Test
    public void testFunc() {
        Demo demo = new Demo();
        assertEquals("Hello World!", demo.func());
    }

    @Test
    public void testMain() {
        Demo.main(null);
    }
}

