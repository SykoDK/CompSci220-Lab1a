package edu.umw.lab1a;

import java.util.Scanner;

public class Lab1a {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the total number of seconds > ");
            int time =  in.nextInt();
            int mins = time % (60 * 60);
            double minutes = Math.floor (mins / 60);
            int secs = mins % 60;
            double seconds = Math.ceil(secs);
            int valuemin = (int)minutes;
            int valuesec = (int)seconds;
            System.out.println("Time is " + valuemin + ":" + valuesec);
     }

}