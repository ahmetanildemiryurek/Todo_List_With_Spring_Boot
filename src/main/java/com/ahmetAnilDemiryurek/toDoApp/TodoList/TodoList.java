package com.ahmetAnilDemiryurek.toDoApp.TodoList;

public class TodoList
{
    int id;
    String day;
    String content;
    boolean done;

    public TodoList() {
    }

    public TodoList(final String day, final int id, final String content, final boolean done) {
        this.id = id;
        this.day = day;
        this.content = content;
        this.done = done;
    }

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(final String day) {
        this.day = day;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public boolean isDone() {
        return this.done;
    }

    public void setDone(final boolean done) {
        this.done = done;
    }
}