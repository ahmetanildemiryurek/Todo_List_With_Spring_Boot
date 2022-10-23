package com.ahmetAnilDemiryurek.toDoApp.Request;

public class TodoListSaveRequest
{
    String day;
    String content;
    boolean done;

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