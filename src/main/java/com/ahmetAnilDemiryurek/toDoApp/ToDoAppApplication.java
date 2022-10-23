package com.ahmetAnilDemiryurek.toDoApp;

import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.PostConstruct;
import com.ahmetAnilDemiryurek.toDoApp.TodoList.TodoList;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoAppApplication
{
    public static List<TodoList> daysList;

    @PostConstruct
    public void fillToDoList() {
        final TodoList day1 = new TodoList();
        day1.setId(1);
        day1.setDay("Pazartesi");
        day1.setContent(" Java - API Calisilacak ! ");
        day1.setDone(true);
        final TodoList day2 = new TodoList();
        day2.setId(2);
        day2.setDay("Sali");
        day2.setContent("Biyomedikal Muhendisligi proje icin Python Ogrenilecek");
        day2.setDone(true);
        final TodoList day3 = new TodoList();
        day3.setId(3);
        day3.setDay("Carsamba");
        day3.setContent("al\u0131\u015fveri\u015fe \u00e7\u0131kma");
        day3.setDone(false);
        final TodoList day4 = new TodoList();
        day4.setId(3);
        day4.setDay("Persembe");
        day4.setContent("al\u0131\u015fveri\u015fe \u00e7\u0131kma");
        day4.setDone(false);
        final TodoList day5 = new TodoList();
        day5.setId(3);
        day5.setDay("Cuma");
        day5.setContent("al\u0131\u015fveri\u015fe \u00e7\u0131kma");
        day5.setDone(false);
        final TodoList day6 = new TodoList();
        day6.setId(3);
        day6.setDay("Cumartesi");
        day6.setContent("al\u0131\u015fveri\u015fe \u00e7\u0131kma");
        day6.setDone(false);
        final TodoList day7 = new TodoList();
        day7.setId(3);
        day7.setDay("Pazar");
        day7.setContent("al\u0131\u015fveri\u015fe \u00e7\u0131kma");
        day7.setDone(false);
        ToDoAppApplication.daysList.add(day1);
        ToDoAppApplication.daysList.add(day2);
        ToDoAppApplication.daysList.add(day3);
        ToDoAppApplication.daysList.add(day4);
        ToDoAppApplication.daysList.add(day5);
        ToDoAppApplication.daysList.add(day6);
        ToDoAppApplication.daysList.add(day7);
    }

    static {
        ToDoAppApplication.daysList = new CopyOnWriteArrayList<TodoList>();
    }
}
