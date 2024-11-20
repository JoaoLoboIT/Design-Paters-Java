package DesignPaters.abstractFactory;

public class ProdutorFactory {
    public static AbstractFactory getFactory(String type) {
        if(type == null)
            return null;
        if(type.equalsIgnoreCase("Cor"))
            return new CorFactory();
        if(type.equalsIgnoreCase("forma"))
            return new FormaFactory();

        return null;
    }
}
