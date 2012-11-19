/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.List;
import java.util.logging.Level;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author juancarlos
 */
public class AppTest {

    public AppTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class App.
     */
    @Test
    public void stringNull() throws Exception {
        assertEquals(App.add(""), 0);
    }

    /**
     * Prueba si el metodo sirve con un solo numero
     */
    @Test
    public void oneNumber() throws Exception {
        assertEquals(App.add("5"), 5);

    }

    /**
     * Prueba la suma de dos numeros separados por coma
     */
    @Test
    public void twoNumber() throws Exception {
        assertEquals(App.add("1,22"), 23);
    }

    /**
     * Prueba si retorna la suma de multiples numeros separados por coma
     */
    @Test
    public void manyNumber() throws Exception {
        assertEquals(App.add("1,8,12"), 21);
    }

    /**
     * Prueba si acepta nueva línea (\n) como un separador valido
     */
    @Test
    public void newLine() throws Exception {
        assertEquals(App.add("4\n2\n1\n5\n4"), 16);
    }

    /**
     * Prueba si el metodo acepta delimitadores personalizados
     */
    @Test
    public void charDelimit() throws Exception {
        assertEquals(App.add("//;\n4;5"), 9);
        assertEquals(App.add("//r\n4r5"), 9);
        assertEquals(App.add("//-\n4-5"), 9);
        assertEquals(App.add("//*\n4*5*3"), 12);
        assertEquals(App.add("//.\n4.5"), 9);
    }

}