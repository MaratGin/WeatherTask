package com.company.СSVTask;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileReader {


    public static void main(String[] args) throws Exception {

  }

    public   List Parsing(String path) throws IOException, ParseException {
        List<CSV> list= new ArrayList<CSV>();
        List<String> fileLines = Files.readAllLines(Paths.get(path));

        String[] splitetr = new String[fileLines.size()];
        //10 незначащих строк
        int k=0;
        int f=0;

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd'T'HHmm");

        for (String line:fileLines) {
            if (k>10){

                splitetr= line.split(",");
//                for (int i = 0; i < splitetr.length ; i++) {
//                    System.out.print(splitetr[i]+ ", ");
//                }
//                System.out.println();

                Date date=format.parse(splitetr[0]);
                Double temperature=Double.parseDouble(splitetr[1]);
                Double humidity=Double.parseDouble(splitetr[2]);
                Double windSpeed=Double.parseDouble(splitetr[3]);
                Double  direction=Double.parseDouble(splitetr[4]);
                      CSV csv= new CSV(date,temperature,humidity,windSpeed,direction);
//                csv.setDate(date);
//                csv.setTemperature(temperature);
//                csv.setHumidity(humidity);
//                csv.setSpeed(windSpeed);
//                csv.setDirection(direction);
                list.add(f,csv);
               f=f+1;

            }


            k++;
        }
      return list;
    }

//    public String[] units() throws Exception {
//        String path="H:\\Загрузки\\javatest1-master\\src\\com\\company\\Graph\\Graph\\src\\com\\company\\СSVTask\\dataexport_20210320T064822.csv";
//        List<String> fileLines = Files.readAllLines(Paths.get(path));
//        String[] units=fileLines.get(4).split(",");
//
//
//        return units;
//    }

}
