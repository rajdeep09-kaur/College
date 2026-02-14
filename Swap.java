public class swap {
public static void main(String[] args) {
    int a = 4;
    int b = 8;
        System.out.println(" before swapping = " + a );
        System.out.println(" before swapping = " + b );
        
        int temp = a;
        a = b;
        temp = b;

        System.out.println(" after swapping = " + b );
        System.out.println(" after swapping = " + a );
        
    }
}
