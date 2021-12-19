public class SearchDriver{

  //method to determine the avg time for binary search
  public static long binAv(Comparable[] arr){

  }

  //method for avg time for linear search
  public static long linAv(Comparable[] arr){

  }

  public static void main(String[] args){


    // Testing 100,000,000
    Comparable[] testher = new Integer[100000000];
    for( int i = 0; i < testher.length; i++ ) {
      testher[i] = (int)(Math.random()*100);
    }

    //can replace this after writing binAv and linAv methods
    long a = System.currentTimeMillis();
    BinSearch.binSearch(testher, 7);
    long b = System.currentTimeMillis();
    System.out.println("bin search time: " + (b - a));

    long x = System.currentTimeMillis();
    LinSearch.linSearch(testher, 7);
    long y = System.currentTimeMillis();
    System.out.println("lin search time: " + (y - x));
    // Ran test 4 times, and results alternate between '0' and '1';

    //prints times
    System.out.println("start bin: " + a);
    System.out.println("end bin: " + b);
    System.out.println("start lin: " + x);
    System.out.println("end lin: " + y);

  }

}
