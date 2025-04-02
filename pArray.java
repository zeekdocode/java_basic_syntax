import java.util.Arrays;

public class pArray {
    public static void main(String[] args) {

        // int[] intArray;
        // String[] stringArray;
        // MyClass[] myClassArray; // declaring an array of intereger of any variable

        // int[] intArray;
        // int intArray[];

        // String[] stringArray;
        // String stringArray[];

        // MyClass[] myClassArray;
        // MyClass myClassArray[];

        // You can you brakets on the end of the variable type or you can put it on the
        // end of the variable name

        // two common types of iniailizing an array, again array can hadle any data type
        // int[] intArray;
        // intArray = new int[10];

        // String[] stringArray = new String[10];
        // int intArray[] = new int[10];

        // This is just an empty arrays that are initialize

        // array literals, initializing an array directly without declaring the size of
        // an array

        // int[] ints2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // System.out.println(ints2[9]);

        // String[] strings = { "one", "two", "three" };
        // System.out.println(strings[2]);
        // System.out.println(ints2[9]+" " + strings[2]);
        // this also show the accesing the elements on the arrays

        // intArray[0] = 0;

        // int firstInt = intArray[0];
        // System.out.println(firstInt); accessing and declaring the element value on a
        // array

        // int sArray = ints2[2] + ints2[9];
        // System.out.println(sArray); // tring some basic arithmetic expression for an
        // array

        // int[] intArray = new int[10]; // this is for knowing the length of an array
        // int arrayLength = intArray.length;

        // System.out.println(arrayLength);

        // String[] stringArray = new String[10]; iterating arrays using for loop

        // this is the longer version
        // for (int i = 0; i < stringArray.length; i++) {
        // stringArray[i] = "String no " + i;

        // }

        // for (int i = 0; i < stringArray.length; i++) {
        // System.out.println(stringArray[i]);
        // }

        // this is the shorter version ,the elements of
        // the arrays is printed within the first for loop unlike the first one it go
        // through another for loop for printing the elements on the array

        // for (int i = 0; i < stringArray.length; i++) {
        // stringArray[i] = "String no " + i;
        // System.out.println(stringArray[i]);

        // }

        // int[] intArray = new int[10];

        // for (int i = 0; i < intArray.length; i++) {
        // intArray[i] = i;
        // }

        // for (int i = 0; i < intArray.length; i++) {
        // System.out.println(intArray[i]);
        // }

        // int[] intArray = new int[10];

        // for(int i=0; i < intArray.length; i++) {
        // intArray[i] = i;
        // }

        // for(int i=0; i < intArray.length; i++) {
        // System.out.println( intArray[i] );
        // }
        // iterating arrays last syntax for today march 1

        // int[] intArray = new int[10];

        // for (int theInt : intArray) {
        // System.out.println(theInt);
        // } for each loop another way of iterating arrays

        // String stringArray[] = { "one", "two", "three" };

        // for (String theString : stringArray) {
        // System.out.println(theString);

        // } iterating the string elements within the arrays using for each loop

        // int[][] intArray = new int[10][20]; multi dimensional arrays
        // intArray[0][2] = 129;

        // int oneInt = intArray[0][2];
        // System.out.println(oneInt);

        // int[][] intArray = new int[10][20]; iterating multi demensional arrays

        // for (int i = 0; i < intArray.length; i++) {
        // for (int j = 0; j < intArray[i].length; j++) {
        // System.out.println("i: " + i + ", j: " + j);
        // }
        // }

        // int[] ints = new int[20];

        // int insertIndex = 10;
        // int newValue = 123;

        // // move elements below insertion point.
        // for (int i = ints.length - 1; i > insertIndex; i--) {
        // ints[i] = ints[i - 1];
        // }

        // // insert new value
        // ints[insertIndex] = newValue;

        // System.out.println(Arrays.toString(ints));

        // this is a example method on how to insert an new element in an array
        // public void insertIntoArray(
        // int[] array, int insertIndex, int newValue) {

        // // move elements below insertion point.
        // for (int i = array.length - 1; i > insertIndex; i--) {
        // array[i] = array[i - 1];
        // }

        // // insert new value
        // array[insertIndex] = newValue;
        // }

        // int[] ints = new int[20];

        // insertIntoArray(ints, 0, 10);
        // insertIntoArray(ints, 1, 23);
        // insertIntoArray(ints, 9, 67);
        // this is how to used the method that was made to insert an array

        // int[] ints = new int[20];

        // ints[10] = 123;

        // int removeIndex = 10;

        // for(int i = removeIndex; i < ints.length -1; i++){
        // ints[i] = ints[i + 1];
        // } this is the way to remove an array on a index

        // public void removeFromArray(
        // int[] array, int removeIndex){

        // for(int i = removeIndex; i < array.length -1; i++){
        // array[i] = array[i + 1];
        // }
        // } same on adding this is a example method on removing an array on a index

        // int[] ints = { 0, 2, 4, 6, 8, 10 }; this finds the min value within the array

        // int minVal = Integer.MAX_VALUE;

        // for (int i = 0; i < ints.length; i++) {
        // if (ints[i] < minVal) {
        // minVal = ints[i];
        // }
        // }

        // System.out.println("minVal = " + minVal);

        // int[] ints = {0,2,4,6,8,10};

        // int maxVal = Integer.MIN_VALUE;
        // for(int i=0; i < ints.length; i++){
        // if(ints[i] > maxVal){
        // maxVal = ints[i];
        // }
        // }
        // System.out.println("maxVal = " + maxVal);

        // different types if copying an array on to another
        // int[] source = new int[10];
        // int[] dest = new int[10];

        // for (int i = 0; i < source.length; i++) {
        // source[i] = i;
        // }

        // for (int i = 0; i < source.length; i++) {
        // dest[i] = source[i];
        // }

        // copying using Array.copyof
        // int[] source = new int[10];

        // for (int i = 0; i < source.length; i++) {
        // source[i] = i;
        // }

        // int[] dest = Arrays.copyOf(source, source.length);

        int[] source = new int[10];

        for (int i = 0; i < source.length; i++) {
            source[i] = i;
        }

        int[] dest = Arrays.copyOfRange(source, 0, source.length);

        System.out.println(dest);

    }

}
