package com.example.lecture22.service;

import com.example.lecture22.exception.UserDoesNotExist;
import com.example.lecture22.exception.WrongArguments;
import com.example.lecture22.model.User;
import com.example.lecture22.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    /**
     * Check for user with this id and if not found returns an error
     * @param id of the user
     * @return User object that we found
     */
    public User findById(Long id){
        if(id.equals(null) || id <= 0L ){
            throw new WrongArguments();
        } else {
            Optional<User> foundUser = userRepository.findById(id);
            if(foundUser.isPresent()){
                return foundUser.get();
            }else {
                throw new UserDoesNotExist();
            }
        }
    }

    /**
     * Saves user in the DB. Checks all properties for null or blank values
     * @param user object that we want to save
     * @return object with id from DB
     */
    public User save(User user){
        if(user.getName() == null || user.getName().isBlank()){
            throw new WrongArguments();
        }
        if(user.getAddress() == null || user.getAddress().isBlank()){
            throw new WrongArguments();
        }
        return userRepository.save(user);
    }

    public User update (User user, Long id){
        User foundUser= findById(id);
        foundUser.setAddress(user.getAddress());
        foundUser.setName(user.getName());
        userRepository.save(foundUser);
        return foundUser;

    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }



}
