package com.AustinShootTheJ;

// classes in this example are created in main since they will be small not not used outside of the main.java.
// Polymorphism is the idea that subclasses are of the same type of their super class. For example Jaws is a movie and movies have a plot therefore jaws has a plot.
// This allows us to create an object of a super class such that : Superclass testObject = new Subclass()
// These types of decelerations come in handy for reducing the amount of "Type checking" in our code.
// In main we create random movies of all different subclasses. If that subclass has a plot method our code will use that method, if not it will default to Movie.plot()


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){

        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lots of people!";

    }
}

class IndependenceDay extends Movie{

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over planet earth.";

    }

        }


class MazeRunner extends Movie{

    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try to escape a maze.";

    }

}

class StarWars extends Movie{

    public StarWars(){
        super("StarWars");
    }

    @Override
    public String plot(){
        return "Imperial forces try to take over the universe.";

    }

}

class Forgettable extends Movie{

    public Forgettable(){
        super("Forgettable Movie");
    }

}







// Challenge starts here new classes etc...

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() Called!");
    }

    public void accelerate() {
        System.out.println("Car.accelerate() Called!");
    }

    public void brake() {
        System.out.println("Car.break() Called!");
    }

}

class Camaro extends Car{
    public Camaro() {
        super(6, "Camaro");
    }

    @Override
    public void startEngine(){
        System.out.println("Camaro.startEngine Called!");
    }
    @Override
    public void accelerate(){
        System.out.println("Camaro.accelerate() Called!");
    }
    @Override
    public void brake(){
        System.out.println("Camaro.break() Called!");
    }


}


class Tacoma extends Car{
    public Tacoma() {
        super(4, "tacoma");
    }

    @Override
    public void startEngine(){
        System.out.println("Tacoma.startEngine Called!");
    }
    @Override
    public void accelerate(){
        System.out.println("Tacoma.accelerate() Called!");
    }
    @Override
    public void brake(){
        System.out.println("Tacoma.break() Called!");
    }


}


class Tesula extends Car{
    public Tesula() {
        super(0, "Tacoma");
    }

    @Override
    public void startEngine(){
        System.out.println("Tesula.startEngine Called!");
    }

 
    @Override
    public void brake(){
        System.out.println("Tesula.break() Called!");
    }


}







public class Main {

    public static void main(String[] args) {


/*
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n"
                    + "Plot: " + movie.plot() + "\n");


        } */

        Movie testMovie = new Jaws();
        Car testCamaro = new Camaro();
        testCamaro.accelerate();
        Car testTesula = new Tesula();
        Car testPointer;
        testTesula.accelerate();
        testPointer = testCamaro;
        testPointer.accelerate();
        testCamaro.accelerate();
        testPointer = testTesula;
        testPointer.brake();







    }


    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number was " + randomNumber);

        // we do not break in this switch since we are returning anyways.
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();

            default:
                return null;
        }

    }




    }

