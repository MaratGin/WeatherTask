package com.company.СSVTask;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class CommandCenter {


    public static void main(String[] args) throws Exception {
       // String path="H:\\Загрузки\\javatest1-master\\src\\com\\company\\Graph\\Graph\\src\\com\\company\\СSVTask\\dataexport_20210320T064822.csv";
          String path="/Users/user/IdeaProjects/Graph56/Graph/src/com/company/СSVTask/dataexport_20210320T064822.csv";

        // TODO: ПОМЕЕНЯТЬ ПУТЬ ДЛЯ МАКА


        FileReader fileReader= new FileReader();
        FileWriter fileWriter= new FileWriter();

        List<CSV> list=fileReader.Parsing(path);

        fileWriter.WriteFile(path,list);



    }
}
