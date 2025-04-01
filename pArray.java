
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

        int[] intArray = new int[10];

        for(int i=0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        
        for(int i=0; i < intArray.length; i++) {
            System.out.println( intArray[i] );
        }

    }

}
