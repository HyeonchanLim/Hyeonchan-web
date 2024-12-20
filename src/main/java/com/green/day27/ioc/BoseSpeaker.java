package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;
import com.green.day27.noneioc.JBLSpeaker;

public class BoseSpeaker implements Speaker {
    private Woofer woofer;

    public BoseSpeaker(Woofer woo) {
        this.woofer = woo;
    }

    @Override
    public void speakerSound() {
        System.out.println("Bose Speaker : 소리가 짱짱하다.");
        woofer.baseSound();
    }
}
