package codoacodo.vuelosapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Flight {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String origen;
   private String destino;
   private String fechaHoraSalida;
   private String fechaHoraLlegada;
   private double precio;
   private String frecuencia;

   public Flight(String origen, String destino, String fechaHoraSalida, String fechaHoraLlegada, double precio, String frecuencia) {
      this.origen = origen;
      this.destino = destino;
      this.fechaHoraSalida = fechaHoraSalida;
      this.fechaHoraLlegada = fechaHoraLlegada;
      this.precio = precio;
      this.frecuencia = frecuencia;
   }
   public Long getId() {
      return id;
   }





   /*public Flight(Long id, String origen, String destino, String fechaHoraSalida, String fechaHoraLlegada, double precio, String frecuencia) {
      this.id = id;
      this.origen = origen;
      this.destino = destino;
      this.fechaHoraSalida = fechaHoraSalida;
      this.fechaHoraLlegada = fechaHoraLlegada;
      this.precio = precio;
      this.frecuencia = frecuencia;
   }


   public String getOrigen() {
      return origen;
   }

   public String getDestino() {
      return destino;
   }

   public String getFechaHoraSalida() {
      return fechaHoraSalida;
   }

   public String getFechaHoraLlegada() {
      return fechaHoraLlegada;
   }

   public double getPrecio() {
      return precio;
   }

   public String getFrecuencia() {
      return frecuencia;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public void setOrigen(String origen) {
      this.origen = origen;
   }

   public void setDestino(String destino) {
      this.destino = destino;
   }

   public void setFechaHoraSalida(String fechaHoraSalida) {
      this.fechaHoraSalida = fechaHoraSalida;
   }

   public void setFechaHoraLlegada(String fechaHoraLlegada) {
      this.fechaHoraLlegada = fechaHoraLlegada;
   }

   public void setPrecio(double precio) {
      this.precio = precio;
   }

   public void setFrecuencia(String frecuencia) {
      this.frecuencia = frecuencia;
   }*/
}
