package mx.uacam.fi.se.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnection {

  private static final String baseUrl = "https://fi.jcaguilar.dev";
  
  public static String get (String endpoint) throws IOException {
    HttpURLConnection connection = null;
    BufferedReader reader = null;
    StringBuilder response = new StringBuilder();
    
    try {
      URL requestUrl = new URL(baseUrl + endpoint);
      connection = (HttpURLConnection) requestUrl.openConnection();
      connection.setRequestMethod("GET");
      
      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String line;
      
      while ((line = reader.readLine()) != null) {
        response.append(line);
      }
    } finally {
      if (reader != null) {
        reader.close();
      }
      
      if (connection != null) {
        connection.disconnect();
      }
    }
    
    return response.toString();
  }
  
  public static String post (String endpoint, String requestBody) throws IOException {
    HttpURLConnection connection = null;
    BufferedReader reader = null;
    StringBuilder response = new StringBuilder();
    
    try {
      URL requestUrl = new URL(baseUrl + endpoint);
      connection = (HttpURLConnection) requestUrl.openConnection();
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Accept", "application/json");
      connection.setDoOutput(true);

      OutputStream outputStream = connection.getOutputStream();
      byte[] input = requestBody.getBytes("utf-8");
      outputStream.write(input, 0, input.length);
      outputStream.flush();
      
      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String line;
      
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
        response.append(line);
      }
    } finally {
      if (reader != null) {
        reader.close();
      }
      
      if (connection != null) {
        connection.disconnect();
      }
    }
    
    return response.toString();
  }
}