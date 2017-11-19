package Test;

import Base.Base;
import org.testng.annotations.Test;

public class HasDifference extends Base {

    @Test
    public static void HasDifference() throws Exception {
        Compare("expected.pdf", "actual.pdf", "difference");
    }
}
