public class Main {
    public static void main(String[] args) {
        //shape
        Circle circle = new Circle(5.56);
        Rectangle rectangle = new Rectangle(5, 5.35);
        circle.area();
        rectangle.area();
        System.out.println("----------------------");

        //transport
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        car.start();
        bicycle.start();
        car.stop();
        bicycle.stop();
        System.out.println("Speed of car: " + car.getSpeed());
        System.out.println("Speed of bicycle: " + bicycle.getSpeed());
        System.out.println("----------------------");

        //anonymous class
        Drawing drawing = new Drawing();
        ShapeDrawing shapeDrawing = () -> System.out.println("I want to draw some shape");
        drawing.draw(shapeDrawing);
        System.out.println("----------------------");

        //Sportsmans and scores
        Sportsman sportsman1 = new Sportsman("Vlad", 140);
        Sportsman sportsman2 = new Sportsman("Maks", 130);
        Sportsman sportsman3 = new Sportsman("Jonh", 150);
        Sportsman.updateBestScore(sportsman1.getScore(), sportsman1.getName());
        Sportsman.updateBestScore(sportsman2.getScore(), sportsman2.getName());
        Sportsman.updateBestScore(sportsman3.getScore(), sportsman3.getName());
        System.out.println("Winner: " + Sportsman.getNameWinner());
        System.out.println("Best score: " + Sportsman.getBestScore());
        System.out.println("----------------------");

        //static block of initialization
        String user = Configuration.getUser();
        String password = Configuration.getPassword();
        String url = Configuration.getUrl();
        System.out.println("information about user");
        System.out.println("Name of user: " + user);
        System.out.println("Password: " + password);
        System.out.println("URL: " + url);
        System.out.println("----------------------");

    }
}