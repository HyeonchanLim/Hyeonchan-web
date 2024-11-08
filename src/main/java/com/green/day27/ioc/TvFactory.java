package com.green.day27.ioc;

import com.green.day27.*;

public class TvFactory {
    // SingleTon 패턴 , 싱글톤 패턴 - 객체를 딱 하나만 만들어서 돌려쓴다.
    private static TvFactory tvFactory;

    public static TvFactory getInstance() {
        if (tvFactory == null){
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    private TvFactory() { // private 생성자 -> 외부에서 더 이상 건들지 못함 고정

    }
    public Tv factory(String tvname , String speakerName , String wooferName){
        Woofer woofer = switch (wooferName) {
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };
        Speaker speaker = switch (speakerName){
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };
        return switch (tvname) {
            case "lg" -> new LgTv(speaker);
            default -> null;
        };
    }
}
