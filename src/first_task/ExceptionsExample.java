package first_task;

public class ExceptionsExample {

    public static void main(String[] args) {

        //unchecked exception is simply one where there is no catch meaning the exception isnt resolved
        // that can be accomplished by just removing the try-cach block from this code, and it will error out in runtime

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
