package WrapperClass;

public class StringToPrimitive {
    public static void main(String[] args) {

        String nm = "123";
        String nm1 = "120";

        System.out.println(nm+nm1);


        int num =Integer.parseInt(nm);
        int num1 = Integer.parseInt(nm1);

        System.out.println(num + num1);


        String test = "12.5";
        double result = Double.parseDouble(test);
        System.out.println(result);

        //int result1 = Integer.parseInt("12.5");    // numberFormatException
       // System.out.println(result1);

        //long ln = Long.parseLong("test");  // NumberFormatException


    }
}
