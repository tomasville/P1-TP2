public class Estudiante extends Persona implements MiembroUniversidad{
    String carrera;
    double promedio;
    ListaEnlazada materias;

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera, double promedio, ListaEnlazada materias){
        super(nombre, apellido, edad, documento);    
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = materias;
    }

    public Estudiante(){

    }

    //Metodos Getters y Setters//

    public String getCarrera(){
        return this.carrera;
    }

    public void setCarrera(String carrera){
        if(carrera == null || carrera.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.carrera = carrera;
    }

    public double getPromedio(){
        return this.edad;
    }

    public void setPromedio(double promedio){
        if (promedio < 1 || promedio > 10){
            throw new IllegalArgumentException("El promedio debe ser de entre 1 y 10");
        }
        this.promedio = promedio;
    }

    public ListaEnlazada getMaterias(){
        return materias;
    }

    public void setMaterias(ListaEnlazada materias){
        this.materias = materias;
    }

    @Override
    public String obtenerRol(){
        return "Estudiante";
    }

    @Override
    public String obtenerInformacionCompleta(){
        return toString();
    }

    public static double calcularPromedioRecursivo(Nodo actual, int contador, double suma) {
        if (actual == null) {
            return contador == 0 ? 0 : suma / contador;
        }
        //Obtenemos la materia desde object
        Materia materia = (Materia) actual.getDato();

        //Llamada recursiva
        return calcularPromedioRecursivo(
            actual.getSiguiente(),
             contador + 1,
              suma + materia.getCalificacion());
    }
    public double calcularPromedioRecursivo() {
        // Si no hay materias, llama al método recursivo con el nodo inicial (null)
        if (this.materias == null) {
            return calcularPromedioRecursivo(null, 0, 0);
        }
        
        // Llama al método recursivo con el nodo inicial de la lista
        return calcularPromedioRecursivo(this.materias.getInicio(), 0, 0);
    }
    /* 
    public double calcularPromedioIterativo(){
        //
        //sale del if cuando las materias son nulas o no hay materias
        if (materias == null || materias.length == 0){
            return 0;
        }
        double suma = 0;
        //recorre el array de materias y suma las calificaciones
        for (int i = 0; i < materias.length; i++){
            suma += materias[i].getCalificacion();
        }
        return suma / materias.length;
    }
    */
    @Override
    public String toString(){
        return super.toString() + "- Carrera:"+ carrera + "- Promedio: "+ promedio;
    }
}
