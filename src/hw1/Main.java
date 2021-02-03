package hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Task1---");
        Integer[] array = {0,1,2,3,4,5,6,7,8,9};
        reverse2(array, 1, 0);
        System.out.println(Arrays.toString(array));

        System.out.println("---Task2---");
        ArrayList<Integer> arrayList = arrToArrList(array);
        System.out.println(arrayList);

        System.out.println("---Task3---");
        Orange orange = new Orange();
        Apple apple = new Apple();

        orange.setWeight(1.5f);
        apple.setWeight(1.0f);

        Box<Orange> boxOrange = new Box<>(orange);
        Box<Apple> boxApple = new Box<>(apple);
        Box<Orange> boxOrange2 = new Box<>(null);
        Box<Apple> boxApple2 = new Box<>(null);

        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);

        System.out.println("Weight of one orange: " + orange.getWeight());
        System.out.println("Weight of one apple: " + apple.getWeight());
        System.out.println("Weght of box with oranges: " + boxOrange.getWeightInBox());
        System.out.println("Weght of box with apples: " + boxApple.getWeightInBox());
        System.out.println("Are the weights equal? " + boxOrange.compareBoxes(boxApple));
        //Pour не работает
        boxApple.pour(boxApple2);
        boxOrange.pour(boxOrange2);
        System.out.println("boxApple = " + boxApple.getWeightInBox());
        System.out.println("boxApple2 = " + boxApple2.getWeightInBox());
        System.out.println("boxOrange = " + boxOrange.getWeightInBox());
        System.out.println("boxOrange2 = " + boxOrange2.getWeightInBox());

    }

    public static <T> void reverse2(T[] arr, int one, int two){
        if(one < 0 || (one > arr.length - 1) || two < 0 || (two > arr.length - 1)){
            return ;
        }
        T temp;
        temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
    public static <T> ArrayList<T> arrToArrList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
