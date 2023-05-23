import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void Firsttest(){
        AddClass addClass=new AddClass();

                int res = addClass.getsum(2,3);
        Assert.assertEquals(5,res);
    }
}
