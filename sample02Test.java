import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;

// sample02Test.java

public class sample02Test {
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private String runMainWithInput(String input) throws Exception {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        sample02.main(new String[0]);
        return outContent.toString();
    }

    @Test
    public void testPrimeNumber() throws Exception {
        String output = runMainWithInput("13\n");
        assertTrue(output.contains("素数です"));
    }

    @Test
    public void testNonPrimeNumber() throws Exception {
        String output = runMainWithInput("15\n");
        assertTrue(output.contains("素数でない"));
    }

    @Test
    public void testInputOne() throws Exception {
        String output = runMainWithInput("1\n");
        assertTrue(output.contains("素数でない"));
    }

    @Test
    public void testInputTwo() throws Exception {
        String output = runMainWithInput("2\n");
        assertTrue(output.contains("素数です"));
    }

    @Test
    public void testInputZero() throws Exception {
        String output = runMainWithInput("0\n");
        assertTrue(output.contains("素数でない"));
    }

    @Test
    public void testNegativeNumber() throws Exception {
        String output = runMainWithInput("-5\n");
        assertTrue(output.contains("素数でない"));
    }

    @Test
    public void testLargePrime() throws Exception {
        String output = runMainWithInput("97\n");
        assertTrue(output.contains("素数です"));
    }
}