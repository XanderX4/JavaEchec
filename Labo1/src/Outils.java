
public class Outils {
    /**
     * function that make a bubble sort by the tab in parameter of the function
     * @param tableau tab that are use by the function to sort
     * @return the tab that are sort by the function
     */

    public static int[] bubbleSortIntArray(int[] tableau) {
        int i = 1;
        int temp;
        boolean changed = true;


        while (i < tableau.length && changed)
        {
            changed = false;
            for (int index = 0; index < tableau.length-1; index++)
            {
                if (tableau[index] > tableau[index + 1])
                {
                    changed = true;

                    temp= tableau[index];
                    tableau[index] = tableau[index + 1];
                    tableau[index + 1] = temp;
                }

            }
            i++;
        }
        return tableau;
    }

    /**
     * @param arr
     * @return
     */
    public static int[] insertionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i)
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

