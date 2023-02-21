package prevencion;

//@author: Ricardo Poblete
//@version: 21/09/2023 v1.0

//Clase que define la capacitacion.
class Capacitacion {
  private int identificador;
  //Identificador para identificar la capacitacion.-
  private String cliente;
  //cliente para identificar el nombre del cliente.-
  private String dia;
  //dia para identificar el dia de la capacitación.-
  private String hora;
  //hora para identificar la hora de la capacitación.-
  private String lugar;
  //lugar para identificar el lugar de la capacitación.-
  private int duracion;
  //duracion para identificar la duracion de la capacitación.-
  private int cantidad_asistentes;
  //cantidad_asistentes para identificar la cantidad de asistentes de la capacitación.-

  public Capacitacion(){

  }


  public Capacitacion(int identificador, String cliente, String dia, String hora, String lugar, int duracion, int cantidad_asistentes) {
      this.identificador = identificador;
      this.cliente = cliente;
      this.dia = dia;
      this.hora = hora;
      this.lugar = lugar;
      this.duracion = duracion;
      this.cantidad_asistentes = cantidad_asistentes;
  }


  public int getIdentificador() {
      return identificador;
  }

  public void setIdentificador(int identificador) {
      this.identificador = identificador;
  }

  public String getCliente() {
      return cliente;
  }

  public void setCliente(String cliente) {
      this.cliente = cliente;
  }

  public String getDia() {
      return dia;
  }

  public void setDia(String dia) {
      this.dia = dia;
  }

  public String getHora() {
      return hora;
  }

  public void setHora(String hora) {
      this.hora = hora;
  }

  public String getLugar() {
      return lugar;
  }

  public void setLugar(String lugar) {
      this.lugar = lugar;
  }

  public int getDuracion() {
      return duracion;
  }

  public void setDuracion(int duracion) {
      this.duracion = duracion;
  }

  public int getCantidad_asistentes() {
      return cantidad_asistentes;
  }

  public void setCantidad_asistentes(int cantidad_asistentes) {
      this.cantidad_asistentes = cantidad_asistentes;
  }

  @Override
  public String toString() {
      return "Capacitacion{" +
              "identificador=" + identificador +
              ", cliente='" + cliente + '\'' +
              ", dia='" + dia + '\'' +
              ", hora='" + hora + '\'' +
              ", lugar='" + lugar + '\'' +
              ", duracion=" + duracion +
              ", cantidad_asistentes=" + cantidad_asistentes +
              '}';
  }
}
