package DesignPaters.singleton;

public class ImpressoraSingleton{
    private static ImpressoraSingleton instance;
    private ImpressoraSingleton(){}
    public static ImpressoraSingleton getImpressora(){
        if(instance == null)
            return new ImpressoraSingleton();

        return instance;
    }


}
