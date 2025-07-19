public class arrayobject {
    public static void main(String args[]) {

        sttudent s1 = new sttudent();
        s1.roll = 1;
        s1.name = "john";
        s1.marks = 78;

        sttudent s2 = new sttudent();
        s2.roll = 2;
        s2.name = "marry";
        s2.marks = 90;

        sttudent s3 = new sttudent();
        s3.roll = 3;
        s3.name = "nanii";
        s3.marks = 67;

        // take the object in the array
        // CLASS_NAME ARRAY_NAME[]= {} OR new CLASS_NAME[NO. OF ELEMENT]
        sttudent students[] = { s1, s2, s3 };
        // create array to hold the student reference
        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].roll + "  " + students[i].name);

        }
    }

}

class sttudent {
    int roll;
    String name;
    int marks;
}