import java.util.*;

public class Main {


    public static void main(String[] args) {
//        Car carOne = new Car("Lada", 6663);
//        Car carTwo = new Car("Lada", 6663);
////        carTwo = carOne;
////        carTwo.setNumber(665);
////        System.out.println(carOne.getNumber());
////        System.out.println(carOne.equals(carTwo));
////        String brand = "Lada";
//        System.out.println(carOne.equals(carTwo));
//        System.out.println(carOne.hashCode());
//        System.out.println(carTwo.hashCode());
//    CarCollection cars = new CarArrayList();
//    for (int i = 0; i < 10; i++ ) {
//        cars.add(new Car("BRand " + i, i));
//    }
//        for (Car car : cars) {
//            System.out.println(car.getBrand() + " " + car.getNumber());
//        }
        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < 100; i++) {
            numbers.add((int)(Math.random() * 10));
        }
        for (int number : numbers) {
            System.out.println(number);
        }

//        Set<Car> cars = new TreeSet<>();
//        for (int i = 0; i < 12; i++) {
//            cars.add(new Car("Brand " + i, i));
//        }
//        for (Car car : cars) {
//            System.out.println(car);
//        }





    }
}
