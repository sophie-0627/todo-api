package dev.sophia.test.controller

import dev.sophia.test.Todo
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/todo")
class TodoController {
    private val todoList = mutableListOf(
        Todo(0,"test1","this is a test"),
        Todo(1,"test2","this is a test"),
    )

    @GetMapping
    fun GetAll(): List<Todo> = todoList

    @PostMapping
    fun AddItem(@RequestBody todo: Todo): String {
        todoList.add(todo)
        return "加入成功"
    }

    @DeleteMapping("/{id}")
    fun deleteItem(@PathVariable("id") id: Int): String {
        todoList.removeAt(id)
        return "刪除成功"
    }
}
