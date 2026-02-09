public class Overloading {

    void add(){
        System.out.println("no parameter passed ");
    }

    void add(int a,int b){
        System.out.println("sum of two = " +(a+b));
    }

    void add(int a,int b, int c) {
        System.out.println("sum of three value = " +(a+b+c));
    }

    void add(double a, double b){
        System.out.println("sum of double value = "+(a+b));
    }
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.add();
        obj.add(99,78);
        obj.add(9,8,45);
        obj.add(77.87,23.98);
  
    }
}
