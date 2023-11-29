public class insertAtEnd
{
    public static void main(String[ ] args)
    {
        int[ ] myArray = {10, 20, 30, 40, 50};
        myArray = insertAtEnd(myArray, 5);

        for(int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + ", ");
        }
    }
    private static int[ ] insertAtEnd(int[ ] array, int value)
    {
        int[ ] tempArray = new int[array.length + 1];

        for(int i = 0; i < tempArray.length - 1; i++)
        {
            tempArray[i] = array[i];
        }

        tempArray[tempArray.length - 1] = value;

        return tempArray;
    }
}