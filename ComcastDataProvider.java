package ComcastChallange;

import java.util.ArrayList;
import java.util.Iterator;
import org.testng.annotations.DataProvider;
//All different data set are provided through this class, this data will be used in ComcastChallange.TestComcast.java
public class ComcastDataProvider
  {
  @DataProvider(name = "data-provider-testTaxCalculation")
  public static Iterator<Object[]> testTaxCalculation() throws Exception {


    ArrayList<Object[]> testdata = new ArrayList<Object[]>();

    testdata.add(new Object[]{
      "validData1LN",
      1L,
      "N"
    });

    testdata.add(new Object[]{
      "validData1000LL",
      1000L,
      "L"
    });

    testdata.add(new Object[]{
      "validDataLongNumber",
      3943202423956042359L,
      "L"
    });

    testdata.add(new Object[]{
      "invalidItemType",
      10000L,
      'D'
    });

    testdata.add(new Object[]{
      "itemCost0ValidItemType",
     0L,
     'N'
    });

    testdata.add(new Object[]{
      "itemCost0LInvalidItemType",
      0L,
      'K'
    });

    testdata.add(new Object[]{
      "itemCost0InvalidItemType",
      0,
      'K'
    });

    return testdata.iterator();
  }


  }
