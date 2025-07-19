/*
 *  PRIMITIVE DT=== INT/CHAR/BOOLEAN/FLOAT/DOUBLE------ START WITH SMALL LETTER
 *  START WITH CAPS LETTER LIKE STRING -- THAT IS A CLASS.
 * 
 */
public class string {
    public static void main(String args[]) {
        // DECALARE THE STRING IN 2 WAYS--
        // 1 WAY:
        String name = "hiii";
        // 2 WAY:
        String namee = "marry";
        String nam = new String("marry");
        // TO CALCULATE HASH CODE-- .hashCode()
        System.out.println(name.hashCode());
        // check the character usaing the index
        System.out.println(namee.charAt(0));
        name = name + "reddy";
        System.out.println(name);
        String s1 = "marry";
        String s2 = "marry";
        // THE STRING ARE NOT EQUAL WHICH ARE DECLARE THROUGH NEW KEYWORD
        System.out.println(namee == nam);
        // STRING BUFEER AND BUILDER---> BOTH ARE MUTABLE STRING
        // STRING BUFFER --- THREAD SAFEE
        // STRING BUILDER---- NOT SAFE

    }
}
