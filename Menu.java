package Citas;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Opcion = 0;
        Metodos M = new Metodos();
        System.out.println("----- Menú de opciones -----\n1. Agregar turno\n2. Atender siguiente turno\n3. Mostrar turnos atendidos\n4. Mostrar turnos pendientes\n5. Cancelar turno\n6. Salir");
      
        while(Opcion == 6)
        switch (Opcion) {
    
            case 1:
                M.agregarTurno(null, Opcion, null);
                break;
            case 2:
                M.atenderTurno();
                break;
            case 3:
                M.mostrarTurnosAtendidos();
                break;
            case 4:
                M.mostrarTurnosPendientes();
                break;
            case 5:
                M.cancelarTurno(null);
                break;
            default:
                break;
        }
    }

}