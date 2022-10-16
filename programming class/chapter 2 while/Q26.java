public class Q26 {
  public static void AsciiAtoZ( )
    {
        for(char ch='A';ch<='Z';ch++)
        System.out.print((int)ch+" ");
    }
    public static void Asciiatoz( )
    {
        for(char ch='a';ch<='z';ch++)
        System.out.print((int)ch+" ");
    }
    public static void Ascii0to9( )
    {
        for(char ch='0';ch<='9';ch++)
        System.out.print((int)ch+" ");
    }
    public static void main(String[] args) {
        AsciiAtoZ();
        System.out.println();
        Asciiatoz();
        System.out.println();
        Ascii0to9();
    }

}
