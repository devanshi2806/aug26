/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.itexps.shoppingcart.mygrade.Grade;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author vartr
 */
public class GradeTest {

    Grade grade;

    public GradeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        grade = new Grade("tom", 100, 60, 40);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testGrade() {
        assertEquals(grade.getGrade(), "pass");
    }

    @Test
    public void testGradeFail() {
        grade = new Grade("kevin", 20, 10, 30);
        assertEquals(grade.getGrade(), "fail");
    }
}
