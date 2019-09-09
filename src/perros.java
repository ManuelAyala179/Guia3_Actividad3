
public class perros {
//Atributos de Perro

    private String Nombre;
    private String Raza;
    private String Localidad;
    private String Nom_Dueño;
    private String Cedula;
    private String Telefono;
    private String DiaAsist;

//Métodos
//Constructor
    public perros(String nombre, String raza, String loc, String nomD, String doc,
            String tel, String dAsis) {
        this.Nombre = nombre;
        this.Raza = raza;
        this.Localidad = loc;
        this.Nom_Dueño = nomD;
        this.Cedula = doc;
        this.Telefono = tel;
        this.DiaAsist = dAsis;

    }

//Analizadores
    public String ingNombre() {
        return this.Nombre;
    }

    public String ingRaza() {
        return this.Raza;
    }

    public String ingLoc() {
        return this.Localidad;
    }

    public String ingNomD() {
        return this.Nom_Dueño;
    }

    public String ingDoc() {
        return this.Cedula;
    }

    public String ingTel() {
        return this.Telefono;
    }

    public String ingAsis() {
        return this.DiaAsist;
    }

}
