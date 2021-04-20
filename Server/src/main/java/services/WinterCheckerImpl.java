package services;

import io.grpc.stub.StreamObserver;
import proto.WinterCheckerGrpc;
import proto.ZodiacChecker;

public class WinterCheckerImpl extends WinterCheckerGrpc.WinterCheckerImplBase {
    @Override
    public void giveInfoWinter (ZodiacChecker.ZodiacRequest request, StreamObserver<ZodiacChecker.ZodiacReply> response) {
        //ZodiacChecker.ZodiacReply reply = ZodiacChecker.ZodiacReply.newBuilder().setResult();
    }

}
