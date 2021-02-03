package hw1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> section;
    private float weightInBox = 0;
    public Box(T fruit){
        this.section = new ArrayList<>();
    }

    public float getWeightInBox() {
        return weightInBox;
    }

    public void addFruit(T fruit) {
        this.section.add(fruit);
        this.weightInBox += fruit.getWeight();
    }

    public boolean compareBoxes(Box box){
        return Math.abs(this.getWeightInBox() - box.getWeightInBox()) < 0.0001;
    }

    public void pour(Box<? super T> box){
        box.section.addAll(this.section);
        this.section.clear();
    }

}
