package ComcastChallange;

import ComcastChallange.Comcast;

public class TestComcast
  {
  Comcast comcast;


  @BeforeMethod()
  public void testSetup() throws Exception
  {
    comcast = new Comcast();
  }


  //This will read data from ComcastChallange.ComcastDataProvider class and go through each testData
    @Test(dataProviderClass = ComcastDataProvider.class, dataProvider="data-provider-testTaxCalculation")
  public void testIllegalStringsFirstNameOnJoinPage(String testName, long itemCost, char itemType) throws Exception
  {
    System.out.println("-----" + testName + "-----");
      System.out.println(comcast.calculateTotalCostWithTax(itemCost, itemType));
  }

  }
