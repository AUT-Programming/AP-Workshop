public class A extends B{
    private int aInt;
    public A(int aInt, int bInt) {
        super(bInt);
        this.aInt = aInt;
    }

    @Override
    public void show(){
        System.out.println("salam a");
    }

    public static void main(String[] args) {
//        A a = new A(10, 20);
//        if(a instanceof A){
//            System.out.println("yes a is instanceof A");
//        }
//        if(a instanceof B){
//            System.out.println("yes a is instanceof B");
//        }
//        B b = new B(100);
//        if(!(b instanceof A)){
//            System.out.println("yes b isn't instanceof A");
//        }
//        B c = null;
//        if(!(c instanceof B)){
//            System.out.println("yes null isn't instanceof B");
//        }
//         B obj1 = new A(5, 5);
//         A objA1 = (A)obj1;
//            B obj2 = new B(10);
//            A objA2 = (A)obj2;
        A test = new A(1, 2);
        test.show();
    }
}
