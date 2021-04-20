import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.*;

public class Main {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8999).usePlaintext().build();

        AutumnCheckerGrpc.AutumnCheckerBlockingStub autumnStub = AutumnCheckerGrpc.newBlockingStub(channel);
        String date = "09/25/1999";
        ZodiacChecker.ZodiacReply reply = autumnStub.giveInfoAutumn(ZodiacChecker.ZodiacRequest.newBuilder().setDate(date).build());
        System.out.println("Server replied with " + reply);
        channel.shutdown();
    }
}
