package com.rcmapps.builder_pattern;


public class Main {

    public static void main(String[] args) {

        Macbook macbookPro = new Macbook.Builder()
                .withProcessor("Intel core-i7")
                .withRam(4)
                .withDvdDrive("Asus DVD Drive")
                .build();

        System.out.println(macbookPro.getRam()+"");
        System.out.println(macbookPro.getProcessor()+"");
        System.out.println(macbookPro.getDvdDrive()+"");


    }
}
