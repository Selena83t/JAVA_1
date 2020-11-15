package Java_firs.lesson5;

public class Animal {
    String name;
    int maxRun;
    float maxJump;
    int maxSwim;


    public Animal( String name, int maxRun, int maxSwim, float maxJump ) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }


    public static void main( String[] args ) {

        Cat cat = new Cat("Barseek", 200, 0, 2);

        System.out.println();

        Dog dog = new Dog("Sharik", 500, 10, (float) 0.5);

        Cat cat1 = new Cat("Moorzeek", 100, 0, 2);

        Dog dog1 = new Dog("Bobeek", 600, 10, (float) 0.5);

       cat.run(); cat.jump(); cat.swim(); cat.canRun(300);

       cat1.run(); cat1.jump(); cat1.swim(); cat1.canRun(150);


       dog.run(); dog.jump(); dog.swim(); dog.canRun(40);

       dog1.run(); dog1.jump(); dog1.swim(); dog1.canRun(800);


    }

    public void jump() {
        System.out.println(name + " can jump over obstacles at a height of " + maxJump + " meters");

    }

    public void swim() {
        if (maxSwim > 0) {
            System.out.println(name + " can swim by " + maxSwim + " meters");
        } else {
            System.out.println(name + " cannot swim and drowned... ;(");
        }
    }
    public void canRun(int a) {

        if (a <= maxRun && a > 0) {
            System.out.println(name  + " RAN! ");
            System.out.println();
        } else {
            System.out.println(name  + " cannot run " +a + " meters and died... :(");
            System.out.println();
        }
    }
    public void run() {
        System.out.println(name + " can run by " + maxRun + " meters");
    }

}
