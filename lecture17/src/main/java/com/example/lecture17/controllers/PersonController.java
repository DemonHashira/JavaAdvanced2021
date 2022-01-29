package com.example.lecture17.controllers;

import com.example.lecture17.model.Person;
import com.example.lecture17.repositories.PersonRepository;
import com.example.lecture17.service.TransferService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private final PersonRepository personRepository;
    private final TransferService transferService;

    public PersonController(PersonRepository personRepository, TransferService transferService) {
        this.personRepository = personRepository;
        this.transferService = transferService;
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        person.setId(null);
       return personRepository.save(person);
    }

    @GetMapping("/person")
    public Iterable<Person> listAll(@RequestParam(required = false) String name) {
        if (name != null) {
            return personRepository.findByName(name);
        }
        return personRepository.findAll();
    }

    @GetMapping("/person/{id}")
    public Person getId(@PathVariable Long id) {
        return personRepository.findById(id).get();
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable Long id) {
         personRepository.deleteById(id);
    }

    @GetMapping("/personsOver20")
    public Iterable<Person> listAllOverAge() {
        return personRepository.findByAgeGreaterThan(20L);
    }

    @GetMapping("/personsOverAge")
    public Iterable<Person> listAllOverAge2(@PathVariable Long id) {
        return personRepository.findByAgeGreaterThan(id);
    }

    @PutMapping("/person/{id}")
    public void updateMoney(@PathVariable Long id, @RequestParam(required = true) Double money) {
        personRepository.changeMoney(id,money);
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestParam Long idSender,
                              @RequestParam Long idReceiver,
                              @RequestParam Double money) {

        transferService.transfer(idSender,idReceiver,money);
    }
}
