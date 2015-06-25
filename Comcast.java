package ComcastChallange;

public class Comcast
  {
    public static long calculateTotalCostWithTax(long itemCost, char itemType)
  {
    long total=0;
    if(itemType == 'N')
    {
      total = itemCost + (itemCost * 1 / 100);
    }
    else if (itemType == 'L')
    {
      total = itemCost + (itemCost * 9 / 100);
    }
    else
    {
      System.out.println("Invalid type...");
      return 0L;
    }
    return   total;
  }
  }
