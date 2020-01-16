package AnnonymousInner;

public class AnonymousClassDemo {

    /*
     the Dog reference variable dog refers not to an
     instance of Dog but to an instance of an anonymous inner subclass of Dog.
     */


    public static void main(String[] args)
    {
        Dog dog = new Dog() {
            public void someDog ()
            {
                System.out.println("Anonymous Dog");
            }
        }; // anonymous class body closes here
        //dog contains an object of anonymous subclass of Dog.
        dog.someDog();


    }
}

class Dog {
    public void someDog() {
        System.out.println("Classic Dog");
    }
}

/*
Dog dog = new Dog() {, there is a brace at the end of line, not a semicolon.
This curly brace opens the class definition and declares a new class that has no name (anonymous class).
 Now let's enter into the body of newly defined subclass of class Dog and you will see that someDog() is being
 overridden. This is the crux of defining an
 anonymous inner class because we want to override one or more methods of the super class on the fly.
 */