package com.example.estruturacontrol.repeticion;

public class ConcatenarTextos {
    public static void main(String[] args) {
        String[] stringArray = new String[]{"Hello ", " how", " are", " you", " welcome", " to", " Tutorialspoint"};
        StringBuilder sb = new StringBuilder();
        for (String s : stringArray) {
            sb.append(s);
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
