package DesignPaters.abstractFactory;

public class FormaFactory extends AbstractFactory {
    public Cor GetCor(String cor) {
        return null;
    }

    @Override
    public Cor getCor(String cor) {
        return null;
    }

    public Forma getForma(String forma) {
        if(forma.equalsIgnoreCase("quadrado"))
            return new Quadrado();

        return null;
    }
}
