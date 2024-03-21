class RangeException extends Exception
{
    RangeException(int i)
    {
        super("RangeException: Marks is not valid"+i);
    }
}
class u3_p7
{
    public static void main(String args[])
    {
        int a[]=new int[3];
        int sum=0;
        float per=0.0f;
        for(int i=0;i<3;i++)
        {
            try{
                a[i]=Integer.parseInt(args[i]);
                if(a[i]<0 || a[i]>100)
                {
                    throw new RangeException(a[i]);
                }
                else if(a[i]>=40)
                {
                    sum=sum+a[i];
                    System.out.println("\n Pass in Subject"+i);
                }
                else{
                    sum=sum+a[i];
                    System.out.println("\n Fail in Subject"+i);
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Number Format Exception");
            }
            catch(ArithmeticException e) {
                System.out.println("arithmetic exception occur");
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("array index exception occur");
            }
            catch(Exception e) {
                System.out.println("Exception: "+e.getMessage());
            }
        }
        per=(float) sum/3;
        System.out.println("\n Percentage is"+per);

    }
}