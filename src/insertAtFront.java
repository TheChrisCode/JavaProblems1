public class insertAtFront
{
    public static void main(String[ ] args)
    {
        int[ ] myArray = {10, 20, 30, 40, 50};
        myArray = insertAtFront(myArray, 5);

        for(int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + ", ");
        }
    }
    private static int[ ] insertAtFront(int[ ] array, int value)
    {
        int[ ] tempArray = new int[array.length + 1];

        tempArray[0] = value;

        for(int i = 1; i <= array.length; i++)
        {
            tempArray[i] = array[i-1];
        }

        return tempArray;
    }
}