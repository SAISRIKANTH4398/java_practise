class helloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
    
class Addition {
    public static void main(String[] args){
        System.out.println(5+2);
        System.out.println(5/2);
    }
}

class Variable{
    public static void main(String[] args){
        int a ;
        a = 90;
        System.out.println(a);
    }
}

class isEven{
    public static void main(String[] args){
        int a = 91;
        boolean isEven = (a%2==0);
        System.out.println(isEven);
    }
}

class Rectangle{
    int height;
    int width;
    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    int get_width(){
        return this.width;
    }

    void get_area(){
        System.out.println(this.width*this.height);
    }
}

class Main {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect.height);
        System.out.println(rect.get_width());
        rect.get_area();
    }
}