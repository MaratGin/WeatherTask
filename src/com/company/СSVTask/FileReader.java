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

        int k=0;
        int f=0;

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd'T'HHmm");

        for (String line:fileLines) {

            splitetr= line.split(",");

            if (isWeather(splitetr)){


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
                list.add(f,csv);
               f=f+1;

            }

        }
      return list;
    }

    public boolean isWeather(String[] line){
        String first=line[0];
        boolean answer;
        char a=first.charAt(0);
        if (a=='0'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'){
            answer=true;
        } else {
            answer=false;
        }
        return answer;
    }


}
