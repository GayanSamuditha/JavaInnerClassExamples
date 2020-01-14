package InnerClassExmple;

public class Roses {


    public void getRoses() {

        class RoseValidator {

            public void validate(String name) {
                if (name != null && name != ""){
                    if("Green".equalsIgnoreCase(name) || "Blue".equalsIgnoreCase(name){
                        System.out.println("Validator Success");
                    }else{
                        System.out.println("invalid color");
                    }
                }else{
                    System.out.println("Validation fail due to null or empty");
                }
            }
        }

        new RoseValidator().validate("Blue");

        for (Rose rose : roses){
            System.out.println("that is : "+rose.name);
        }
    }
}
