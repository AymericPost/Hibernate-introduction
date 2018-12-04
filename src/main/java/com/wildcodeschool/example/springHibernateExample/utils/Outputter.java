package com.wildcodeschool.example.springHibernateExample.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.example.springHibernateExample.entities.Chocobo;
import com.wildcodeschool.example.springHibernateExample.repositories.ChocoboDAO;


@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("Rancher");

    @Autowired
    private ChocoboDAO dao;

    @Override
    public void run(String... args) throws Exception {
    	
    	 LOG.info("");
    	 LOG.info("");
    	
    	LOG.info(":+:+:  .-*'*-. Début de la course de chocobos ! .-*'*-. :+:+:");
    	
    	 LOG.info("");
    	 LOG.info("");

    	LOG.info("Chocobos sur le terrain : " + dao.count());
    	 LOG.info("");
    	
    	LOG.info("Entrée des chocobos : ");
    	Chocobo c1 = new Chocobo("Plume fringante", 68, 9, 293);
    	dao.save(c1);
    	LOG.info( c1 + " en piste !");
    	Chocobo c2 = new Chocobo("Krakka doré",  56, 11, 329);
    	dao.save(c2);
    	LOG.info(c2 + " en piste !");
    	Chocobo c3 = new Chocobo("Vive-serre", 77, 10, 343);
    	dao.save(c3);
    	LOG.info(c3 + " en piste !");
    	Chocobo c4 = new Chocobo("Dodo Sénile", 38, 18, 416);
    	dao.save(c4);
    	LOG.info( c4 + " en piste !");
    	
    	LOG.info("Liste des coureurs :");
    	for(Chocobo racers : dao.findAll()) {
            LOG.info( racers.toString());
        };
        
        LOG.info("");
        LOG.info("");
    	
    	Chocobo favorite = dao.findById(3L).get();
    	LOG.info("Le gagnant est le N°" + favorite.getId() + ".");
        LOG.info("Son nom est " + favorite.getName() + ".");
        LOG.info("Il court à  " + favorite.getSpeed() + "km/h.");
        LOG.info("Il a " + favorite.getAge() + " ans,");
        LOG.info("Et pése " + favorite.getWeight() + "kg.");
        
        LOG.info("");
        LOG.info("");
        
        LOG.info("Krakka doré a dépassé son record de vitesse : il passe de 56km/h à 61km/h.");
        LOG.info(c2.toString());
        c2.setSpeed(61);
        dao.save(c2);
        LOG.info(c2.toString());
        
        LOG.info("");
        LOG.info("");
        
        LOG.info("C'était la dernière course du N°" + c4.getId() + ". Bonne retraite, " + c4.getName() + " !");
        dao.deleteById(4L);
        
        LOG.info("Liste des coureurs de la prochaine course :");
    	for(Chocobo racers : dao.findAll()) {
            LOG.info(racers.toString());
        };
        
    }    
}