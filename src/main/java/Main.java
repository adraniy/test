
import org.apache.log4j.*;

public class Main {

    private   static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("main class Start");
        A a = new A();
        logger.debug("A instance created" + a);
        B b = new B();
        logger.debug("B instance created" + b);
        C c = new C();
        logger.debug("C instance created" +c);

      /*  System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);*/
    }
}
