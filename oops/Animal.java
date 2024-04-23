public class Animal {
    String color;
    int age;
    public Animal(String c, int a) {
        color = c;
        age = a;
    }
    public void eat() {
        System.out.println("I am eating");
    }

    public void display() {
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        Animal a = new Animal("black", 10);
        a.eat();
        System.out.println(a.color + " " + a.age);
        a.display();
    }
}
