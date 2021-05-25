package chapter10;

public class Zoo {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();
        feed(dog);

        Animal animal = new Dog();
        animal.makeSound();
        feed(animal);

        animal= new Cat();
        animal.makeSound();
        ((Cat) animal).scratch();
        feed(animal);
    }
    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("here's your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("here's your cate food");
        }
    }

}
