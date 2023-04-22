class dataType {
    public static void main(String[] args){
        int num = 2321;  //Primitive data type
        String word = "Nikky";  // Non-Primitive data type
        System.out.println(((Object)num).getClass().getSimpleName());  //it is for primitive data type
        System.out.println(word.getClass().getSimpleName());  //it is for non-primitive data type
    }
}

class implicitTypeCasting {
    public static void main(String[] args) {
        int value = 4;
        long num = 5L;
        long sum = value+num;   //compiler automatically converts the type
        System.out.println(((Object)sum).getClass().getSimpleName());
    }
}

class explicitTypeCasting {
    public static void main(String[] args){
        long value = 10L;
        float num = (float) value;
        char x = 'A';
        System.out.println(((Object)num).getClass().getSimpleName());
        System.out.println((int) x);  //It returns the ASCII values
    
    }
}

class dataChangeMethods{
    public static void main(String[] args){
        int num = 2;
        float floatNum = 2.5f;
        char a = 'i';
        System.out.println(String.valueOf(num));  //Converts to String from primitive datatype
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(floatNum));
    }
}

class dataTypeChangeMethods{
    public static void main(String[] args){
        String value = "123";
        String doubleNum = "12.345";
        char ch = '3';
        int number = 3;
        int num = Integer.parseInt(value);   //Converts Str to int value
        int num1 = Character.getNumericValue(ch);  // Converts Character to Integer value
        char ch1 = Character.forDigit(number, 10);  //Converts Integer to Character
        double dbl = Double.parseDouble(doubleNum);   //Converts Str to Double
        float floatNum = Float.parseFloat(doubleNum);  //Converts Str to Float
        System.out.println(num);
        System.out.println(num1);
        System.out.println(ch1);
        System.out.println(dbl);
        System.out.println(floatNum);
    }
}