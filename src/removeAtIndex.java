public class removeAtIndex {
    public static void main(String[ ] args)
    {
        int[ ] myArray = {10, 20, 30, 40, 50};
// Remove value from Array at index = 3.
        myArray = remove(myArray, 3);
        for(int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + ", ");
        }
    }
    private static int[ ] remove(int[ ] array, int index)
    {
        int[ ] tempArray = new int[array.length - 1];
        boolean hasOccured = false;


         for(int i = 0; i <= tempArray.length; i++)
         {
            if (i == index)
            {
                hasOccured = true;

            } else if (hasOccured == true)
            {
                tempArray[i-1] = array[i];
                System.out.println(array[i]);
            } else
            {
                tempArray[i] = array[i];
                System.out.println(array[i]);
            }
         }


        return tempArray;
    }
}
