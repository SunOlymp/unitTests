package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void add() {

    }

    @Test
    void testAdd() {
    }

    @Test
    void edit() {
    }

    @Test
    void delete() { //Проверить, удаляется ли дело из списка
        //given
        ArrayList<String> List = new ArrayList<>();
        int listLenth = List.size();


        //when
        List.remove(listLenth-1);

        //then

    }

    @Test
    void getTodos() {
    }
}