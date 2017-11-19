package Base;

import de.redsix.pdfcompare.PdfComparator;
import org.testng.Assert;

public class Base {

    public static void Compare(String expected, String actual, String diff) throws Exception {

        expected = System.getProperty("user.dir") + "/src/main/resources/" + expected;
        actual = System.getProperty("user.dir") + "/src/main/resources/" + actual;
        diff = System.getProperty("user.dir") + "/src/main/resources/Results/" + diff;

        String ignore = System.getProperty("user.dir") + "/src/main/resources/ignore.conf";


        boolean isEquals = new PdfComparator(expected, actual).withIgnore(ignore).compare().writeTo(diff);
        if (!isEquals) {
            System.out.println("Differences found!");
            Assert.fail("Differences found!");
        }

    }

}
