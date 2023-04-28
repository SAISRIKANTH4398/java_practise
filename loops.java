class whileLoop {
    public static void main(String[] args) {
        int num = 4;
        int counter = 0;

        while (counter < 3) {
            num = num + 1;
            System.out.println(num);
            counter = counter + 1;
        }
    }
}

class doWhile {
    public static void main(String[] args) {
        int n = 4;
        int counter = 0;

        do {       //It executes atleast one time
            n = n + 1;  //First executes and then checks the condition
            System.out.println(n);
            counter = counter + 1;
        } while (counter < 3);
    }
}

class forLoop {
    public static void main(String[] args) {
        int num = 4;

        for (int counter = 0; counter < 3; counter = counter + 1 ) {
            num = num + 1;
            System.out.println(num);
        }
    }
}