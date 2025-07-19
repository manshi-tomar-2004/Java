public class binary_search {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 45, 61 };
        int t = 2;
        binary ob = new binary();
        int r = ob.binarymethod(a, t);// PASS THE PARAMETER
        System.out.println("the element at " + r + " position");

    }

}

class binary {
    int binarymethod(int x[], int y) // PASS ARRAY AS THE ARGUMENT
    {
        int i = 0, j = x.length - 1;// CALCULATE LENGTH OF THE ARRAY
        int m = (i + j) / 2;
        while (i < j) {
            if (y == x[m]) {
                return m + 1;
            } else if (y < x[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return -1;// IF WHILE CONDITION IS FALSE THEN RETUEN -1 WITHOUT THIS THE CODE SHOW ERROR

    }
}
