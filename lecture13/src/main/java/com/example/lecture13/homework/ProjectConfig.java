//package com.example.lecture13.homework;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.ArrayList;
//
//@Configuration
//public class ProjectConfig {
//
//    @Bean("Ben")
//    Employee getBen() {
//        Employee ben = new Employee();
//        ben.setName("Ben");
//        ben.setSalary(5000);
//        return ben;
//    }
//
//    @Bean("Jack")
//    Employee getJack() {
//        Employee jack = new Employee();
//        jack.setName("Jack");
//        jack.setSalary(4000);
//        return jack;
//    }
//
//
//    @Bean("Firm")
//    Firm firm() {
//        Firm firm = new Firm();
//        firm.setName("Ali Express");
//        ArrayList<Employee> list = new ArrayList();
//        list.add(getBen());
//        list.add(getJack());
//        firm.setEmployeeArrayList(list);
//        return firm;
//    }
//}
