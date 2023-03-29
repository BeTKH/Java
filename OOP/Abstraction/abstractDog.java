package OOP.Abstraction;

    /*
        --  ABSTRACT CLASS --
        * is used to create other REGULAR classes
        * is like a todo_list
        * specifies what methods and states the class MUST contain
        * class created from an abstract class will implement the list specified by the abstract class
        * object can't be directly created from an ABSTRACT class
        * a REGULAR class can be created from abstract class by inheritance ( extending it)
        * then an object can be created from it (REGULAR class)
        *  ABSTRACT classes CAN CONTAIN aN ABSTRACT METHOD as well as a Regular METHOD ( implemented method)
        **/


abstract class abstractDog {

    String breed;

    // REGULAR METHOD
    public void bark(){
        System.out.println("Bark!");
    }

    // ABSTRACT METHOD
    public abstract void eat();
}
