import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Arrays;

public class BuffersExamples {


    /**
     * From https://www.geeksforgeeks.org/buffer-duplicate-method-in-java-with-examples/
     * @param bb1
     * @return
     */
    public static Buffer duplicate(ByteBuffer bb1) {
        // Creating the ByteBuffer
        try {
            // putting the int to byte typecast
            // value in ByteBuffer
            bb1.put((byte)20);
            bb1.put((byte)30);
            bb1.put((byte)40);
            bb1.put((byte)50);
            bb1.rewind();

            // print the Original ByteBuffer
            System.out.println("Original ByteBuffer:  " + Arrays.toString(bb1.array()));

            // Creating a duplicate copy of ByteBuffer
            // using duplicate() method
            ByteBuffer bb2 = bb1.duplicate();

            // Return the duplicate
            return bb2;
        }
        catch (IllegalArgumentException | ReadOnlyBufferException e) {
            System.out.println("Exception thrown : " + e);
        }
        finally {
            return null;
        }
    }


    /**
     * From https://www.geeksforgeeks.org/buffer-rewind-methods-in-java-with-examples/
     * @param byteBuffer
     * @return
     */
    public static Buffer rewind(ByteBuffer byteBuffer) {
        // put byte value in byteBuffer
        // using put() method
        byteBuffer.put((byte)20);
        byteBuffer.put((byte)'a');

        // Typecast Bytebuffer to buffer
        Buffer buffer = (Buffer)byteBuffer;

        // print the byte buffer
        System.out.println("Buffer before operation: " + Arrays.toString( (byte[])buffer.array())
                + "\nPosition: " + buffer.position()
                + "\nLimit: " + buffer.limit());

        // rewind the Buffer
        // using rewind() method
        buffer.rewind();

        // print the bytebuffer
        System.out.println("\nBuffer after operation: " + Arrays.toString((byte[])buffer.array())
                + "\nPosition: " + buffer.position()
                + "\nLimit: " + buffer.limit());

        return buffer;
    }


}
