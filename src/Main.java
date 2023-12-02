/*This exercise involves creating a Main class with a main method. In the main method,
 create instances of AutoFamiliar and AutoDeportivo, set their properties,
 and print out their properties.*/
public class Main {
    public static void main(String[] args) {
        Automovil autoFamiliar= new AutoFamiliar();
        Automovil autoDeportivo = new AutoDeportivo("Ford", "Palio", 2020, false);

        Automovil autoDeportivo1 = new AutoDeportivo("Fiat");

        autoFamiliar.setMarca("Renault");
        System.out.println("Auto 1, marca: " + autoFamiliar.getMarca());
        System.out.println("Auto 2, marca: " + autoDeportivo.getMarca());
        System.out.println("Auto 2, año de fabricación: " + autoDeportivo.getAnioFabricacion());
        AutoDeportivo autoDeportivo2 = new AutoDeportivo();
        autoDeportivo1.setMarca("Ferrari");
        System.out.println("La marca del auto deportivo 2 es: " + autoDeportivo2.getMarca());

    }
}