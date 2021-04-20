import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.*;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        try {
            Server server = ServerBuilder.forPort(8999).addService(new SpringCheckerImpl()).addService(new SummerCheckerImpl()).addService(new AutumnCheckerImpl()).addService(new WinterCheckerImpl()).build().start();
            System.out.println("Server started at port " + server.getPort());
            server.awaitTermination();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
    }
}
