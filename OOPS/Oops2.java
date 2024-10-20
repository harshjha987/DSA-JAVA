package OOPS;

public class Oops2 {
    public static void main(String args[]){
        Dog tom = new Dog();
        tom.legs = 4;
        tom.name = "tom";
        System.out.println(tom.name);
        tom.eat();
        tom.bark();
        System.out.print(tom.legs);

    }
    
}
class Animal{
      int legs;
      Animal(){
        System.out.print("Animal is here");
      }
      
      void eat(){
        System.out.println("Animal eats");
      }
     
}
class Dog extends Animal{

    String name;
    
    void bark(){
        System.out.println("Dog Barks");
    }
    
    
}
