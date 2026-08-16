public class TypeCasting {
    public static void main(String[] args){
        int a = 12990;
        long b = a;
        byte c = (byte) b;
        System.out.println("(Implicit type conversion) Value of b: " + b);
        System.out.println("(Explicit type conversion) Value of c: " + c);

    }
}
