import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApples {
    public static void main (String[] args){
        List<Apple> inventory = Arrays.asList(
                new Apple("green"),
                new Apple("light green"),
                new Apple("red"));
        inventory.add(new Apple("green"));
        List<Apple> resultApples = filterGreenApples(inventory);
        System.out.println(resultApples);
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if ("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    @Data
    public static class Apple {
        private String color = "";

        public Apple(String color){
            this.color = color;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public String toString(){
            return "Apple:" + color;
        }
    }
}
