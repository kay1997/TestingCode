package za.ac.cput;

import org.junit.*;

import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.*;

/**
 * Kaylen Abrahams
 * Student Number: 216054664
 * Group: 3G
 */

public class StudentTest {

    private Student stud1, stud2, stud3;


    @Before
    public void setUp() throws Exception {
        stud1 = new Student("Kaylen Abrahams", 216054664);
        stud2 = stud1;
        stud3 = new Student("Kaylen Abrahams", 216054664);
    }

    private void assertEquals(boolean equals) {
    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestObjectEquality() throws Exception {

      assertEquals(stud1.equals(stud3));
    }

    @Test
    public void TestObjectIdentity() throws Exception
    {
        assertEquals(stud1 == stud2);
    }

    @Test (timeout = 300)
    public void yearsOfStudy() throws InterruptedException {
        while (true)
        {
            Thread.currentThread().sleep(1000);
            int numberOfYearsStudying =  new Student().yearsOfStudy(2019, 2016);
            Assert.assertEquals(3, numberOfYearsStudying);
        }
    }

    @Test
    public void TestFail()
    {
        Assert.fail("Test should be ignored");
    }

    @Ignore
    @Test
    public void DisablingTest() {
        assertThat(stud1.toString(), isA(String.class));
    }

}