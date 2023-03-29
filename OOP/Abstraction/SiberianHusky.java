package OOP.Abstraction;


public class SiberianHusky implements DogInterface{

        @Override
        public void bark() {
            System.out.println("SiberianHusky -barks!");
        }

        @Override
        public void eat(){
            System.out.println("SiberianHusky -eats!");
        }

        @Override
        public void run(){
            System.out.println("SiberianHusky -runs!");
        }
}

