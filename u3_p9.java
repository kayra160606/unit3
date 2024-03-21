class UnitformatException extends Exception
{
    UnitformatException(String s)
    {
        super(" UnitformatException:unit is not valid "+s);
    }
}
class u3_p9
{
    public static void main(String args[])
    {
        int no;
        String u;
        try{
            no=Integer.parseInt(args[0]);
            u=args[1];
            if((u.equals("centimeter")) || (u.equals("meter")))
            {
                if(u.equals("centimeter"))
                {
                    int m=no/100;
                    System.out.println("Equivalent number of meter is"+m);
                }
                else
                {
                    int cm=no*100;
                    System.out.println("Equivalent number of centimeter is"+cm);
                }
            }
            else
            throw new UnitformatException(u);
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
            System.out.println("Exception:"+getMessage());
        }
    }
}