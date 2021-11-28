package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        ITelephone rajithasPhone ;
        rajithasPhone = new DeskPhone(123356855);
        rajithasPhone.powerOn();
        rajithasPhone.callPhone(123356855);
        rajithasPhone.answer();

        System.out.println("========================");

        rajithasPhone = new MobilePhone(256466666);
        rajithasPhone.powerOn();
        rajithasPhone.callPhone(256466666);
        rajithasPhone.answer();


    }
}
