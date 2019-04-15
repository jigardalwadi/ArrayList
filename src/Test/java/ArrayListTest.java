package Test.java;
import main.java.ArrayList;
import org.junit.*;

public class ArrayListTest {

    @Test
    public void testAllListMethods() {
        ArrayList list = new ArrayList();

        //checking the default arrayList by using size
        Assert.assertTrue(list.size() == 0);


        //add + get
        for (int i = 0; i < 50; i++) {
            Assert.assertTrue(list.size() == i);
            list.add(i);
            Assert.assertTrue(list.size() == i + 1);
            Assert.assertEquals(i, list.get(i));
        }
        //remove + size
        for (int i = 0; i < 50; i++) {
            Assert.assertEquals(i, list.remove(0));
            Assert.assertEquals(50 - i - 1, list.size());
        }


    }

    @Test
    public void testRemoveIndexOutOfBound() {
        ArrayList list = new ArrayList();
        Assert.assertTrue(list.size() == 0);

        try {
            list.remove(0);
            Assert.fail("Should have failed");
        } catch (ArrayIndexOutOfBoundsException e) {
            Assert.assertEquals("Array index out of range: 0", e.getMessage());
        }
    }

    @Ignore
   // @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    //execute after class

    @Ignore
    @AfterClass
    public static void  afterClass() {
        System.out.println("in after class");
    }

    //execute before test

    @Ignore
    @Before
    public void before() {
        System.out.println("in before");
    }

    //execute after test

    @Ignore
    @After
    public void after() {
        System.out.println("in after");
    }

    //test case
    @Test
    @Ignore
    public void test() {
        System.out.println("in test");
    }

    //test case ignore and will not execute
    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }
}

