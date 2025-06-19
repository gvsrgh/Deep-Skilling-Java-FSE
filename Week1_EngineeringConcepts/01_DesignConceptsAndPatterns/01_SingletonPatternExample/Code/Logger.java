//Implementing the Singleton Design Pattern

//Creating the Logger class as per the requirements
public class Logger {

    //Creating private static instance for logger
    private static Logger instance;
    
    //Private constructor for the class
    private Logger(){

    }

    //Method that returns instance of the class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

}