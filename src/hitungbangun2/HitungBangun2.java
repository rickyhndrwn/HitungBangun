package hitungbangun2;

import java.text.DecimalFormat;

public class HitungBangun2 {
    DecimalFormat df = new DecimalFormat("##.##");
    GUIHitungBangun2 gHB = new GUIHitungBangun2();
    private HitungBangun2 hB;
    String a = "Joni";
    
    public void clear(){
        gHB.jariText.setText("");
        gHB.sisiText.setText("");
        gHB.luasL.setText("");
        gHB.kelilingL.setText("");
        gHB.volumB.setText("");
        gHB.luasP.setText("");
        gHB.kelilingP.setText("");
        gHB.volumK.setText("");
    }
    
    public void luasLingkaran(double jari){
        double luasLH = Math.PI * Math.pow(jari, 2);
        gHB.luasL.setText("");
        gHB.luasL.setText("" + df.format(luasLH) + " cm");
    }
    
    public void kelilingLingkaran(double jari){
        double kelilingLH = Math.PI * (2 * jari);
        gHB.kelilingL.setText("");
        gHB.kelilingL.setText("" + df.format(kelilingLH) + " cm");
    }
    
    public void volumBola(double jari){
        double volumBH = 4 / 3 * Math.PI * Math.pow(jari, 3);
        gHB.volumB.setText("");
        gHB.volumB.setText("" + df.format(volumBH) + " cm");
    }
    
    public void luasPersegi(double sisi){
        double luasPH = sisi * sisi;
        gHB.luasP.setText("");
        gHB.luasP.setText("" + df.format(luasPH) + " cm");
    }
    
    public void kelilingPersegi(double sisi){
        double kelilingPH = sisi * 4;
        gHB.kelilingP.setText("");
        gHB.kelilingP.setText("" + df.format(kelilingPH) + " cm");
    }
    
    public void volumKubus(double sisi){
        double volumKH = Math.pow(sisi, 3);
        gHB.volumK.setText("");
        gHB.volumK.setText("" + df.format(volumKH) + " cm");
    }
}
