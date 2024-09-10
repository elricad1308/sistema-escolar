package mx.uacam.fi.se.test;

import java.util.List;
import mx.uacam.fi.se.modelos.PersonaEscuelaModel;
import mx.uacam.fi.se.data.PersonaEscuela;

public class PersonaEscuelaModelTest {

  public static void main (String[] args) {
    PersonaEscuelaModel model = new PersonaEscuelaModel();
    
    // List all the PersonaEscuela objects
    List<PersonaEscuela> personas = model.list();
    for (PersonaEscuela persona : personas) {
      System.out.println(persona);
    }

    // Save the new PersonaEscuela object
    PersonaEscuela persona = new PersonaEscuela(0, "Python", "Language", "o", "1991-02-20", 4);
    int id = model.save(persona);
    System.out.println("New persona ID: " + id);
  }
}