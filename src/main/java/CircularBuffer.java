public class CircularBuffer {

    private int bufferSize = 10;
    private String[] buffer ;
    private int readPointer;
    private int writePointer;

    //default constructor
    public CircularBuffer() {
        this.buffer = new String[10];
    }

    public boolean isEmpty() {

        return bufferSize == 10;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return bufferSize == 0;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }

    public boolean isBufferHaveSpace() {
        return bufferSize > 0;
    }

    public void setSize(int size) {
        this.buffer = new String[size];
    }

    public boolean isReSize() {
        return this.buffer.length != 10;
    }

}
