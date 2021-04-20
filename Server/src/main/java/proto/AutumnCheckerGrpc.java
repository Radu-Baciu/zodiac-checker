package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ZodiacChecker.proto")
public final class AutumnCheckerGrpc {

  private AutumnCheckerGrpc() {}

  public static final String SERVICE_NAME = "AutumnChecker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ZodiacChecker.ZodiacRequest,
      proto.ZodiacChecker.ZodiacReply> getGiveInfoAutumnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiveInfoAutumn",
      requestType = proto.ZodiacChecker.ZodiacRequest.class,
      responseType = proto.ZodiacChecker.ZodiacReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ZodiacChecker.ZodiacRequest,
      proto.ZodiacChecker.ZodiacReply> getGiveInfoAutumnMethod() {
    io.grpc.MethodDescriptor<proto.ZodiacChecker.ZodiacRequest, proto.ZodiacChecker.ZodiacReply> getGiveInfoAutumnMethod;
    if ((getGiveInfoAutumnMethod = AutumnCheckerGrpc.getGiveInfoAutumnMethod) == null) {
      synchronized (AutumnCheckerGrpc.class) {
        if ((getGiveInfoAutumnMethod = AutumnCheckerGrpc.getGiveInfoAutumnMethod) == null) {
          AutumnCheckerGrpc.getGiveInfoAutumnMethod = getGiveInfoAutumnMethod = 
              io.grpc.MethodDescriptor.<proto.ZodiacChecker.ZodiacRequest, proto.ZodiacChecker.ZodiacReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AutumnChecker", "GiveInfoAutumn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ZodiacChecker.ZodiacRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ZodiacChecker.ZodiacReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AutumnCheckerMethodDescriptorSupplier("GiveInfoAutumn"))
                  .build();
          }
        }
     }
     return getGiveInfoAutumnMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AutumnCheckerStub newStub(io.grpc.Channel channel) {
    return new AutumnCheckerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AutumnCheckerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AutumnCheckerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AutumnCheckerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AutumnCheckerFutureStub(channel);
  }

  /**
   */
  public static abstract class AutumnCheckerImplBase implements io.grpc.BindableService {

    /**
     */
    public void giveInfoAutumn(proto.ZodiacChecker.ZodiacRequest request,
        io.grpc.stub.StreamObserver<proto.ZodiacChecker.ZodiacReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGiveInfoAutumnMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGiveInfoAutumnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ZodiacChecker.ZodiacRequest,
                proto.ZodiacChecker.ZodiacReply>(
                  this, METHODID_GIVE_INFO_AUTUMN)))
          .build();
    }
  }

  /**
   */
  public static final class AutumnCheckerStub extends io.grpc.stub.AbstractStub<AutumnCheckerStub> {
    private AutumnCheckerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AutumnCheckerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutumnCheckerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AutumnCheckerStub(channel, callOptions);
    }

    /**
     */
    public void giveInfoAutumn(proto.ZodiacChecker.ZodiacRequest request,
        io.grpc.stub.StreamObserver<proto.ZodiacChecker.ZodiacReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGiveInfoAutumnMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AutumnCheckerBlockingStub extends io.grpc.stub.AbstractStub<AutumnCheckerBlockingStub> {
    private AutumnCheckerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AutumnCheckerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutumnCheckerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AutumnCheckerBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ZodiacChecker.ZodiacReply giveInfoAutumn(proto.ZodiacChecker.ZodiacRequest request) {
      return blockingUnaryCall(
          getChannel(), getGiveInfoAutumnMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AutumnCheckerFutureStub extends io.grpc.stub.AbstractStub<AutumnCheckerFutureStub> {
    private AutumnCheckerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AutumnCheckerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutumnCheckerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AutumnCheckerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ZodiacChecker.ZodiacReply> giveInfoAutumn(
        proto.ZodiacChecker.ZodiacRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGiveInfoAutumnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GIVE_INFO_AUTUMN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AutumnCheckerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AutumnCheckerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GIVE_INFO_AUTUMN:
          serviceImpl.giveInfoAutumn((proto.ZodiacChecker.ZodiacRequest) request,
              (io.grpc.stub.StreamObserver<proto.ZodiacChecker.ZodiacReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AutumnCheckerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AutumnCheckerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ZodiacChecker.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AutumnChecker");
    }
  }

  private static final class AutumnCheckerFileDescriptorSupplier
      extends AutumnCheckerBaseDescriptorSupplier {
    AutumnCheckerFileDescriptorSupplier() {}
  }

  private static final class AutumnCheckerMethodDescriptorSupplier
      extends AutumnCheckerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AutumnCheckerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AutumnCheckerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AutumnCheckerFileDescriptorSupplier())
              .addMethod(getGiveInfoAutumnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
