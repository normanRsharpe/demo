package com.norman.demo;

import java.util.ArrayList;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Finder {

    public Finder(){

    }

    public static String findAcronym(String requestedAcronym, ArrayList<Acronym> searchableList){
       // String acronymString = requestedAcronym.acronymName;

        Reader in = new FileReader("/Users/mac/Spring_Boot_Development/demo/src/main/java/com/norman/demo/acronyms-list.csv");
        Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(in);
        for (CSVRecord record : records) {
            String columnOne = record.get(0);
            String columnTwo = record.get(1);
        }


        for(Acronym a : searchableList) {
            if (requestedAcronym == a.acronymName){
                return a.acronymDefinition;
            }
        }//for loop


        return "Acronym not found!";
    }
}
