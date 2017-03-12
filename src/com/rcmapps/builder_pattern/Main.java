package com.rcmapps.builder_pattern;

import com.rcmapps.builder_pattern.MacbookPro;

public class Main {

    public static void main(String[] args) {

        MacbookPro macbookPro = new MacbookPro.Builder()
                .withProcessor("Intel core-i7")
                .withRam(4)
                .withDvdDrive("Asus DVD Drive")
                .build();

        System.out.println(macbookPro.getRam()+"");
        System.out.println(macbookPro.getProcessor()+"");
        System.out.println(macbookPro.getDvdDrive()+"");


    }
}
