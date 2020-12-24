package com.company;


 public class Main{
     public static void main(String[]args) {


         System.out.println(getValue(34,15));
         System.out.println(getValue(25,1));
         System.out.println(getValue(10,35));
         System.out.println(getValue(57,-5));
         System.out.println(getValue(123,-23));



  }


   public static String getValue (int age,int temperature) {
       if (20<age && age<45 && 30>temperature && temperature>-20){
               System.out.printf("age:" + age + "  temperature:" + temperature);
           return ("  Можно идти гулять");
       }
       else if (age<20 && 28>temperature && temperature>0){
           System.out.printf("age:" + age + "  temp:" + temperature);
           return ("  Можно идти гулять");
       }else if(age>45 && 25>temperature && temperature>-10){
           System.out.printf("age:" + age + "  temp:" + temperature);
           return ("  Можно идти гулять");
       }else{
           System.out.printf("age:" + age + "  temp:" + temperature);
           return ("  Остовайтесь дома");
       }



   }

 }

