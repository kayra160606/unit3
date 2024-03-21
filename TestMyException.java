class RangeException extends Exception 
{
    RangeException(String message) {
        super(message);
    }
}
class TestMyException {
    public static void main(String args[])
    {
        int a[]=new int[5];
        try {
            for(int j=0;j<5;j++) {
                a[j]=Integer.parseInt(args[j]);
            }
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception occur");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index exception occur");
        }
        catch(Exception e){
            System.out.println("Exception"+e.getMessage());
        }
    }
}