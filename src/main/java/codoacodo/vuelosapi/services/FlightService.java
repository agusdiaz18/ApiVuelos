package codoacodo.vuelosapi.services;

import codoacodo.vuelosapi.model.Flight;
import codoacodo.vuelosapi.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {


    //voy a agregar una lista
    //private List<Flight> flightList= new ArrayList<>();

    @Autowired //necesito tener inyectado lo que es el repositorio
    VueloRepository vueloRepository;


    public List<Flight> traerTodosLosVuelos() {
        return vueloRepository.findAll(); //retorna todos los vuelos
    }

    public void crearVuelo(Flight flight) {
        vueloRepository.save(flight);
    }

    public void agregarVuelos() { //un metodo que sirve para cargar cada uno de esos vuelos

    }


    public Flight buscarVueloPorId(Long id) {
        return vueloRepository.findById(id).orElse(null);
    }

    public void borrarVUeloPorId(Long id) {

        vueloRepository.deleteById(id); //

    }

    public Flight actualizarVuelo(Flight flight) {
        vueloRepository.save(flight);
        return vueloRepository.findById(flight.getId()).orElse(null);

    }


}
