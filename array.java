/*
 * (1) SYNTAX OF 1D ARRAY--- DATA_TYPE NAME_ARRAY[]={}___OR______DATA_TYPE [] NAME_ARRAY={}
 * ___________________________DATATYPE ARRAY NAME[] = new DATATYPE [NO. OF ELEMENT IN THE ARAY]
 * 
 * (2) DISPLAY ARRAY - USING LOOP
 * ___________________ARRAY NAME[ INDEX NO. ]
 * (3) CHANGE VALUE IN ARRAY----------- a[0]=10;
 * (4) TO GET RANDOM VALUES USE---
 * (int)(Math.random)___________(DT)(Math.function_name)
 * (5) CAN NOT WRITE NO. OF ELEMENTS IN  DATA_TYPE NAME_ARRAY[]={} SO THAT TO WRITE THE INDEX NO. WE INITIALOIZE THE ARRAY USING NEW KEYWOERD.
 * (6) DEFAULT VALUE IN ARRAY IS ZERO.
 * 
 */
public class array {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4 };
        System.out.print(a[0]);
        int b[] = new int[5];
        b[0] = 5;
        System.out.print(b[3]);

        // 2-DIMENSIONAL ARRAY
        // FOR LOOP

        int c[][] = { { 1, 2 }, { 3, 4 }, { 6, 7 } };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + "   ");
            }
            System.out.println();
        }
        // SECOND WAY TO DISPLAY THE 2D ARRRAY
        // FOR EACH LOOP
        // no need to write the size
        // ENHANCE LOOP

        for (int n[] : c) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println(c[1].length);
        // JAGGED ARRAY
        // in this for each row we specify the diff. no. of column
        // in which the size is not detrmined
        int ar[][] = new int[3][];
        ar[0] = new int[3];// 3 represent no. of column in that row
        ar[1] = new int[2];
        ar[2] = new int[3];

    }
}