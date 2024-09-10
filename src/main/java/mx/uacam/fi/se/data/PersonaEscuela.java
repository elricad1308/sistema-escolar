package mx.uacam.fi.se.data;

import com.google.gson.Gson;

public class PersonaEscuela {

  private int id;
  private String nombre;
  private String apellido;
  private String sexo;
  private String fh_nac;
  private int id_rol;

  public PersonaEscuela () {

  }

  public PersonaEscuela (int id, String nombre, String apellido, String sexo, String fh_nac, int id_rol) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.sexo = sexo;
    this.fh_nac = fh_nac;
    this.id_rol = id_rol;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre () {
    return nombre;
  }

  public void setNombre (String nombre) {
    this.nombre = nombre;
  }

  public String getApellido () {
    return apellido;
  }

  public void setApellido (String apellido) {
    this.apellido = apellido;
  }

  public String getSexo () {
    return sexo;
  }

  public void setSexo (String sexo) {
    this.sexo = sexo;
  }

  public String getFh_nac() {
    return fh_nac;
  }

  public void setFh_nac(String fh_nac) {
    this.fh_nac = fh_nac;
  }

  public int getId_rol() {
    return id_rol;
  }

  public void setId_rol(int id_rol) {
    this.id_rol = id_rol;
  }

  public String toJson() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  public static PersonaEscuela fromJson(String json) {
    Gson gson = new Gson();
    return gson.fromJson(json, PersonaEscuela.class);
  }

  public String toString () {
    return String.format("Persona #%d:\t%s %s", id, nombre, apellido);
  }
}