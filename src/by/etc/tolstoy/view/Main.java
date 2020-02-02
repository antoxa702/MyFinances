package by.etc.tolstoy.view;

import by.etc.tolstoy.bean.Count;
import by.etc.tolstoy.bean.User;
import by.etc.tolstoy.bean.exception.NullCountException;
import by.etc.tolstoy.controller.Controller;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Home on 20.01.2020.
 */
public class Main {
    public static void main(String[] args) {
//        Реализацию слоя View (Вид) рассматривать нет необходимости, т.к. она может быть
//        предназначена и для консольных и для приложения с графическим интерфейсом.
//        Основное правило – все общение Вида c другими частями приложения идет через
//        экземпляр класса Controller (и его так же не надо создавать во множественном
//                количестве). Вид формирует запрос – строку определенно вида, передает ее контроллеру
//        и ожидает ответ. Получив ответ – обрабатывает его в соответствии со своими задачами.
//
//        Написать комманды

//        User user  = new User("antoxa_702", "ImTheBest22031988");
//        System.out.println(user);
//
//        Count count1 = new Count("VISA3608", 123.04);
//        Count count2 = new Count("MASTER1808", 25.07);
//        Count count3 = new Count("BELCARD6657", 1147.22);
//
//
//        System.out.print(count1);
//        System.out.print(count2);
//        System.out.print(count3);
//
//
//        try {
//            user.addCount(count1);
//            user.addCount(count2);
//            user.addCount(count3);
//        } catch (NullCountException e) {
//            System.out.println("Something happened");
//        }
//
//
//        System.out.println(user);

        User user = null;
        Count count = null;

        String request = "sign_in antoxa_702 ImTheBest22031988";

        Controller controller = new Controller();
        System.out.println(controller.executeTask(request));

        if (controller.executeTask(request).equals("Welcome")){
            String[] requestArray = request.split("\\s+");
            user = new User(requestArray[1].trim(), requestArray[2].trim());
            System.out.println("You've signed in");
        } else {
            System.out.println("SingIn FAIL");
        }

        System.out.println(user);


        String request1 = "add_count VISA123456 125.36";

        //

        if (controller.executeTask(request1).equals("You've added count VISA123456 successfully")){
            String[] requestArray = request1.split("\\s+");
            count = new Count(requestArray[1].trim(), Double.parseDouble(requestArray[2]));
            System.out.println(count);
            try {
                user.addCount(count);
            } catch (NullCountException e) {
                e.printStackTrace();
            }
            System.out.println("You've added a count");
        } else {
            System.out.println("Count FAIL");
        }
        System.out.println(user);

        String request2 = "add_transaction VISA123456 health -25.3";

        //

        if (controller.executeTask(request2).equals("You've added transaction on VISA123456 type: health money: -25.3 successfully")){
            System.out.println("Transaction created successfully");
        } else {
            System.out.println("Transaction FAIL");
        }
        System.out.println(user);

//        User user = null;
//
//        String request = "registration antoxa_702 ImTheBest22031988";
//
//        Controller controller = new Controller();
//        System.out.println(controller.executeTask(request));

//        if (controller.executeTask(request).equals("Welcome")){
//            String[] requestArray = request.split("\\s+");
//            user = new User(requestArray[1].trim(), requestArray[2].trim());
//            System.out.println("You've signed in");
//        } else {
//            System.out.println("FAIL");
//        }
//
//        System.out.println(user);


    }
}
