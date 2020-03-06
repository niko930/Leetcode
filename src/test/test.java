package test;
public class test {

    public static void main(String[] args) {


        Plate<? extends Fruit> plate = new Plate<>(new Apple());


        System.out.println(plate.getItem());

    }
}
