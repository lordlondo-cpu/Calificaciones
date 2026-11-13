import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Estudiante {
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + " - Nota: " + nota;
    }
}

public class ProcesamientoCalificaciones {

    public static void main(String[] args) {

        // Lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Ana", 4.5));
        estudiantes.add(new Estudiante("Carlos", 2.8));
        estudiantes.add(new Estudiante("Maria", 3.7));
        estudiantes.add(new Estudiante("Juan", 4.9));

        // SUPPLIER
        Supplier<Estudiante> nuevoEstudiante =
                () -> new Estudiante("Pedro", 3.2);

        estudiantes.add(nuevoEstudiante.get());

        System.out.println("===== LISTA DE ESTUDIANTES =====");
        estudiantes.forEach(System.out::println);

        // PREDICATE
        Predicate<Estudiante> aprobado =
                estudiante -> estudiante.nota >= 3.0;

        System.out.println("\n===== ESTUDIANTES APROBADOS =====");

        estudiantes.stream()
                .filter(aprobado)
                .forEach(e -> System.out.println(e.nombre));

        // FUNCTION
        Function<Estudiante, String> clasificacion =
                estudiante -> {
                    if (estudiante.nota >= 4.5)
                        return "Excelente";
                    else if (estudiante.nota >= 3.5)
                        return "Bueno";
                    else if (estudiante.nota >= 3.0)
                        return "Aceptable";
                    else
                        return "Reprobado";
                };

        System.out.println("\n===== CLASIFICACIÓN =====");

        estudiantes.forEach(e ->
                System.out.println(
                        e.nombre + " -> " + clasificacion.apply(e)));

        // CONSUMER
        Consumer<Estudiante> mostrarDetalle =
                estudiante -> System.out.println(
                        "Estudiante: " + estudiante.nombre +
                        " | Nota: " + estudiante.nota);

        System.out.println("\n===== DETALLE DE ESTUDIANTES =====");

        estudiantes.forEach(mostrarDetalle);
    }
}