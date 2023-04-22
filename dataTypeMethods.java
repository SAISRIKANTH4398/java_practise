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
        System.out.println(((Object)num).getClass().getSimpleName());
    
    }
}