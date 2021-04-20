package services;

import io.grpc.stub.StreamObserver;
import proto.AutumnCheckerGrpc;
import proto.ZodiacChecker;

public class AutumnCheckerImpl extends AutumnCheckerGrpc.AutumnCheckerImplBase {
    @Override
    public void giveInfoAutumn (ZodiacChecker.ZodiacRequest request, StreamObserver<ZodiacChecker.ZodiacReply> response) {
        //ZodiacChecker.ZodiacReply reply = ZodiacChecker.ZodiacReply.newBuilder().setResult();
    }

}
