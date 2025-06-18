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

//Test Class to test the Logger
class Test {
    public static void main(String[] args){
        //First instance of the class
        Logger lgp = Logger.getInstance();

        //Second instance of the class
        Logger lgp1 = Logger.getInstance();

        System.out.println();
        if(lgp == lgp1) //Checking whether the instances are same are not
            System.out.println("Same Instances");
        else
            System.out.println("Different Instances");
        System.out.println();
    }
}