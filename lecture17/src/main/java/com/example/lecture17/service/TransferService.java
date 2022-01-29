package com.example.lecture17.service;

import com.example.lecture17.model.Person;
import com.example.lecture17.repositories.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class TransferService {

    private final PersonRepository personRepository;


    public TransferService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void transfer(Long idSender, Long idReceiver, Double money) {
        Person sender = personRepository.findById(idSender).get();
        Person receiver = personRepository.findById(idReceiver).get();
        personRepository.changeMoney(idSender,sender.getMoney()-money);
        personRepository.changeMoney(idReceiver,sender.getMoney()-money);
    }
}
