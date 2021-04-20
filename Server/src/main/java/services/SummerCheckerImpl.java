package services;

import io.grpc.stub.StreamObserver;
import proto.SummerCheckerGrpc;
import proto.ZodiacChecker;

public class SummerCheckerImpl extends SummerCheckerGrpc.SummerCheckerImplBase {
    @Override
    public void giveInfoSummer (ZodiacChecker.ZodiacRequest request, StreamObserver<ZodiacChecker.ZodiacReply> response) {
        //ZodiacChecker.ZodiacReply reply = ZodiacChecker.ZodiacReply.newBuilder().setResult();
    }

}
