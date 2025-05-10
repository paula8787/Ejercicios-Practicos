class Persona {
    String nombre;
}
public class InnerMetodos2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Paula";
        CambiarNombre(persona);
        System.out.println("nombre despues de CambiarNombre: "+ persona.nombre);

    }
    public static void CambiarNombre(Persona persona) {
        persona.nombre = "Andrea";
    }
}


