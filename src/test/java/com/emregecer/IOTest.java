package com.emregecer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IOTest {

    private final PrintStream standardOut = System.out;

    protected final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    protected String prepareOutputLines(String... lines) {
        return String.join(System.getProperty("line.separator"), lines);
    }
}
