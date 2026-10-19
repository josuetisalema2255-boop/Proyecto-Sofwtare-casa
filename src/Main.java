void main() {
    Proyecto p1 = new Proyecto();

    p1.setNombre("Sistema de Ventas");
    p1.setResponsable("Nicolas");
    p1.setProgreso(40); // Progreso inicial

    p1.mostrarInformacion();

    System.out.println("-------------------");

    // Avanzar el proyecto por partes
    p1.avanzar(30); // Sube a 70%
    p1.avanzar(50); // Intentará pasar de 100%, se limitará a 100% y se completará

    System.out.println("-------------------");
    p1.mostrarInformacion();
}