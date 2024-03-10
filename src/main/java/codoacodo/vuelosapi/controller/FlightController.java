package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Flight;
import codoacodo.vuelosapi.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")

public class FlightController {
    @Autowired //inyectamos un servicio
    FlightService flightService;

    @GetMapping("")
    public List<Flight> getAllFlights() {

        return flightService.traerTodosLosVuelos();
    }

    @PostMapping("/agregar")
    //
    public void createFlight(@RequestBody Flight flight) { //el tipo de dato que queremos recibir del cliente va a ser vuelo
        //cuanto entres a esa url y hagas un postmapping, no vas a poder hacer esto al menos que recibas como parametro un vuelo
        flightService.crearVuelo(flight);
    }

    @GetMapping("/{id}") //encontrar a traves del id
    public Flight findFlightById(@PathVariable Long id) {
        return flightService.buscarVueloPorId(id);

    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteFlight(@PathVariable Long id) { //para poder borrar un vuelo, tengo que pasarle un ID
        flightService.borrarVUeloPorId(id);


    }

    @PutMapping("/actualizar")
    //devuelva el vuelo
    public Flight updateFlight(@RequestBody Flight flight) {
        return flightService.actualizarVuelo(flight);
    }

}
