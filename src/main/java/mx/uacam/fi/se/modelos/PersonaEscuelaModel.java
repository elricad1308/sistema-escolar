package mx.uacam.fi.se.modelos;

import mx.uacam.fi.se.data.PersonaEscuela;
import mx.uacam.fi.se.net.HttpConnection;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;
import java.lang.reflect.Type;


public class PersonaEscuelaModel {

  public List<PersonaEscuela> list () {
    try {
      String response = HttpConnection.get("/v1/escuela/persona");

      Gson gson = new Gson();
      Type personaListType = new TypeToken<List<PersonaEscuela>>(){}.getType();
      List<PersonaEscuela> personas = gson.fromJson(response, personaListType);

      return personas;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public int save (PersonaEscuela persona) {
    String requestBody = persona.toJson();
    System.out.println(requestBody);

    try {
      String response = HttpConnection.post("/v1/escuela/persona", requestBody);

      return Integer.parseInt(response);
    } catch (IOException e) {
      e.printStackTrace();
      return -1;
    }
  }

}