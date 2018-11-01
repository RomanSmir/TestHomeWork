import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass {


@Before
    public  void startTest() {
        System.out.println("Start test");

    }

    @Test
    public void testGetLocalNumber() {
        if (getLocalNumber() == 14) {
            System.out.println("True");
        } else {
            System.out.println("False !==14");
        }
    }
@After
    public void stoptest()
    {
        System.out.println("Stop test");
    }

@Test
    public void testGetClasslNumber() {
        if (getClassNumber() > 45) {
            System.out.println("True");
        } else {
            System.out.println("False !>45");
        }
    }

@Test
    public void testGetClassString()
    {
        String word = getClassString();
        String Word = word.toLowerCase();

        {
            Assert.assertEquals( "!Hello or hello",Word,"hello, world");
        }
    }


}
