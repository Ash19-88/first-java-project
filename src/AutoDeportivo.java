/*This exercise involves creating a class AutoDeportivo that extends
 Automovil. The AutoDeportivo class should have an additional property esConvertible
(convertible) and should provide an implementation for the acelerar method.*/
public class AutoDeportivo extends  Automovil {
    private  boolean esConvertible;

    public AutoDeportivo() {
    }

    public AutoDeportivo(String marca){
        super(marca);
    }

    public AutoDeportivo(String marca, String modelo, int anioFabricacion, boolean esConvertible) {
        super(marca, modelo, anioFabricacion);
        this.esConvertible = esConvertible;
    }

    @Override
    public void acelerar(){
        System.out.println("Acelera muy rápido");
    }
}
