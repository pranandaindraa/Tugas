package com.dicoding.javafundamental.collection;
import java.util.*;

public class ListDay {
    public static void main(String[] args) {
        List<String> day = new ArrayList<>();
        day.add("senin");
        day.add("selasa");
        day.add("rabu");
        day.add("kamis");
        day.add("jumat");
        day.add("sabtu");
        day.add("minggu");

        System.out.println("List day awal :");
        for (int i = 0; i < day.size(); i++){

            System.out.println("\t index-"+ i +" = " + day.get(i));

            day.remove("selasa");

            System.out.println("List day akhir :");
            {
                i = 0;
                while (i < day.size()) {
                    System.out.println("\t index-"+ i +" = " + day.get(i));

                    i++;
                }
            }
        }
    }
}
