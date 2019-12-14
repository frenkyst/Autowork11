package com.example.autowork.model;

public class UserMan {
    private String Nama;
    private String email;
    private String key;

    public UserMan(String nama, String email, String key) {
        this.Nama = nama;
        this.email = email;
        this.key = key;
    }

    public UserMan(){ }

    public UserMan(String nama, String email) {
        this.Nama = nama;
        this.email = email;

    }




    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    @Override
    public String toString() {
        return  " "+Nama+"\n" +
                " "+email;

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
