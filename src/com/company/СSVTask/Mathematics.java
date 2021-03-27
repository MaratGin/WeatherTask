package com.company.СSVTask;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.OptionalInt;

public class Mathematics {

public Date maxTemp(List<CSV> list){
   Double max = 0.0;
   int index=0;
    for (CSV csv:list) {
        if (csv.getTemperature()>max){
            max=csv.getTemperature();
            index=list.indexOf(csv);
        }

    }
    Date answer= list.get(index).getDate();
    return  answer;
}
    public Double maxTemp1(List<CSV> list){
        Double max = 0.0;
        int index=0;
        for (CSV csv:list) {
            if (csv.getTemperature()>max){
                max=csv.getTemperature();
                index=list.indexOf(csv);
            }

        }
        Double answer= max;
        return  answer;
    }


public Double leastHumidity(List<CSV> list){
    int index=0;
    Double min=Double.MAX_VALUE;
    for (CSV csv:list) {
        if (csv.getHumidity()<min){
            min= csv.getHumidity();
            index=list.indexOf(csv);

        }

    }

Double answer=list.get(index).getHumidity();
    return answer;
}

public Double hardestWind(List<CSV> list){
      int index=0;
      Double max=0.0;
    for (CSV csv:list) {
        if (csv.getTemperature()>max){
            max=csv.getTemperature();
            index=list.indexOf(csv);
        }

    }

    Double answer=list.get(index).getSpeed();

    return answer;
}

 public String mostOftenDirection(List<CSV> list){
    String answer="";
    int N=0; //север
    int S=0; //юг
    int E=0; //восток
    int W=0; //запад
     int max=0;
     for (CSV csv:list) {
         if ((csv.getDirection()<45)&&(csv.getDirection()>315)){
              N++;
         } else {
             if ((csv.getDirection()<135)&&(csv.getDirection()>45)){
                 E++;
             } else {
                 if ((csv.getDirection()<225)&&(csv.getDirection()>135)){
                     S++;
                 } else {
                     if ((csv.getDirection()<315)&&(csv.getDirection()>225)){
                         W++;
                     }
                 }
             }
         }
         int[] array={N,S,E,W};
        // OptionalInt answer1=Arrays.stream(array).max();
         for (int i = 0; i <array.length ; i++) {
             if (array[i]>max){
                 max=i;
             }
         }

         if (array[max]==N){
             answer="СЕВЕР";
         }
         if (array[max]==S){
             answer="ЮГ";
         }
         if (array[max]==E){
             answer="ВОСТОК";
         }
         if (array[max]==W){
             answer="ЗАПАД";
         }
     }

     return answer;
 }



}
