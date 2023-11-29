public class insertAtIndex {
    public static void main(String[ ] args)
    {
        int[ ] myArray = {10, 20, 30, 40, 50};
// Insert 35 into Array at index = 3.
        myArray = insert(myArray, 3, 35);
        for(int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + ", ");
        }
    }
    private static int[ ] insert(int[ ] array, int index, int value)
    {
        int[ ] tempArray = new int[array.length + 1];
        boolean hasOccured = false;

        for(int i = 0; i <= tempArray.length - 1; i++)
        {
            if(i == index)
            {
                tempArray[i] = value;
                hasOccured = true;
            }
            else if(hasOccured)
            {
                tempArray[i] = array[i-1];
            }
            else
            {
                tempArray[i] = array[i];
            }
        }

        return tempArray;
    }
}
