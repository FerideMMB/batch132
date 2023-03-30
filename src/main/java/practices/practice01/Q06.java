package practices.practice01;

public class Q06 {
//Type code to calculate sum of all whole number primitive data types' min and max values.
public static void main(String[] args) {
    //byte, short, integer, long

   byte minByte = Byte.MIN_VALUE;
   byte maxByte = Byte.MAX_VALUE;

   short minShort = Short.MIN_VALUE;
   short maxShort = Short.MAX_VALUE;

   int minInteger = Integer.MIN_VALUE;
  int maxInteger = Integer.MAX_VALUE;

  long minLong = Long.MIN_VALUE;
  long maxLong = Long.MAX_VALUE;
    System.out.println(minByte+maxByte+minShort+maxShort+minInteger+maxInteger+minLong+maxLong);

}
}
