public class SearchDriver{

  //method to determine the avg time for binary search of testing through several targets
  public static double binAv(Comparable[] arr){
    long start;
    long end;
    long total = 0;
    for(int x = 0; x < 100; x++){
      start = System.currentTimeMillis();
      for(int i = 0; i < 100; i++){
        BinSearch.binSearch(arr, ((int)Math.random()*(arr.length)));
      }
      end = System.currentTimeMillis();
      total = total + (end - start);
    }
    return (double)(total / 100.0);
  }

  //method for avg time for linear search
  public static double linAv(Comparable[] arr){
    long start;
    long end;
    long total = 0;
    for(int x = 0; x < 100; x++){
      start = System.currentTimeMillis();
      for(int i = 0; i < 100; i++){
        LinSearch.linSearch(arr, ((int)Math.random()*(arr.length)));
      }
      end = System.currentTimeMillis();
      total = total + (end - start);
    }
    return (double)(total / 100.0);
  }

  public static void populate(Comparable[] arr){
    for(int i = 0; i < arr.length; i++){
      arr[i] = i;
    }
  }

  public static void main(String[] args){

    //testing 5 mil
    Comparable[] testher0 = new Integer[5_000_000];
    populate(testher0);

    System.out.println("size: " + testher0.length);
    System.out.println("binary search time: " + binAv(testher0));
    System.out.println("linear search time: " + linAv(testher0));



    //testing 50 mil
    Comparable[] testher2 = new Integer[50_000_000];
    populate(testher2);

    System.out.println("size: " + testher2.length);
    System.out.println("binary search time: " + binAv(testher2));
    System.out.println("linear search time: " + linAv(testher2));

    // // Testing 100 mil
    // Comparable[] testher3 = new Integer[100_000_000];
    // populate(testher3);
    //
    // System.out.println("size: " + testher3.length);
    // System.out.println("binary search time: " + binAv(testher3));
    // System.out.println("linear search time: " + linAv(testher3));


    //testing 10 mil
    Comparable[] testher1 = new Integer[10_000_000];
    populate(testher1);

    System.out.println("size: " + testher1.length);
    System.out.println("binary search time: " + binAv(testher1));
    System.out.println("linear search time: " + linAv(testher1));



    // // Testing 100,000,000 again - currently too big for java's heap space
    // Comparable[] testher2 = new Integer[100_000_000];
    // for( int i = 0; i < testher2.length; i++ ) {
    //   testher2[i] = (int)(Math.random()*1000);
    // }
    //
    // System.out.println("size: " + testher2.length);
    // System.out.println("binary search time: " + binAv(testher2));
    // System.out.println("linear search time: " + linAv(testher2));


  }

}
