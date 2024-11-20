package DesignPaters.fachtoryMethod;

public class formaFactory {
    public static FormaGeometrica getForma(String tipo){
        if(tipo == null)
            return null;
        if(tipo.equalsIgnoreCase("CIruclo"))
            return new Circulo();

        return null;
    }
}
