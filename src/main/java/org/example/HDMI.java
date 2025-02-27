package org.example;

public class HDMI extends Colokan{

    public HDMI(int harga , double promisedBandwith,String merk ) {
        super(merk, promisedBandwith, harga);
    }


    public double getRealBandwith(){
        double ratio = (double) getHarga() / 50000;
        if (ratio<1){
            return ratio * getPromisedBandwith();
        } else{
            return getPromisedBandwith();
        }

    }
}
