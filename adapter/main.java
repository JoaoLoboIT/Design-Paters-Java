package DesignPaters.adapter;

public class main {
    public static void main(String[] args) {
        TomadaTresPinos t3 = new TomadaTresPinos();
        TomadaDoisPinos t2 = new TomadaDoisPinos();
        TomadaDoisPinos adap = new Adaptador();
        adap.Ligar2Pinos();
    }
}
