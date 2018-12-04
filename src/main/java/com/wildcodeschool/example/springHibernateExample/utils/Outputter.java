package com.wildcodeschool.example.springHibernateExample.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.example.springHibernateExample.entities.User;
import com.wildcodeschool.example.springHibernateExample.repositories.UserDAO;


@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("");

    @Autowired
    

    @Override
    public void run(String... args) throws Exception {

       
        };
    }    
}