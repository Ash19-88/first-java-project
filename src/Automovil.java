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
