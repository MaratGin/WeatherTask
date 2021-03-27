package com.company.СSVTask;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

public class FileWriter {

    public void WriteFile(String path, List <CSV> list) throws Exception {
        Mathematics mathematics = new Mathematics();

        FileReader fileReader= new FileReader();
        //String[] units=fileReader.units();

        File file= new File(path);

        File file1= new File(file.getParent()+"\\Result.txt"); //Винда
       // File file1= new File(file.getParent()+"/Result.txt"); MacOS

        if (!file1.exists()){
            file1.createNewFile();
        }
        PrintWriter writer= new PrintWriter(file1);

        Date date=mathematics.maxTemp(list);
        Double date1= mathematics.maxTemp1(list);
        writer.println("День и час, когда была самая высокая температура: "+date+"  (Температура: "+ date1 +" °C)");

        Double humidity=mathematics.leastHumidity(list);
        writer.println("Самая низкая влажность: "+ humidity+"%");

        Double wind=mathematics.hardestWind(list);
        writer.println("Самый сильный ветер: "+ wind+" км/ч");

        String direction=mathematics.mostOftenDirection(list);
        writer.println("Самое частое направление ветра: "+ direction);

        writer.flush();
        writer.close();

    }
}
