import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;

// sample01Test.java

public class sample01Test {
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
        sample01.main(new String[0]);
        return outContent.toString();
    }

    @Test
    public void testPrimeNumber() throws Exception {
        String output = runMainWithInput("7\n");
        assertTrue(output.contains("素数です"));
    }

    @Test
    public void testNonPrimeNumber() throws Exception {
        String output = runMainWithInput("8\n");
        assertTrue(output.contains("素数でない"));
    }

    //1は素数じゃない
    @Test
    public void testInputOne() throws Exception {
        String output = runMainWithInput("1\n");
        assertTrue(output.contains("素数です"));
    }

    @Test
    public void testInputTwo() throws Exception {
        String output = runMainWithInput("2\n");
        assertTrue(output.contains("素数です"));
    }
}