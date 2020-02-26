package br.ufpb.sisalfa.APIRest.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.ufpb.sisalfa.APIRest.Repositories.UserRepository;
import br.ufpb.sisalfa.APIRest.entity.User;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        this.userRepository.save(user);
        return user;
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public User update(@RequestBody User user) {
        this.userRepository.save(user);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        this.userRepository.deleteById(id);
    }

}
