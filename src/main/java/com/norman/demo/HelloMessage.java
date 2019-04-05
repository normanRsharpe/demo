package com.norman.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

@RestController
public class HelloMessage {

    @RequestMapping("/")
    public String index(){
        ArrayList<Acronym> acronymList = new ArrayList<Acronym>();
        Acronym oneAcronym = Acronym.SetAcronym("AAA", "Something...");
        Acronym twoAcronym = Acronym.SetAcronym("BBB", "Better Badder, Blah");
        Acronym threeAcronym = Acronym.SetAcronym("CCC", "IDK");

        acronymList.add(oneAcronym);
        acronymList.add(twoAcronym);
        acronymList.add(threeAcronym);


        Finder newFinder = new Finder();



        return newFinder.findAcronym("BBB",acronymList);
    }
}
