package com.iteso.nintendo;
        import org.junit.Before;
        import org.junit.Test;
        import static org.junit.Assert.*;

        import com.iteso.behaviors.implementations.Shell;

public class ShellTest {
    Shell shell;

    @Before
    public void setUp(){
        shell = new Shell();
    }

    @Test
    public void testPower(){
        assertEquals("Shell", shell.catchPower());
    }

    @Test
    public void testPreparation(){
        assertEquals("Shell power!", shell.retainPower());
    }

    @Test
    public void testUse(){
        assertEquals("I will hit you!", shell.throwForward());
    }

    @Test
    public void testCatch(){
        assertEquals("I have a shell!!!", shell.catchPower());
    }
}