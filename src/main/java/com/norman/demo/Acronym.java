package com.norman.demo;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.*;

public class Acronym {
    String acronymName;
    String acronymDefinition;

    private Acronym(){}
    public static Acronym SetAcronym (String name, String definition) {
        Acronym newAcronym = new Acronym();
        newAcronym.acronymName = name;
        newAcronym.acronymDefinition = definition;




        return newAcronym;
    }
}
