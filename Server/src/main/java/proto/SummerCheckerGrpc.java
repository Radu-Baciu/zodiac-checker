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
public final class SummerCheckerGrpc {

  private SummerCheckerGrpc() {}

  public static final String SERVICE_NAME = "SummerChecker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ZodiacChecker.ZodiacRequest,
      proto.ZodiacChecker.ZodiacReply> getGiveInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiveInfo",
      requestType = proto.ZodiacChecker.ZodiacRequest.class,
      responseType = proto.ZodiacChecker.ZodiacReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ZodiacChecker.ZodiacRequest,
      proto.ZodiacChecker.ZodiacReply> getGiveInfoMethod() {
    io.grpc.MethodDescriptor<proto.ZodiacChecker.ZodiacRequest, proto.ZodiacChecker.ZodiacReply> getGiveInfoMethod;
    if ((getGiveInfoMethod = SummerCheckerGrpc.getGiveInfoMethod) == null) {
      synchronized (SummerCheckerGrpc.class) {
        if ((getGiveInfoMethod = SummerCheckerGrpc.getGiveInfoMethod) == null) {
          SummerCheckerGrpc.getGiveInfoMethod = getGiveInfoMethod = 
              io.grpc.MethodDescriptor.<proto.ZodiacChecker.ZodiacRequest, proto.ZodiacChecker.ZodiacReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SummerChecker", "GiveInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ZodiacChecker.ZodiacRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ZodiacChecker.ZodiacReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SummerCheckerMethodDescriptorSupplier("GiveInfo"))
                  .build();
          }
        }
     }
     return getGiveInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SummerCheckerStub newStub(io.grpc.Channel channel) {
    return new SummerCheckerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SummerCheckerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SummerCheckerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SummerCheckerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SummerCheckerFutureStub(channel);
  }

  /**
   */
  public static abstract class SummerCheckerImplBase implements io.grpc.BindableService {

    /**
     */
    public void giveInfo(proto.ZodiacChecker.ZodiacRequest request,
        io.grpc.stub.StreamObserver<proto.ZodiacChecker.ZodiacReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGiveInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGiveInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ZodiacChecker.ZodiacRequest,
                proto.ZodiacChecker.ZodiacReply>(
                  this, METHODID_GIVE_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class SummerCheckerStub extends io.grpc.stub.AbstractStub<SummerCheckerStub> {
    private SummerCheckerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummerCheckerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummerCheckerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummerCheckerStub(channel, callOptions);
    }

    /**
     */
    public void giveInfo(proto.ZodiacChecker.ZodiacRequest request,
        io.grpc.stub.StreamObserver<proto.ZodiacChecker.ZodiacReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGiveInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SummerCheckerBlockingStub extends io.grpc.stub.AbstractStub<SummerCheckerBlockingStub> {
    private SummerCheckerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummerCheckerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummerCheckerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummerCheckerBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ZodiacChecker.ZodiacReply giveInfo(proto.ZodiacChecker.ZodiacRequest request) {
      return blockingUnaryCall(
          getChannel(), getGiveInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SummerCheckerFutureStub extends io.grpc.stub.AbstractStub<SummerCheckerFutureStub> {
    private SummerCheckerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummerCheckerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummerCheckerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummerCheckerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ZodiacChecker.ZodiacReply> giveInfo(
        proto.ZodiacChecker.ZodiacRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGiveInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GIVE_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SummerCheckerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SummerCheckerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GIVE_INFO:
          serviceImpl.giveInfo((proto.ZodiacChecker.ZodiacRequest) request,
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

  private static abstract class SummerCheckerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SummerCheckerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ZodiacChecker.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SummerChecker");
    }
  }

  private static final class SummerCheckerFileDescriptorSupplier
      extends SummerCheckerBaseDescriptorSupplier {
    SummerCheckerFileDescriptorSupplier() {}
  }

  private static final class SummerCheckerMethodDescriptorSupplier
      extends SummerCheckerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SummerCheckerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SummerCheckerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SummerCheckerFileDescriptorSupplier())
              .addMethod(getGiveInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
