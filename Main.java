package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /******* input ******/
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        for (int i = 0; i < t; i++) {
            //System.out.println(i);
            a[i] = sc.nextInt();
        }
        /******** Calculations ********/
        int tmpValue = a[0];
        map.put(tmpValue, "single");
        if (t != 1) {
            for (int i = 1; i < t; i++) {
                if (map.get(a[i]) == null) {
                    map.put(a[i], "single");
                } else if (map.get(a[i]).equals("single")) {
                    map.put(a[i], "pair");
                }
            }
        }
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            if (value.equals("single")) {
                System.out.println(key);
                break;
            }
        }
    }
}
