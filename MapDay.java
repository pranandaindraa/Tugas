package com.dicoding.javafundamental.collection;
import java.util.*;

public class MapDay {

    public static void main(String[] args){
        Map<String, String> map = new TreeMap<String, String>();
        map.put("01-03-2022", "senin");
        map.put("02-03-2022", "selasa");
        map.put("03-03-2022", "rabu");
        map.put("04-03-2022", "kamis");
        map.put("05-03-2022", "jumat");
        map.put("06-03-2022", "sabtu");
        map.put("07-03-2022", "minggu");

        System.out.println(map);
    }
}
