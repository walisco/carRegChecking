package com.carcheck.tests.helper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
    private static final Logger LOG = LoggerFactory.getLogger(Util.class);

    public List<String> getRegData() throws IOException {
        Scanner scanner = new Scanner(new File("src/main/resources/config/car_output.txt"));
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> reg = new ArrayList<String>();
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        scanner.close();
        int headerSize = list.get(0).split(",").length;
        for(int i=1; i<list.size(); i++) {
            reg.add(list.get(i).split(",")[0]);
        }
        return reg;
    }
    public List<String> getMakeData() throws IOException {
        Scanner scanner = new Scanner(new File("src/main/resources/config/car_output.txt"));
        ArrayList<String> list = new ArrayList<String>();

        ArrayList<String> make = new ArrayList<String>();
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        scanner.close();
        int headerSize = list.get(0).split(",").length;

        for(int i=1; i<list.size(); i++) {
            make.add(list.get(i).split(",")[1]);

        }
        return make;
    }

    public List<String> getColorData() throws IOException {
        Scanner scanner = new Scanner(new File("src/main/resources/config/car_output.txt"));
        ArrayList<String> list = new ArrayList<String>();

        ArrayList<String> color = new ArrayList<String>();
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        scanner.close();
        int headerSize = list.get(0).split(",").length;

        for(int i=1; i<list.size(); i++) {
            color.add(list.get(i).split(",")[3]);

        }
        return color;
    }

    public List<String> getYearData() throws IOException {
        Scanner scanner = new Scanner(new File("src/main/resources/config/car_output.txt"));
        ArrayList<String> list = new ArrayList<String>();

        ArrayList<String> year = new ArrayList<String>();
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        scanner.close();
        int headerSize = list.get(0).split(",").length;

        for(int i=1; i<list.size(); i++) {
            year.add(list.get(i).split(",")[4]);

        }
        return year;
    }

    public List<String> getModelData() throws IOException {
        Scanner scanner = new Scanner(new File("src/main/resources/config/car_output.txt"));
        ArrayList<String> list = new ArrayList<String>();

        ArrayList<String> model = new ArrayList<String>();
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        scanner.close();
        int headerSize = list.get(0).split(",").length;

        for(int i=1; i<list.size(); i++) {
            model.add(list.get(i).split(",")[2]);

        }
        return model;
    }




}


