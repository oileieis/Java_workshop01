import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void sayhi_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello world", result);
    }

    @Test
    public void sayhi_with_thitipon_should_return_Hello_Thitipon(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("Thitipon");
        assertEquals("Hello Thitipon", result);
    }

    @Test
    public void sayhi_with_oil_should_return_Hello_oil(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("oil");
        assertEquals("Hello Oil", result);
    }


}