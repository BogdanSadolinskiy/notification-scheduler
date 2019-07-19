package spark.starter;

import spark.Spark;

public class App 
{
    public static void main( String[] args ) {
        Spark.port(80);


        Spark.get("/", (req, res) -> "{\"msg\":\"Hello, World!\"}");

        Spark.get("/stop", (req, res) -> {
            Spark.stop();
            return "{\"msg\":\"Bye!\"}";
        });
    }
}
