// package FRQs;

import java.util.ArrayList;

public class WeatherData {
    // Daily high temperatures, in order. Never null, no null elements.
    private ArrayList<Double> temps;




    public void cleanData(double low, double high)  { 
        for (int i = 0; i < temps.size(); i++) {
            if ((temps.get(i)>high) || (temps.get(i)<low)) {
                temps.remove(i);
            }
        }
    }
    public int longestHotStreak(double limit)       {
        int x = 0;
         for (int i = 0; i < temps.size(); i++){
            if (temps.get(i)>limit) {x++;}
         }
        return x;}
}

