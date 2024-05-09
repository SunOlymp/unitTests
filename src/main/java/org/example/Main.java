package org.example;
import java.util.Scanner;

public class Main {

    private static ToDoList todoList = new ToDoList();

    public static void main(String[] args) {

        while (true) {

            System.out.println("Введите операцию: \n LIST - вывод списка дел \n ADD - добавляет дело " +
                    "\n EDIT - заменяет дело" + "\n DELETE - удаляет дело \n END - завершает программу");
            String input = new Scanner(System.in).nextLine(); //ввод с консоли
            String[] inputMassive = input.split(" "); //массив данных
            String command = inputMassive[0];  //команда
            String regex = "[0-9]"; //шаблон проверки

            if ("END".equals(command)) {
                break;
            } else {
                switch (command) {
                    case "LIST":
                        for (int i = 0; i < todoList.getTodos().size(); i++) {
                            System.out.println(i + " - " + todoList.getTodos().get(i));
                        }
                        break;
                    case "ADD":
                        String addToDo = inputMassive[1];
                        if (addToDo.matches(regex)) {
                            int index = Integer.parseInt(inputMassive[1]);
                            String word = "";
                            for (int i = 2; i < inputMassive.length; i++) {
                                word += inputMassive[i];
                                if (i < inputMassive.length - 1) {
                                    word += " ";
                                }
                            }
                            todoList.add(index, word);
                        } else {
                            String word = "";
                            for (int i = 1; i < inputMassive.length; i++) {
                                word += inputMassive[i];
                                if (i < inputMassive.length - 1) {
                                    word += " ";
                                }
                            }
                            todoList.add(word);
                        }
                        break;
                    case "EDIT":
                        String editToDo = inputMassive[1];
                        if (editToDo.matches(regex)) {
                            int index = Integer.parseInt(inputMassive[1]);
                            String word = "";
                            for (int i = 2; i < inputMassive.length; i++) {
                                word += inputMassive[i];
                                if (i < inputMassive.length - 1) {
                                    word += " ";
                                }
                            }
                            todoList.edit(index, word);
                        }
                        break;
                    case "DELETE":
                        String deleteToDo = inputMassive[1];
                        if (deleteToDo.matches(regex)) {
                            int index = Integer.parseInt(inputMassive[1]);
                            todoList.delete(index);
                        }
                        break;
                }
            }
        }
    }
}

