package org.example;

public class VGA extends Colokan{

    public VGA(int harga, double promisedBandwith, String merk) {
        super(merk, promisedBandwith, harga);
    }

    public double getRealBandwith(){
        double ratio = (double) getHarga() / 30000;
        if (ratio<1){
            return ratio * getPromisedBandwith();
        } else{
            return getPromisedBandwith();
        }

    }
}
