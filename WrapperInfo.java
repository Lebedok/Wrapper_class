package WrapperClass;

public class WrapperInfo {

    public static void main(String[] args) {

        byte by = 10;

        Byte b = new Byte(by); // primitive datatype byte converted to object

        System.out.println(b==10);


        Character ch = new Character('d');
        System.out.println(ch);

        System.out.println(Character.isDigit('1'));

        System.out.println(ch.compareTo('z')); // if both char equals to each other
        // compareTo() method will 0 otherwise it will return - result

        char c1 = 'c';


        Boolean bl = new Boolean("true");
        System.out.println(bl);


        Integer number = new Integer(11);
        Integer num = 55;// we can assign directly (no new keyword)
        Integer num1 = new Integer(55);
        Long ln = 100l;
        Short sh = 55;
        Float fl = 44f;
        Double db = 56.6;
        Double db1 = (double)56;

        System.out.println(num == num1);  // FALSE since the references are not
        //pointing to same object
        System.out.println(num.equals(num1)); // TRUE  if the equals mthod is coming from
        // object class it will compare the references are pointed to the same
        // object or not.
        // if the equals method is coming from the Wrapper class, it will compare the
        // values of the object



    }


}
