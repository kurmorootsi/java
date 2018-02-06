import exceptions.StackEmptyException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Kurmo on 12.10.2016.
 */
public class StackTest {

     private static Stack Solid;

     @Before
     public void test() {
          Solid = new Stack();
     }
    @Test
    public void testIfPushWorks() {
        Solid.push(3);
        Assert.assertEquals(3, Solid.peek());
    }
    @Test
     public void testEmptyStack() {
          Assert.assertTrue(Solid.empty());
     }
    @Test
    public void testPeekReturnsCorrectObject() {
        Solid.push(3);
        Solid.push(6);
        Solid.push(1);
        Assert.assertEquals(1, Solid.peek());
    }
    @Test
    public void testPeekDoesntRemoveObject() {
        Solid.push(3);
        Solid.push(6);
        Solid.push(1);
        Solid.peek();
        Assert.assertEquals(1, Solid.peek());
    }
    @Test
    public void TestNotEmptyStack() {
        Solid.push(2);
        Assert.assertFalse(Solid.empty());
    }
    @Test
    public void testIfPopRemovesObject() {
        Solid.push(2);
        Solid.pop();
        Assert.assertTrue(Solid.empty());
    }
    @Test
    public void testIfPopReturnsCorrectObject() {
        Solid.push(3);
        Solid.push(4);
        Assert.assertEquals(4, Solid.pop());
    }

    @Test(expected = StackEmptyException.class)
    public void testPopEmptyStackException() {
        Solid.pop();
    }
    @Test(expected = StackEmptyException.class)
    public void testPeekEmptyStackException() {
        Solid.peek();
    }


}
