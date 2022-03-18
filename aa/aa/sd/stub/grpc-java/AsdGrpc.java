package com.skemaloop.test;

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
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: Asd.proto")
public final class AsdGrpc {

  private AsdGrpc() {}

  public static final String SERVICE_NAME = "aa.sd.Asd";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skemaloop.test.AsdOuterClass.HelloRequest,
      com.skemaloop.test.AsdOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.skemaloop.test.AsdOuterClass.HelloRequest.class,
      responseType = com.skemaloop.test.AsdOuterClass.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skemaloop.test.AsdOuterClass.HelloRequest,
      com.skemaloop.test.AsdOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.skemaloop.test.AsdOuterClass.HelloRequest, com.skemaloop.test.AsdOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = AsdGrpc.getSayHelloMethod) == null) {
      synchronized (AsdGrpc.class) {
        if ((getSayHelloMethod = AsdGrpc.getSayHelloMethod) == null) {
          AsdGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.skemaloop.test.AsdOuterClass.HelloRequest, com.skemaloop.test.AsdOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.AsdOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.AsdOuterClass.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new AsdMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AsdStub newStub(io.grpc.Channel channel) {
    return new AsdStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AsdBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AsdBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AsdFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AsdFutureStub(channel);
  }

  /**
   */
  public static abstract class AsdImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.skemaloop.test.AsdOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.AsdOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skemaloop.test.AsdOuterClass.HelloRequest,
                com.skemaloop.test.AsdOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class AsdStub extends io.grpc.stub.AbstractStub<AsdStub> {
    private AsdStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AsdStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsdStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AsdStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.skemaloop.test.AsdOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.AsdOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AsdBlockingStub extends io.grpc.stub.AbstractStub<AsdBlockingStub> {
    private AsdBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AsdBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsdBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AsdBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skemaloop.test.AsdOuterClass.HelloReply sayHello(com.skemaloop.test.AsdOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AsdFutureStub extends io.grpc.stub.AbstractStub<AsdFutureStub> {
    private AsdFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AsdFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsdFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AsdFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skemaloop.test.AsdOuterClass.HelloReply> sayHello(
        com.skemaloop.test.AsdOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsdImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AsdImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.skemaloop.test.AsdOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.skemaloop.test.AsdOuterClass.HelloReply>) responseObserver);
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

  private static abstract class AsdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AsdBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skemaloop.test.AsdOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Asd");
    }
  }

  private static final class AsdFileDescriptorSupplier
      extends AsdBaseDescriptorSupplier {
    AsdFileDescriptorSupplier() {}
  }

  private static final class AsdMethodDescriptorSupplier
      extends AsdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AsdMethodDescriptorSupplier(String methodName) {
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
      synchronized (AsdGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AsdFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
