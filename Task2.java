public class Task2 {
    public void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public void sub(int a, int b){
        int diff = a-b;
        System.out.println(diff);
    }
    public static void mul(int a,int b){
        int prod = a*b;
        System.out.println(prod);
    }
    public static void div(int a, int b){
        double quo = a/b;
        System.out.println(quo);
    }

    public static void main(String[] args) {
        Task2 obj = new Task2();
        obj.add(5, 10);
        obj.sub(500,200);

        mul(4, 5);
        div(10,3);
    }
}