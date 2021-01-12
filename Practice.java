package WrapperClass;

public class Practice {
    public static void main(String[] args) {

        Long num1 = 10l;
        Long num2 = new Long(10l);
        Long num3 = 10l;

        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));
        System.out.println(num1 == num3);


    }
}
