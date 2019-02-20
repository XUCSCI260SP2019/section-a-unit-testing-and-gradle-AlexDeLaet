package edu.xavier.csci;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalTest {

        @Test public void testAddCanDoTheAddition() {
            Calculator classUnderTest = new Calculator();
            assertEquals(3,classUnderTest.add(1,2));
            assertEquals(4,classUnderTest.add(1,1,1,1));
            assertEquals(0,classUnderTest.add());
            assertEquals(1,classUnderTest.add(1));
        }
    }
