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
public final class SpringCheckerGrpc {

  private SpringCheckerGrpc() {}

  public static final String SERVICE_NAME = "SpringChecker";

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
    if ((getGiveInfoMethod = SpringCheckerGrpc.getGiveInfoMethod) == null) {
      synchronized (SpringCheckerGrpc.class) {
        if ((getGiveInfoMethod = SpringCheckerGrpc.getGiveInfoMethod) == null) {
          SpringCheckerGrpc.getGiveInfoMethod = getGiveInfoMethod = 
              io.grpc.MethodDescriptor.<proto.ZodiacChecker.ZodiacRequest, proto.ZodiacChecker.ZodiacReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SpringChecker", "GiveInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ZodiacChecker.ZodiacRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ZodiacChecker.ZodiacReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SpringCheckerMethodDescriptorSupplier("GiveInfo"))
                  .build();
          }
        }
     }
     return getGiveInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpringCheckerStub newStub(io.grpc.Channel channel) {
    return new SpringCheckerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpringCheckerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpringCheckerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpringCheckerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpringCheckerFutureStub(channel);
  }

  /**
   */
  public static abstract class SpringCheckerImplBase implements io.grpc.BindableService {

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
  public static final class SpringCheckerStub extends io.grpc.stub.AbstractStub<SpringCheckerStub> {
    private SpringCheckerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpringCheckerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpringCheckerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpringCheckerStub(channel, callOptions);
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
  public static final class SpringCheckerBlockingStub extends io.grpc.stub.AbstractStub<SpringCheckerBlockingStub> {
    private SpringCheckerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpringCheckerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpringCheckerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpringCheckerBlockingStub(channel, callOptions);
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
  public static final class SpringCheckerFutureStub extends io.grpc.stub.AbstractStub<SpringCheckerFutureStub> {
    private SpringCheckerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpringCheckerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpringCheckerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpringCheckerFutureStub(channel, callOptions);
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
    private final SpringCheckerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpringCheckerImplBase serviceImpl, int methodId) {
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

  private static abstract class SpringCheckerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpringCheckerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ZodiacChecker.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpringChecker");
    }
  }

  private static final class SpringCheckerFileDescriptorSupplier
      extends SpringCheckerBaseDescriptorSupplier {
    SpringCheckerFileDescriptorSupplier() {}
  }

  private static final class SpringCheckerMethodDescriptorSupplier
      extends SpringCheckerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpringCheckerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpringCheckerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpringCheckerFileDescriptorSupplier())
              .addMethod(getGiveInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
