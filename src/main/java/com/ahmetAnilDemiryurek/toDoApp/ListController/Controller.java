package com.ahmetAnilDemiryurek.toDoApp.ListController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.ahmetAnilDemiryurek.toDoApp.Request.TodoListSaveRequest;
import org.springframework.web.bind.annotation.GetMapping;
import com.ahmetAnilDemiryurek.toDoApp.TodoList.TodoList;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.ahmetAnilDemiryurek.toDoApp.Service.TodoListService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/list" })
public class Controller
{
    @Autowired
    TodoListService listService;

    @GetMapping({ "/getList" })
    public TodoList getTodoList(@RequestParam(value = "listId", required = false) final int listId) {
        return TodoListService.getTodoList(listId);
    }

    @PostMapping({ "/saveList" })
    public boolean saveToDoList(@RequestBody final TodoListSaveRequest listSaveRequestBody) {
        return this.listService.saveList(listSaveRequestBody);
    }

    @DeleteMapping({ "/deleteList" })
    public boolean updateToDoList(@RequestParam final int listeId) {
        return this.listService.deleteList(listeId);
    }
}