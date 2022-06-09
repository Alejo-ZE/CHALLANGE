package com.quizgame;

import com.quizgame.category.Category;
import com.quizgame.config.Config;
import com.quizgame.question.Question;
import java.util.Map;
import java.util.Scanner;

public class Game {

    private static int pointsEarned = 0;

    public static void runGame() {

        Map<Integer, Category> categories = Config.getQuestions();

        int level = 1;

        while (level <= categories.size()) {
            Category category = categories.get(level);
            Question question = category.randomQuestion();
            System.out.println("**************************");
            System.out.println("**************************");
            System.out.println("Ronda " + level + "!!!\n");

            if(!processRequest(question, category)){
                break;
            }

            level++;
        }

        System.out.println("Ganaste " + pointsEarned + " puntos!" );
    }

    private static boolean out(String work) {
        return work.equalsIgnoreCase("salir");
    }

    private static boolean processRequest(Question question, Category category) {
        Scanner sc = new Scanner(System.in);
        Integer correct = question.printQuestion();
        boolean nextRequest = true;

        while (true) {
            try {
                String request = sc.next();
                if(out(request)) {
                    nextRequest = false;
                    break;
                }

                Integer answer = Integer.parseInt(request);

                if(answer > 0 && answer <= question.getAnswerList().size()) {
                    if(answer == correct) {
                        System.out.println("Felicidades! Ganaste " + category.getPoints() + " puntos!\n\n");
                        pointsEarned += category.getPoints();
                    }else {
                        System.out.println("Respuesta Incorrecta. Buena suerte para la próxima!");
                        System.out.println("Game Over :(\n\n");
                        nextRequest = false;
                    }
                    break;
                }

                System.out.println("\nSi desea salir, escriba 'salir'.");
                System.out.print("Respuesta en el rango invalido. Intente nuevamente: ");
            } catch (Exception e) {
                System.out.println("\nSi desea salir, escriba 'salir'.");
                System.out.print("Solo se aceptan numeros para seleccionar la respuesta correcta. Intente nuevamente: ");
            }
        }

        return nextRequest;
    }
}
