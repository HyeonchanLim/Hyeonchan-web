package com.green.day27.ioc;

import com.green.day01.ch01.SystemOutPrintln;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class GenelecSpeaker  implements Speaker {
    private Woofer woofer;

    public GenelecSpeaker(Woofer woofer) {
        this.woofer = woofer; // 값을 참조해서 입력 -> DI 방식
    }

    @Override
    public void speakerSound() {
        System.out.println("GenelecSpeaker : 소리가 엄청나다.");
        woofer.baseSound();
    }
}
