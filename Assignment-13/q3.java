class MainClass 
{
  public static <E> void printArray(E[] inputArray) 
  {
    for (E element : inputArray)
      System.out.printf("%s ", element);

    System.out.println();
  }

  public static void main(String args[]) 
  {
    Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
    Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

    System.out.println("Array integer Array contains:");
    printArray(integerArray); 
    System.out.println("\nArray double Array contains:");
    printArray(doubleArray);
    System.out.println("\nArray character Array contains:");
    printArray(characterArray);
  } 
}