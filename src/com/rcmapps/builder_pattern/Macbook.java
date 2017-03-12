package com.rcmapps.builder_pattern;

public class Macbook {

    private final int ram;
    private final String processor;
    private final String dvdDrive;

    public Macbook(Builder builder) {
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.dvdDrive = builder.dvdDrive;
    }

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public String getDvdDrive() {
        return dvdDrive;
    }

    public static class Builder{
        private int ram;
        private String processor;
        private String dvdDrive;

        public Builder withRam(int ram){
            this.ram = ram;
            return this;
        }

        public Builder withProcessor(String processor){
            this.processor = processor;
            return this;
        }

        public Builder withDvdDrive(String dvdDrive){
            this.dvdDrive = dvdDrive;
            return this;
        }

        public Macbook build(){
            return new Macbook(this);
        }

    }
}
