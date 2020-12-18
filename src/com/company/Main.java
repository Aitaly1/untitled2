package com.company;



public class Main {

    public static void main(String[] args) {

//        String color = "Красный";
//        switch (color) {
//            case "Красный":
//                System.out.println();
//                break;
//
//        }
//
//        int num = 10;
//        int age = 20;
//        if (num > 5 && age > 18) {
//            System.out.println("Можешь выходить на улицу");
//        }
//
//        if (num == 10 || age > 18) { //оператор или
//            System.out.println("Success!");
//        }
        print();
        printOurWord("Привет");
        System.out.println("Сумма двух чисел: " + getSumOfValues(5,2));
//        System.out.println("fhgijh: " + getSumOfValues(35,43));

    }
    public static void print(){
        System.out.println("Hello world!");
    }


    public static void printOurWord(String word){
        System.out.println("Ваше слово: " + word);
        word = "Hello";
    }

    public static int getSumOfValues(int num1, int num2){
        return num1 + num2;
    }

}
