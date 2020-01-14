package InnerClassExmple;


class JavaOuterClass{

    private int value = 60;

    class JavaInnerClass{
        public int getValue() {
            System.out.println("getValue method of inner class here- ");
            return value;
        }
    }
}

public class JavaNestedInnerClass {
    public static void main(String args[]){

        JavaOuterClass outer = new JavaOuterClass();


        JavaOuterClass.JavaInnerClass inner = outer.new JavaInnerClass();
        System.out.println(inner.getValue());
    }
}
