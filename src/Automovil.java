/*This exercise involves creating an abstract class Automovil with the following properties and methods:
Properties: marca (brand), modelo (model), anioFabricacion (year of manufacture).
Methods: acelerar (accelerate) (abstract), frenar (brake) (returns a string "Frenando"),
and getters and setters for each property.
The acelerar method is abstract, which means it does not have an
implementation in the Automovil class and must be implemented in any class that extends Automovil.*/
public abstract class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Automovil() {
    }

    public Automovil(String marca){
        this.marca = marca;
    }

    public Automovil(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public abstract void acelerar();
    public String frenar(){
        return  "Frenando";
    }

    public String  getMarca(){
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
