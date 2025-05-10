package Citas;

import java.util.ArrayList;

public class Metodos {
    
    private static ArrayList<Paciente> turnosPendientes = new ArrayList<>();
    private static ArrayList<Paciente> turnosAtendidos = new ArrayList<>();


    public static void agregarTurno(String nombre, int edad, String cedula) {
        Paciente paciente = new Paciente(nombre, edad, cedula);
        turnosPendientes.add(paciente);
        System.out.println("Turno registrado para: " + paciente.getNombre());
    }

    
    public static void atenderTurno() {
        if (turnosPendientes.isEmpty()) {
            System.out.println("No hay turnos pendientes.");
        } else {
            Paciente atendido = turnosPendientes.remove(0); 
            turnosAtendidos.add(atendido);
            System.out.println("Atendiendo a: " + atendido.getNombre());
        }
    }


    public static void mostrarTurnosAtendidos() {
        if (turnosAtendidos.isEmpty()) {
            System.out.println("No hay turnos atendidos.");
        } else {
            System.out.println("Turnos atendidos:");
            for (Paciente paciente : turnosAtendidos) {
                System.out.println(paciente);
            }
        }
    }

    public static void mostrarTurnosPendientes() {
        if (turnosPendientes.isEmpty()) {
            System.out.println("No hay turnos pendientes.");
        } else {
            System.out.println("Turnos pendientes:");
            for (Paciente paciente : turnosPendientes) {
                System.out.println(paciente);
            }
        }
    }

    public static void cancelarTurno(String cedula) {
        boolean encontrado = false;
        for (int i = 0; i < turnosPendientes.size(); i++) {
            if (turnosPendientes.get(i).getCedula().equals(cedula)) {
                turnosPendientes.remove(i);
                System.out.println("Turno cancelado para el paciente con cédula: " + cedula);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un turno con esa cédula.");
        }
    }
}

