// HelloFunctional
import java.util.function.BiConsumer;

public class HelloFunctional {
    public static void main(String[] args) {
        BiConsumer<String, String> introduce =
            (nim, name) -> System.out.println("Hello World, I am " + name + " - " + nim);

<<<<<<< HEAD
        introduce.accept("240202847","Naufal Zaky");
=======
        introduce.accept("240202874", "Naufal Zaky");
>>>>>>> 9c5669a55c5d7c9a2e266ca1bec738c6b8ea1677
    }
}