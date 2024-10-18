package org.example;

import com.google.gson.Gson;
import io.calidog.certstream.CertStream;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      //string version of the message
      try {
        CertStream.onMessageString((msg) -> {
          doStuff(msg);
        });
      } catch (Exception e) {
        //do nothing if you get an error
      }


//        CertStream.onMessage(msg -> System.out.println(new Gson().toJson(msg)));
//        System.out.println( "Hello World!" );
    }

    public static void doStuff(String msg) {
      System.out.println(msg);
    }
}
