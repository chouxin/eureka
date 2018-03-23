package com.example.democlent1.Controller;

import com.example.democlent1.Entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @GetMapping("{id}")
    public User findUserById(@PathVariable Long id ){
        User u = new User();
        u.setId(id);
        u.setAge(100);
        u.setUsername("demo-client1--长寿人");
        return u;
    }
    @GetMapping("/findUserByIdAndName/{id}/{name}")
    public User findUserByIdAndName(@PathVariable Long id, @PathVariable String  name ){
        User u = new User();
        u.setId(id);
        u.setAge(110);
        u.setUsername("demo-client1--不死人： "+ name);
        return u;
    }
}
