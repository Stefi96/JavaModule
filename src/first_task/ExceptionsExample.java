package first_task;

public class ExceptionsExample {

    public static void main(String[] args) {

        try{
            int niz[]=new int[5];
            niz[5]=30/0;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }

        System.out.println("rest of the code");

    }

}
