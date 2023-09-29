public abstract class Pokemon {
    protected String nombre;
    protected String tipo;
    protected int numero;
    protected int generacion;

    public Pokemon(String nombre, String tipo, int numero, int generacion){
        
        this.nombre = nombre;
        this.tipo = tipo;
        this.numero = numero;
        this.generacion = generacion;
        
    }

    public abstract String morder();
    public abstract String arunnar();
}

