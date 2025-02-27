package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;


    public int getMaxResolusi() {
        return maxResolusi;
    }

    public int getResolution(){
        int A=480;
        int B=720;
        int C=1080;
        if(colokan.getRealBandwith()>=10 && colokan.getRealBandwith()<=35){
            return Math.min(A, maxResolusi);
        }else if (colokan.getRealBandwith()>=35 && colokan.getRealBandwith()<=100){
            return Math.min(B, maxResolusi);
        }
        else if  (colokan.getRealBandwith()>100){
            return Math.min(C, maxResolusi);
        }else {
            System.out.println("gabisa nyala");
        }
        return 0;
    }

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan){
        this.colokan = colokan;
        System.out.println("Berhasil connect ke " + colokan.getMerk());

    }
}
