import java.io.IOException;

/**
 * Created by Marc on 2/10/2016.
 */
public class ServerMain {
    public static void main(String[] args) throws IOException{
        ChatServer sv= new ChatServer(4444);
        sv.open();
    }
}
