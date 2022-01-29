package com.example.lecture18.services;

import com.example.lecture18.model.Person;
import com.example.lecture18.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TransferServiceTest {

    @MockBean
    private PersonRepository personRepository;

    @Autowired
    private TransferService transferService;

    @Test
    void transfer() {
        Person sender= new Person();
        sender.setName("Sender");
        sender.setId(1L);
        sender.setMoney(100);

        Person receiver = new Person();
        receiver.setName("receiver");
        receiver.setId(2L);
        receiver.setMoney(100);

        when(personRepository.findById(1L)).thenReturn(Optional.of(sender));
        when(personRepository.findById(2L)).thenReturn(Optional.of(receiver));

        System.out.println((personRepository.findById(1L).get()));

        transferService.transfer(1L,2L,20.0);

        verify(personRepository).changeMoney(1L,80);
        verify(personRepository).changeMoney(2L,120);

    }

    @Test
    void transferAllSenderMoney() {
        Person sender= new Person();
        sender.setName("Sender");
        sender.setId(1L);
        sender.setMoney(100);

        Person receiver = new Person();
        receiver.setName("receiver");
        receiver.setId(2L);
        receiver.setMoney(100);

        when(personRepository.findById(1L)).thenReturn(Optional.of(sender));
        when(personRepository.findById(2L)).thenReturn(Optional.of(receiver));

        assertThrows(RuntimeException.class, () -> transferService.transfer(1L,2L,120.0));
    }
}