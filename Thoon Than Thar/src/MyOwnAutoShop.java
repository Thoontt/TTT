class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;

    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.90; // 10% discount
        } else {
            return regularPrice * 0.80; // 20% discount
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;

    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95; // 5% discount
        } else {
            return regularPrice * 0.90; // 10% discount
        }
    }
}

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(150, 20000, "Red", 22);
        Ford ford1 = new Ford(160, 25000, "Blue", 2020, 3000);
        Ford ford2 = new Ford(140, 22000, "Black", 2019, 2500);
        Car car = new Car(120, 18000, "White");

        System.out.println("Sedan sale price: $" + sedan.getSalePrice());
        System.out.println("Ford1 sale price: $" + ford1.getSalePrice());
        System.out.println("Ford2 sale price: $" + ford2.getSalePrice());
        System.out.println("Car sale price: $" + car.getSalePrice());
    }
}

