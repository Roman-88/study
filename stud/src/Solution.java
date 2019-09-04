public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        if(o instanceof Cow){
            return "Корова";
        }
        if(o instanceof Dog){
            return "Собака";
        }
        if(o instanceof Whale){
            return "Кит";
        }
        if(o instanceof Pig){
            return "Неизвестное животное";
        } else return null;


    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}