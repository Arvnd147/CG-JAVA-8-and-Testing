class Static{
    public static int k=40;
    public static void test(){
        int k = 100; //if public static is used again, k willbe permanently changed to 100
        System.out.println("Test Method --> "+k);
    }
    public static void main(String[] args) {
        test();
        System.out.println("Main Method --> "+k);
    }
}

