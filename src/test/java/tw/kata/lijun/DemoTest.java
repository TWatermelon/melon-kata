package tw.kata.lijun;

import org.junit.Assert;
import org.junit.Test;
public class DemoTest {
    @Test
    public void testSayHelloWorld() {
        Demo demo = new Demo();
        Assert.assertEquals("sayHelloWorld should return 'Hello world'", "Hello world", demo.sayHelloWorld());
    }
}
