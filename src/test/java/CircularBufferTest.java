import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty(){
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer is Not Busy", result);
    }

    @Test
    public void create_new_buffer_default_size_should_be_10(){
        CircularBuffer cb = new CircularBuffer();
        for(int i = 0;i < 10;i++){
            cb.writeData("A" + 1);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is Full", result);
    }

    @Test
    public void write_A_to_buffer_should_read_A(){
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
    }

}