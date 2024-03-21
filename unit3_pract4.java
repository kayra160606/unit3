public class unit3_pract4
{
    public static void main(String[] args) {
        char c[]= args[0].toCharArray();
        System.out.println("\n Dispaly each character on separate line in resverse order");

        for(int i=c.length-1;i>=0;i--)
        System.out.println(c[i]);

        System.out.println("\n Count total number of character and display each character's position");
        System.out.println("\n Total number of characters are"+c.length);
        for(int i=0;i<=c.length;i++)
        System.out.println(c[i]+" character is at"+ i +"position");

        System.out.println("\n Identify the string is paliandorm or not");
        StringBuffer s1= new StringBuffer(args[0]);

        StringBuffer s2= s1.reverse();
        if(s1.equals(s2))
         System.out.println("\n String is palindorm");
        else
         System.out.println("\n string is not poliandrom");
         
        System.out.println("\n Total number of uppercase and lowecase character");
        int up=0,lw=0;
        for(int i=0;i<c.length;i++) 
        {
            if(Character.isUpperCase(c[i]))
             up++;
            else
             lw++; 
        }
        System.out.println("\n Uppercase character are:"+up);
        System.out.println("\n Lowercase character are:"+lw);

    }
}