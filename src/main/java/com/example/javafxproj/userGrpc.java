package com.example.javafxproj;

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
    comments = "Source: user.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.LoginRequest,
      com.example.javafxproj.User.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.example.javafxproj.User.LoginRequest.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.LoginRequest,
      com.example.javafxproj.User.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.LoginRequest, com.example.javafxproj.User.APIResponse> getLoginMethod;
    if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
          userGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.LoginRequest, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.example.javafxproj.User.Empty.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
          userGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.instrument,
      com.example.javafxproj.User.APIResponse> getAddInstrumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addInstrument",
      requestType = com.example.javafxproj.User.instrument.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.instrument,
      com.example.javafxproj.User.APIResponse> getAddInstrumentMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.instrument, com.example.javafxproj.User.APIResponse> getAddInstrumentMethod;
    if ((getAddInstrumentMethod = userGrpc.getAddInstrumentMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getAddInstrumentMethod = userGrpc.getAddInstrumentMethod) == null) {
          userGrpc.getAddInstrumentMethod = getAddInstrumentMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.instrument, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "addInstrument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.instrument.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("addInstrument"))
                  .build();
          }
        }
     }
     return getAddInstrumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getInitialiseDCVIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialiseDCVI",
      requestType = com.example.javafxproj.User.Empty.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getInitialiseDCVIMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse> getInitialiseDCVIMethod;
    if ((getInitialiseDCVIMethod = userGrpc.getInitialiseDCVIMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getInitialiseDCVIMethod = userGrpc.getInitialiseDCVIMethod) == null) {
          userGrpc.getInitialiseDCVIMethod = getInitialiseDCVIMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "initialiseDCVI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("initialiseDCVI"))
                  .build();
          }
        }
     }
     return getInitialiseDCVIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getInitialiseDigitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialiseDigital",
      requestType = com.example.javafxproj.User.Empty.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getInitialiseDigitalMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse> getInitialiseDigitalMethod;
    if ((getInitialiseDigitalMethod = userGrpc.getInitialiseDigitalMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getInitialiseDigitalMethod = userGrpc.getInitialiseDigitalMethod) == null) {
          userGrpc.getInitialiseDigitalMethod = getInitialiseDigitalMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "initialiseDigital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("initialiseDigital"))
                  .build();
          }
        }
     }
     return getInitialiseDigitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getInitialiseHybridMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialiseHybrid",
      requestType = com.example.javafxproj.User.Empty.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getInitialiseHybridMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse> getInitialiseHybridMethod;
    if ((getInitialiseHybridMethod = userGrpc.getInitialiseHybridMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getInitialiseHybridMethod = userGrpc.getInitialiseHybridMethod) == null) {
          userGrpc.getInitialiseHybridMethod = getInitialiseHybridMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "initialiseHybrid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("initialiseHybrid"))
                  .build();
          }
        }
     }
     return getInitialiseHybridMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getInitialiseAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialiseAll",
      requestType = com.example.javafxproj.User.Empty.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.APIResponse> getInitialiseAllMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse> getInitialiseAllMethod;
    if ((getInitialiseAllMethod = userGrpc.getInitialiseAllMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getInitialiseAllMethod = userGrpc.getInitialiseAllMethod) == null) {
          userGrpc.getInitialiseAllMethod = getInitialiseAllMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.Empty, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "initialiseAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("initialiseAll"))
                  .build();
          }
        }
     }
     return getInitialiseAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.typename,
      com.example.javafxproj.User.APIResponse> getInitialiseIndividuallyInSequenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialiseIndividuallyInSequence",
      requestType = com.example.javafxproj.User.typename.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.typename,
      com.example.javafxproj.User.APIResponse> getInitialiseIndividuallyInSequenceMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.typename, com.example.javafxproj.User.APIResponse> getInitialiseIndividuallyInSequenceMethod;
    if ((getInitialiseIndividuallyInSequenceMethod = userGrpc.getInitialiseIndividuallyInSequenceMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getInitialiseIndividuallyInSequenceMethod = userGrpc.getInitialiseIndividuallyInSequenceMethod) == null) {
          userGrpc.getInitialiseIndividuallyInSequenceMethod = getInitialiseIndividuallyInSequenceMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.typename, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "initialiseIndividuallyInSequence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.typename.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("initialiseIndividuallyInSequence"))
                  .build();
          }
        }
     }
     return getInitialiseIndividuallyInSequenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.typename,
      com.example.javafxproj.User.APIResponse> getInitialiseInParallelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialiseInParallel",
      requestType = com.example.javafxproj.User.typename.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.typename,
      com.example.javafxproj.User.APIResponse> getInitialiseInParallelMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.typename, com.example.javafxproj.User.APIResponse> getInitialiseInParallelMethod;
    if ((getInitialiseInParallelMethod = userGrpc.getInitialiseInParallelMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getInitialiseInParallelMethod = userGrpc.getInitialiseInParallelMethod) == null) {
          userGrpc.getInitialiseInParallelMethod = getInitialiseInParallelMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.typename, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "initialiseInParallel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.typename.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("initialiseInParallel"))
                  .build();
          }
        }
     }
     return getInitialiseInParallelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.instrument> getExportJsonFromServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exportJsonFromServer",
      requestType = com.example.javafxproj.User.Empty.class,
      responseType = com.example.javafxproj.User.instrument.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty,
      com.example.javafxproj.User.instrument> getExportJsonFromServerMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.Empty, com.example.javafxproj.User.instrument> getExportJsonFromServerMethod;
    if ((getExportJsonFromServerMethod = userGrpc.getExportJsonFromServerMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getExportJsonFromServerMethod = userGrpc.getExportJsonFromServerMethod) == null) {
          userGrpc.getExportJsonFromServerMethod = getExportJsonFromServerMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.Empty, com.example.javafxproj.User.instrument>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "user", "exportJsonFromServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.instrument.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("exportJsonFromServer"))
                  .build();
          }
        }
     }
     return getExportJsonFromServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.inputParameters,
      com.example.javafxproj.User.APIResponse> getBurnDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "burnData",
      requestType = com.example.javafxproj.User.inputParameters.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.inputParameters,
      com.example.javafxproj.User.APIResponse> getBurnDataMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.inputParameters, com.example.javafxproj.User.APIResponse> getBurnDataMethod;
    if ((getBurnDataMethod = userGrpc.getBurnDataMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getBurnDataMethod = userGrpc.getBurnDataMethod) == null) {
          userGrpc.getBurnDataMethod = getBurnDataMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.inputParameters, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "burnData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.inputParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("burnData"))
                  .build();
          }
        }
     }
     return getBurnDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.javafxproj.User.inputParameters,
      com.example.javafxproj.User.APIResponse> getValidateDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validateData",
      requestType = com.example.javafxproj.User.inputParameters.class,
      responseType = com.example.javafxproj.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.javafxproj.User.inputParameters,
      com.example.javafxproj.User.APIResponse> getValidateDataMethod() {
    io.grpc.MethodDescriptor<com.example.javafxproj.User.inputParameters, com.example.javafxproj.User.APIResponse> getValidateDataMethod;
    if ((getValidateDataMethod = userGrpc.getValidateDataMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getValidateDataMethod = userGrpc.getValidateDataMethod) == null) {
          userGrpc.getValidateDataMethod = getValidateDataMethod = 
              io.grpc.MethodDescriptor.<com.example.javafxproj.User.inputParameters, com.example.javafxproj.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "validateData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.inputParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.javafxproj.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("validateData"))
                  .build();
          }
        }
     }
     return getValidateDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.example.javafxproj.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void addInstrument(com.example.javafxproj.User.instrument request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddInstrumentMethod(), responseObserver);
    }

    /**
     */
    public void initialiseDCVI(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialiseDCVIMethod(), responseObserver);
    }

    /**
     */
    public void initialiseDigital(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialiseDigitalMethod(), responseObserver);
    }

    /**
     */
    public void initialiseHybrid(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialiseHybridMethod(), responseObserver);
    }

    /**
     */
    public void initialiseAll(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialiseAllMethod(), responseObserver);
    }

    /**
     */
    public void initialiseIndividuallyInSequence(com.example.javafxproj.User.typename request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialiseIndividuallyInSequenceMethod(), responseObserver);
    }

    /**
     */
    public void initialiseInParallel(com.example.javafxproj.User.typename request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialiseInParallelMethod(), responseObserver);
    }

    /**
     */
    public void exportJsonFromServer(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.instrument> responseObserver) {
      asyncUnimplementedUnaryCall(getExportJsonFromServerMethod(), responseObserver);
    }

    /**
     */
    public void burnData(com.example.javafxproj.User.inputParameters request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBurnDataMethod(), responseObserver);
    }

    /**
     */
    public void validateData(com.example.javafxproj.User.inputParameters request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.LoginRequest,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.Empty,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getAddInstrumentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.instrument,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_ADD_INSTRUMENT)))
          .addMethod(
            getInitialiseDCVIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.Empty,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_INITIALISE_DCVI)))
          .addMethod(
            getInitialiseDigitalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.Empty,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_INITIALISE_DIGITAL)))
          .addMethod(
            getInitialiseHybridMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.Empty,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_INITIALISE_HYBRID)))
          .addMethod(
            getInitialiseAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.Empty,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_INITIALISE_ALL)))
          .addMethod(
            getInitialiseIndividuallyInSequenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.typename,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_INITIALISE_INDIVIDUALLY_IN_SEQUENCE)))
          .addMethod(
            getInitialiseInParallelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.typename,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_INITIALISE_IN_PARALLEL)))
          .addMethod(
            getExportJsonFromServerMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.javafxproj.User.Empty,
                com.example.javafxproj.User.instrument>(
                  this, METHODID_EXPORT_JSON_FROM_SERVER)))
          .addMethod(
            getBurnDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.inputParameters,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_BURN_DATA)))
          .addMethod(
            getValidateDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.javafxproj.User.inputParameters,
                com.example.javafxproj.User.APIResponse>(
                  this, METHODID_VALIDATE_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void login(com.example.javafxproj.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addInstrument(com.example.javafxproj.User.instrument request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddInstrumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initialiseDCVI(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialiseDCVIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initialiseDigital(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialiseDigitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initialiseHybrid(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialiseHybridMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initialiseAll(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialiseAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initialiseIndividuallyInSequence(com.example.javafxproj.User.typename request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialiseIndividuallyInSequenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initialiseInParallel(com.example.javafxproj.User.typename request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialiseInParallelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exportJsonFromServer(com.example.javafxproj.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.instrument> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getExportJsonFromServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burnData(com.example.javafxproj.User.inputParameters request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBurnDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateData(com.example.javafxproj.User.inputParameters request,
        io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse login(com.example.javafxproj.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse logout(com.example.javafxproj.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse addInstrument(com.example.javafxproj.User.instrument request) {
      return blockingUnaryCall(
          getChannel(), getAddInstrumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse initialiseDCVI(com.example.javafxproj.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialiseDCVIMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse initialiseDigital(com.example.javafxproj.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialiseDigitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse initialiseHybrid(com.example.javafxproj.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialiseHybridMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse initialiseAll(com.example.javafxproj.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialiseAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse initialiseIndividuallyInSequence(com.example.javafxproj.User.typename request) {
      return blockingUnaryCall(
          getChannel(), getInitialiseIndividuallyInSequenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse initialiseInParallel(com.example.javafxproj.User.typename request) {
      return blockingUnaryCall(
          getChannel(), getInitialiseInParallelMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.javafxproj.User.instrument> exportJsonFromServer(
        com.example.javafxproj.User.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getExportJsonFromServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse burnData(com.example.javafxproj.User.inputParameters request) {
      return blockingUnaryCall(
          getChannel(), getBurnDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.javafxproj.User.APIResponse validateData(com.example.javafxproj.User.inputParameters request) {
      return blockingUnaryCall(
          getChannel(), getValidateDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> login(
        com.example.javafxproj.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> logout(
        com.example.javafxproj.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> addInstrument(
        com.example.javafxproj.User.instrument request) {
      return futureUnaryCall(
          getChannel().newCall(getAddInstrumentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> initialiseDCVI(
        com.example.javafxproj.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialiseDCVIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> initialiseDigital(
        com.example.javafxproj.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialiseDigitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> initialiseHybrid(
        com.example.javafxproj.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialiseHybridMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> initialiseAll(
        com.example.javafxproj.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialiseAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> initialiseIndividuallyInSequence(
        com.example.javafxproj.User.typename request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialiseIndividuallyInSequenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> initialiseInParallel(
        com.example.javafxproj.User.typename request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialiseInParallelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> burnData(
        com.example.javafxproj.User.inputParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getBurnDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.javafxproj.User.APIResponse> validateData(
        com.example.javafxproj.User.inputParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_ADD_INSTRUMENT = 2;
  private static final int METHODID_INITIALISE_DCVI = 3;
  private static final int METHODID_INITIALISE_DIGITAL = 4;
  private static final int METHODID_INITIALISE_HYBRID = 5;
  private static final int METHODID_INITIALISE_ALL = 6;
  private static final int METHODID_INITIALISE_INDIVIDUALLY_IN_SEQUENCE = 7;
  private static final int METHODID_INITIALISE_IN_PARALLEL = 8;
  private static final int METHODID_EXPORT_JSON_FROM_SERVER = 9;
  private static final int METHODID_BURN_DATA = 10;
  private static final int METHODID_VALIDATE_DATA = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.example.javafxproj.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.example.javafxproj.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_ADD_INSTRUMENT:
          serviceImpl.addInstrument((com.example.javafxproj.User.instrument) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_INITIALISE_DCVI:
          serviceImpl.initialiseDCVI((com.example.javafxproj.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_INITIALISE_DIGITAL:
          serviceImpl.initialiseDigital((com.example.javafxproj.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_INITIALISE_HYBRID:
          serviceImpl.initialiseHybrid((com.example.javafxproj.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_INITIALISE_ALL:
          serviceImpl.initialiseAll((com.example.javafxproj.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_INITIALISE_INDIVIDUALLY_IN_SEQUENCE:
          serviceImpl.initialiseIndividuallyInSequence((com.example.javafxproj.User.typename) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_INITIALISE_IN_PARALLEL:
          serviceImpl.initialiseInParallel((com.example.javafxproj.User.typename) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_EXPORT_JSON_FROM_SERVER:
          serviceImpl.exportJsonFromServer((com.example.javafxproj.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.instrument>) responseObserver);
          break;
        case METHODID_BURN_DATA:
          serviceImpl.burnData((com.example.javafxproj.User.inputParameters) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_DATA:
          serviceImpl.validateData((com.example.javafxproj.User.inputParameters) request,
              (io.grpc.stub.StreamObserver<com.example.javafxproj.User.APIResponse>) responseObserver);
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

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.javafxproj.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
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
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getAddInstrumentMethod())
              .addMethod(getInitialiseDCVIMethod())
              .addMethod(getInitialiseDigitalMethod())
              .addMethod(getInitialiseHybridMethod())
              .addMethod(getInitialiseAllMethod())
              .addMethod(getInitialiseIndividuallyInSequenceMethod())
              .addMethod(getInitialiseInParallelMethod())
              .addMethod(getExportJsonFromServerMethod())
              .addMethod(getBurnDataMethod())
              .addMethod(getValidateDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
