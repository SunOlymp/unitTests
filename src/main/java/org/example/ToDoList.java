package org.example;

import java.util.ArrayList;

public class ToDoList {
    ArrayList<String> List = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        List.add(todo);
        System.out.println("Добавлено дело " + "\"" + todo + "\"");
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (List != null && index >= 0 && index < List.size()) {
            List.add(index, todo);
            System.out.println("Добавлено дело " + "\"" + todo + "\"");
        } else {
            List.add(todo);
            System.out.println("Добавлено дело " + "\"" + todo + "\"");
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (List != null && index >= 0 && index < List.size()) {
            System.out.println("Дело " + "\"" + List.get(index) + "\"" + " заменено на " + "\"" + todo + "\"");
            List.set(index, todo);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (List != null && index >= 0 && index < List.size()) {
            System.out.println("Дело " + "\"" + List.get(index) + "\"" + " удалено");
            List.remove(index);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        ArrayList<String> ist = new ArrayList<>();
        for (String i : ist) {
            List.add(i);
        }
        return List;
    }
}

