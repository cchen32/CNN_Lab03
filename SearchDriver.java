public class SearchDriver{
  public static void main(String[] args){


    // Testing 10,000
    Comparable[] testher = new Integer[10000];
    for( int i = 0; i < testher.length; i++ ) {
      testher[i] = i * 2;
    }

    long a = System.currentTimeMillis();
    BinSearch.binSearch(testher, 4);
    long b = System.currentTimeMillis();
    System.out.println("bin search time: " + (b - a));

    long x = System.currentTimeMillis();
    LinSearch.linSearch(testher, 4);
    long y = System.currentTimeMillis();
    System.out.println("lin search time: " + (b - a));
    // Ran test 4 times, and results alternate between '0' and '1';
  }

}
