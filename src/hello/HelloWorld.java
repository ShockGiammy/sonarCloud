package hello;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {
   public static void main(String[] args) {
	   Logger.getLogger("test").log(Level.INFO, "Hello World!");
   }
}