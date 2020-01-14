package InnerClassExmple;
class Outer{
    void outerMethod(){

        System.out.println("inside outer method");

        class Inner{
            void innerMethod(){
                System.out.println("inside inner method");
            }
        }

        Inner innerObj = new Inner();
        innerObj.innerMethod();
    }

}


public class JavaLocalInnerClass {
    public static void main(String[] args){
        Outer outerObj = new Outer();
        outerObj.outerMethod();

    }
}

