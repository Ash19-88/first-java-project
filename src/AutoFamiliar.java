/*This exercise involves creating a class AutoFamiliar that also extends Automovil.
 The AutoFamiliar class should have an additional property cantAsientos (number of seats)
  and should also provide an implementation for the acelerar method.*/
public class AutoFamiliar extends Automovil {
    private int cantAsientos;

    public AutoFamiliar() {

    }

    public AutoFamiliar(String marca, String modelo, int anioFabricacion, int cantAsientos) {
        super(marca, modelo, anioFabricacion);
        this.cantAsientos = cantAsientos;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
    public void acelerar(){
        System.out.println("Acelera despacio");
    }
}
