class Unicodes {
    public static void main(String[] args){
        char ch = 'A';
        char ch1 = 'B';
        int unicode = ch;           //Implicit conversion
        System.out.println(unicode);
        System.out.println((int) ch1);     //Explicit conversion
    }
}


class Alphabets{
    public static void main(String[] args){
        for (int unicodeValue = 65; unicodeValue < 91; unicodeValue = unicodeValue + 1) {
            System.out.println((char)unicodeValue);    //Printing alphabet using unicode values
        }
    }
}