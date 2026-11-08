package org.example;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

            public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Введите ваш логин");
                String login = scan.nextLine();

                // Создаём двух игроков
                Player player1 = new Player("Dasha");
                Player player2 = new Player("Alex");

                // Проверяем начальный опыт
                System.out.println("Начальный опыт:");
                System.out.println(player1.getExperience());
                System.out.println(player2.getExperience());

                // Добавляем опыт
                player1.addExperience(100);
                player2.addExperience(50);

                // Проверяем новый опыт
                System.out.println("После начисления опыта:");
                System.out.println(player1.getExperience());
                System.out.println(player2.getExperience());

                // Проверяем защиту от отрицательного опыта
                player1.addExperience(-200);

                System.out.println("После попытки отнять опыт:");
                System.out.println(player1.getExperience());

                System.out.println(player1.getLogin());
            }
        }

