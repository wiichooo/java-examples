public class Generics2<T> {
    private T t;
 
    public void add(T t) {
       this.t = t;
    }
 
    public T get() {
       return t;
    }
 
    public static void main(String[] args) {
        Generics2<Integer> integerBox = new Generics2<Integer>();
        Generics2<String> stringBox = new Generics2<String>();
     
       integerBox.add(new Integer(10));
       stringBox.add(new String("Hello World"));
 
       System.out.printf("Integer Value :%d\n\n", integerBox.get());
       System.out.printf("String Value :%s\n", stringBox.get());
    }
 }