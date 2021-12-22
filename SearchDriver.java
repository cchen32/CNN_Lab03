/*
CNN: Nicole Zhou + Duck, Corina Chen + BinkTop, Nada Hameed + Ray
APCS
L03 Search Driver
12-21-2021
Time Spent: 1.5 hr
*/

public class SearchDriver{

  //method to determine the avg time for binary search of testing through several targets

  public static double binAv(Comparable[] arr){
    long start;
    long end;
    long total = 0;
    for(int x = 0; x < 1000; x++){
      start = System.currentTimeMillis();
      for(int i = 0; i < 100; i++){
        // BinSearch.binSearch(arr, i);
        BinSearch.binSearch(arr, ((int)Math.random()*(arr.length)));
      }
      end = System.currentTimeMillis();
      total = total + (end - start);
    }
    return (double)(total);
  }

  //method for avg time for linear search
  public static double linAv(Comparable[] arr){
    long start;
    long end;
    long total = 0;
    for(int x = 0; x < 1000; x++){
      start = System.currentTimeMillis();
      for(int i = 0; i < 100; i++){
        //LinSearch.linSearch(arr, i);
        LinSearch.linSearch(arr, ((int)Math.random()*(arr.length)));
      }
      end = System.currentTimeMillis();
      total = total + (end - start);
    }
    return (double)(total);
  }

  public static void populate(Comparable[] arr){
    for(int i = 0; i < arr.length; i++){
      arr[i] = i + 1;
    }
  }

  public static void main(String[] args) {
    Comparable[] init = new Comparable[1];
    populate(init);
    System.out.println("size: " + init.length);
    System.out.println("binary search time: " + binAv(init));
    System.out.println("linear search time: " + linAv(init));

    for (int i = 1; i < 1_000_000_000; i *= 10) {
      Comparable[] testher = new Integer[i];
      populate(testher);

      System.out.println("size: " + testher.length);
      System.out.println("binary search time: " + binAv(testher));
      System.out.println("linear search time: " + linAv(testher));
    }
  }
}
