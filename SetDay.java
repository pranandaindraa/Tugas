package com.dicoding.javafundamental.collection;
import java.util.*;

public class SetDay {

    public static void main(String[] args){

        Set<String> day = new HashSet<>();
        day.add("senin");
        day.add("selasa");
        day.add("rabu");
        day.add("kamis");
        day.add("jumat");
        day.add("sabtu");
        day.add("minggu");

        System.out.println("Set day awal : (size =" + day.size() + ")");
        for (String days : day ){
            System.out.println("\t" + days);
        }
        day.remove("selasa");

        System.out.println("Set day akhir : (size =" + day.size() + ")");
        for (Iterator iterator = day.iterator(); iterator.hasNext(); ) System.out.println("\t " + iterator.next());

    }
}
