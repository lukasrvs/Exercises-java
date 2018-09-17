package Example;

public class test {
    public static void main(String[] args) {
    String Str = new String("This is really not immutable!!");
    boolean retVal;
    
    retVal = Str.endsWith("imutable!!");
    System.out.println("Return Value = "+ retVal);

    retVal = Str.endsWith("immu");
    System.out.println("Return Value = "+ retVal);

    }
}