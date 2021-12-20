public class SearchDriver{

  //method to determine the avg time for binary search of testing through several targets
  public static double binAv(Comparable[] arr){
    long start;
    long end;
    start = System.currentTimeMillis();
    for(int i = 0; i < 1000; i++){
      BinSearch.binSearch(arr, i);
    }
    end = System.currentTimeMillis();
    return (double)((end - start) / 100.0);
  }

  //method for avg time for linear search
  public static double linAv(Comparable[] arr){
    long start;
    long end;
    start = System.currentTimeMillis();
    for(int i = 0; i < 1000; i++){
      LinSearch.linSearch(arr, i);
    }
    end = System.currentTimeMillis();
    return (double)((end - start) / 100.0);
  }

  public static void main(String[] args){

    //Testing 50,000,000
    Comparable[] testher0 = new Integer[50_000_000];
    for( int i = 0; i < testher0.length; i++ ) {
      testher0[i] = (int)(Math.random()*1000);
    }
    System.out.println("size: " + testher0.length);
    System.out.println("binary search time: " + binAv(testher0));
    System.out.println("linear search time: " + linAv(testher0));

    // Testing 100,000,000
    Comparable[] testher = new Integer[100_000_000];
    for( int i = 0; i < testher.length; i++ ) {
      testher[i] = (int)(Math.random()*1000);
    }
    System.out.println("size: " + testher.length);
    System.out.println("binary search time: " + binAv(testher));
    System.out.println("linear search time: " + linAv(testher));

    // // Testing 500,000,000
    // Comparable[] testher1 = new Integer[300000000];
    // for( int i = 0; i < testher1.length; i++ ) {
    //   testher1[i] = (int)(Math.random()*1000);
    // }
    //
    // System.out.println("size: " + testher1.length);
    // System.out.println("binary search time: " + binAv(testher1));
    // System.out.println("linear search time: " + linAv(testher1));

    Comparable[] testher2 = new Integer[5_000_000];
    for(int i = 0; i < testher2.length; i++){
      testher2[i] = i;
    }

    System.out.println("size: " + testher2.length);
    System.out.println("binary search time: " + binAv(testher2));
    System.out.println("linear search time: " + linAv(testher2));
  }

}
