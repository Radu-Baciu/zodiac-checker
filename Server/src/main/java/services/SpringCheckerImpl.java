package services;

import io.grpc.stub.StreamObserver;
import proto.ZodiacChecker;
import proto.SpringCheckerGrpc;

public class SpringCheckerImpl extends SpringCheckerGrpc.SpringCheckerImplBase {
    @Override
    public void giveInfoSpring (ZodiacChecker.ZodiacRequest request, StreamObserver<ZodiacChecker.ZodiacReply> response) {
        //ZodiacChecker.ZodiacReply reply = ZodiacChecker.ZodiacReply.newBuilder().setResult();
    }

}
