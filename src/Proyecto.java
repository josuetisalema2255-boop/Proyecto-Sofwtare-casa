public class Proyecto {
    // Atributos privados
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    // Getters y Setters

    //NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    // PROGRESO
    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            if (progreso == 100) {
                this.terminado = true;
            }
        }
    }

    // RESPONSABLE
    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    // TERMINADO
    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre +
                "\nProgreso: " + progreso + "%" +
                "\nResponsable: " + responsable +
                "\nTerminado: " + terminado);
    }

    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            int nuevoProgreso = this.progreso + porcentaje;
            if (nuevoProgreso > 100) {
                this.progreso = 100;
                this.terminado = true;
                System.out.println("El proyecto llegó al 100% y se ha completado automáticamente.");
            } else {
                this.progreso = nuevoProgreso;
                System.out.println("Progreso actual de " + this.nombre + ": " + this.progreso + "%");
            }
        }
    }
}