package com.ahmetAnilDemiryurek.toDoApp.Service;

import java.util.Random;
import com.ahmetAnilDemiryurek.toDoApp.Request.TodoListSaveRequest;
import java.util.Iterator;
import java.util.List;
import com.ahmetAnilDemiryurek.toDoApp.ToDoAppApplication;
import com.ahmetAnilDemiryurek.toDoApp.TodoList.TodoList;
import org.springframework.stereotype.Service;

@Service
public class TodoListService
{
    public static TodoList getTodoList(final int listId) {
        final List<TodoList> List = (List<TodoList>)ToDoAppApplication.daysList;
        for (final TodoList value : List) {
            if (value.getId() == listId) {
                return value;
            }
        }
        return null;
    }

    public boolean saveList(final TodoListSaveRequest requestBody) {
        final String listName = requestBody.getDay();
        final TodoList list = new TodoList();
        list.setDay(listName);
        final int id = this.getId();
        list.setId(id);
        final List<TodoList> List = (List<TodoList>)ToDoAppApplication.daysList;
        List.add(list);
        return true;
    }

    private int getId() {
        final Random random = new Random();
        final int id = random.nextInt(1000);
        return id;
    }

    public boolean deleteList(final int listeId) {
        final List<TodoList> List = (List<TodoList>)ToDoAppApplication.daysList;
        for (final TodoList deger : List) {
            if (deger.getId() == listeId) {
                List.remove(deger);
            }
        }
        return true;
    }
}