import java.io.IOException;

/**
 * Created by Marc on 2/10/2016.
 */
public class ClientMain {
    public static void main(String[] args)throws IOException{
        ChatClient cl = new ChatClient("localhost", 4444);

        cl.start();
    }
}
