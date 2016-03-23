import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by harshild on 3/23/2016.
 */
public class SumTest {

    @Test
    public void testAdd() throws Exception {
        int result = new Sum().add(10,10);
        Assert.assertEquals(result,20);
    }
}