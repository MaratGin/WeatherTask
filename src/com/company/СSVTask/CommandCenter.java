package com.company.СSVTask;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class CommandCenter {


    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
       // String path="H:\\Загрузки\\javatest1-master\\src\\com\\company\\Graph\\Graph\\src\\com\\company\\СSVTask\\dataexport_20210320T064822.csv";
         // String path="/Users/user/IdeaProjects/Graph56/Graph/src/com/company/СSVTask/dataexport_20210320T064822.csv";
        System.out.println("Введите путь к файлу ");
        String path= scanner.next();


        FileReader fileReader= new FileReader();
        FileWriter fileWriter= new FileWriter();

        List<CSV> list=fileReader.Parsing(path);

        fileWriter.WriteFile(path,list);



    }
}
