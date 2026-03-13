// File: Test4.java
class Car {
    void start() {
        System.out.println("Car is starting...");
    }
}

class Benz extends Car {
    void start() {
        System.out.println("Benz is starting...");
    }
}

class Audi extends Car {
    void start() {
        System.out.println("Audi is starting...");
    }
}

class Driver {
    void drive(Car c) {  
        c.start();
    }
}

public class Test4 {
    public static void main(String[] args) {
        Driver d1 = new Driver();
        Benz b1 = new Benz();
        Audi a1 = new Audi();

        d1.drive(b1);
        d1.drive(a1);
    }
}
