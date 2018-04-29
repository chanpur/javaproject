package tugasprak5;

public class operasi {
    public float uang;
    public int lama;
    
    public float biasa(){
        float biasa;
        biasa = uang*(float)0.05;
        return biasa;
    }
    public float bonus(){
        float bonus;
        bonus = uang*(float)0.001;
        return bonus;
    }
    public float total1(){
        float total1;
        total1 = (float)uang*lama*(float)0.05;
        return total1;
    }
}

    