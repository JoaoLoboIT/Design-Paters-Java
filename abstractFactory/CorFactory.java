package DesignPaters.abstractFactory;

public class CorFactory extends AbstractFactory {
    public Cor getCor(String cor) {
        if(cor == null)
            return null;
        if(cor.equalsIgnoreCase("Vermelho"))
            return new Vermelho();
        if(cor.equalsIgnoreCase("Azul"))
            return new Azul();

        return null;
    }
    public Forma getForma(String forma) {
        return null;
    }
}
