package com.example.Gestor.de.reparaciones.App.services;

import com.example.Gestor.de.reparaciones.App.entities.CarEntity;
import com.example.Gestor.de.reparaciones.ValuesAndConstants.services.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostManagerService {
    @Autowired
    private BondService bondService;

 /*

    public double getPorcentajeRecargoRetraso(HistorialEntity historialReparaciones){
        LocalDate fechasSalida = historialReparaciones.getFechaSalidaTaller();
        LocalDate fechaRetirada = historialReparaciones.getFechaClienteSeLlevaVehiculo();

        //Calcular diferencia entre fechas
        long diferenciaEnDias = ChronoUnit.DAYS.between(fechasSalida, fechaRetirada);

        //Si hay retraso, calcular el recargo
        double recargo = 0;
        if (diferenciaEnDias > 0) {
            recargo = 0.05 * diferenciaEnDias; // 5% del monto total por cada día de retraso
        }
        return recargo;
    }


    public double getPorcentajeDescuentoDia(LocalDate fechaEntrada, LocalTime horaEntrada){
        DayOfWeek diaDeLaSemana = fechaEntrada.getDayOfWeek();
        int horaDeEntrada = horaEntrada.getHour();

        //Verificar día de la semana
        if((diaDeLaSemana == DayOfWeek.MONDAY || diaDeLaSemana == DayOfWeek.THURSDAY) && (horaDeEntrada >= 9 && horaDeEntrada < 12)){
            return 0.1;
        }
        else{
            return 0;
        }
    }






    public int getMontoDescuentoBonos(AutomovilEntity automovil) {
        String marca = automovil.getMarca();

        // Verificar si la marca es null o está vacía
        if (marca == null || marca.isEmpty()) {
            return 0; // Devolver un valor predeterminado (en este caso, 0)
        }

        // Obtener los datos de bonos por la marca
        DatosBonosEntity datosBono = datosBonosService.getDatosBonosByMarca(marca);

        // Verificar si se encontraron datos de bonos para esa marca
        if (datosBono != null) {
            // Si hay bonos disponibles, decrementar la cantidad y devolver el monto del bono
            if (datosBono.getCantidadBonos() > 0) {
                datosBono.setCantidadBonos(datosBono.getCantidadBonos() - 1);
                return datosBono.getMontoBono();
            } else {
                // Si no hay bonos disponibles, devolver 0
                return 0;
            }
        } else {
            // Si no se encontraron datos de bonos para esa marca, devolver 0
            return 0;
        }
    }


 */

}