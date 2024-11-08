package com.green.day27;

import com.green.day27.noneioc.HarmanSpeaker;
import com.green.day27.noneioc.samsungTv;

public class Test {
    public static void main(String[] args) {
        HarmanSpeaker hs = new HarmanSpeaker();
        hs.speakerSound();

        //harman speaker :
        //hanil woofer :
        System.out.println("------");
        Tv tv = new samsungTv();
        tv.sound();
    }
}
