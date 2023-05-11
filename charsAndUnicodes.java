class Unicodes {
    public static void main(String[] args){
        char ch = 'A';
        char ch1 = 'B';
        int unicode = ch;           //Implicit conversion
        System.out.println(unicode);
        System.out.println((int) ch1);     //Explicit conversion
    }
}
