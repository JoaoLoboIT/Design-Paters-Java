package DesignPaters.adapter;

public class Adaptador extends TomadaDoisPinos {
    private TomadaTresPinos tomadaTresPinos;
    public Adaptador() {
        this.tomadaTresPinos = new TomadaTresPinos();
    }
    public void Ligar2Pinos(){
        this.tomadaTresPinos.Ligar3Pinos();
    }

}
