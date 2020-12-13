// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoginRequest.proto

package com.example.demo.protobean;

public final class LoginRequestOuterClass {
  private LoginRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface LoginRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.didastudy.proto.LoginRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string username = 1;</code>
     */
    String getUsername();
    /**
     * <code>optional string username = 1;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>optional string pwd = 2;</code>
     */
    String getPwd();
    /**
     * <code>optional string pwd = 2;</code>
     */
    com.google.protobuf.ByteString
        getPwdBytes();
  }
  /**
   * <pre>
   *登录请求结构体
   * </pre>
   *
   * Protobuf type {@code LoginRequest}
   */
  public  static final class LoginRequest extends
      com.google.protobuf.GeneratedMessageLite<
          LoginRequest, LoginRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:com.example.didastudy.proto.LoginRequest)
      LoginRequestOrBuilder {
    private LoginRequest() {
      username_ = "";
      pwd_ = "";
    }
    public static final int USERNAME_FIELD_NUMBER = 1;
    private String username_;
    /**
     * <code>optional string username = 1;</code>
     */
    public String getUsername() {
      return username_;
    }
    /**
     * <code>optional string username = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(username_);
    }
    /**
     * <code>optional string username = 1;</code>
     */
    private void setUsername(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
    }
    /**
     * <code>optional string username = 1;</code>
     */
    private void clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
    }
    /**
     * <code>optional string username = 1;</code>
     */
    private void setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value.toStringUtf8();
    }

    public static final int PWD_FIELD_NUMBER = 2;
    private String pwd_;
    /**
     * <code>optional string pwd = 2;</code>
     */
    public String getPwd() {
      return pwd_;
    }
    /**
     * <code>optional string pwd = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPwdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(pwd_);
    }
    /**
     * <code>optional string pwd = 2;</code>
     */
    private void setPwd(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pwd_ = value;
    }
    /**
     * <code>optional string pwd = 2;</code>
     */
    private void clearPwd() {
      
      pwd_ = getDefaultInstance().getPwd();
    }
    /**
     * <code>optional string pwd = 2;</code>
     */
    private void setPwdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pwd_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!username_.isEmpty()) {
        output.writeString(1, getUsername());
      }
      if (!pwd_.isEmpty()) {
        output.writeString(2, getPwd());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!username_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getUsername());
      }
      if (!pwd_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getPwd());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static LoginRequestOuterClass.LoginRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static LoginRequestOuterClass.LoginRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static LoginRequestOuterClass.LoginRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static LoginRequestOuterClass.LoginRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static LoginRequestOuterClass.LoginRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static LoginRequestOuterClass.LoginRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static LoginRequestOuterClass.LoginRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static LoginRequestOuterClass.LoginRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static LoginRequestOuterClass.LoginRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static LoginRequestOuterClass.LoginRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder( LoginRequestOuterClass.LoginRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     *登录请求结构体
     * </pre>
     *
     * Protobuf type {@code LoginRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          LoginRequestOuterClass.LoginRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.didastudy.proto.LoginRequest)
        LoginRequestOuterClass.LoginRequestOrBuilder {
      // Construct using LoginRequestOuterClass.LoginRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string username = 1;</code>
       */
      public String getUsername() {
        return instance.getUsername();
      }
      /**
       * <code>optional string username = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        return instance.getUsernameBytes();
      }
      /**
       * <code>optional string username = 1;</code>
       */
      public Builder setUsername(
          String value) {
        copyOnWrite();
        instance.setUsername(value);
        return this;
      }
      /**
       * <code>optional string username = 1;</code>
       */
      public Builder clearUsername() {
        copyOnWrite();
        instance.clearUsername();
        return this;
      }
      /**
       * <code>optional string username = 1;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setUsernameBytes(value);
        return this;
      }

      /**
       * <code>optional string pwd = 2;</code>
       */
      public String getPwd() {
        return instance.getPwd();
      }
      /**
       * <code>optional string pwd = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPwdBytes() {
        return instance.getPwdBytes();
      }
      /**
       * <code>optional string pwd = 2;</code>
       */
      public Builder setPwd(
          String value) {
        copyOnWrite();
        instance.setPwd(value);
        return this;
      }
      /**
       * <code>optional string pwd = 2;</code>
       */
      public Builder clearPwd() {
        copyOnWrite();
        instance.clearPwd();
        return this;
      }
      /**
       * <code>optional string pwd = 2;</code>
       */
      public Builder setPwdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPwdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.example.didastudy.proto.LoginRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new LoginRequestOuterClass.LoginRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          LoginRequestOuterClass.LoginRequest other = ( LoginRequestOuterClass.LoginRequest) arg1;
          username_ = visitor.visitString(!username_.isEmpty(), username_,
              !other.username_.isEmpty(), other.username_);
          pwd_ = visitor.visitString(!pwd_.isEmpty(), pwd_,
              !other.pwd_.isEmpty(), other.pwd_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  String s = input.readStringRequireUtf8();

                  username_ = s;
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  pwd_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized ( LoginRequestOuterClass.LoginRequest.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.example.didastudy.proto.LoginRequest)
    private static final LoginRequestOuterClass.LoginRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LoginRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static LoginRequestOuterClass.LoginRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<LoginRequest> PARSER;

    public static com.google.protobuf.Parser<LoginRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface LoginResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.didastudy.proto.LoginResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional int32 code = 1;</code>
     */
    int getCode();

    /**
     * <code>optional string msg = 2;</code>
     */
    String getMsg();
    /**
     * <code>optional string msg = 2;</code>
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * <pre>
   *登录响应结构体
   * </pre>
   *
   * Protobuf type {@code LoginResponse}
   */
  public  static final class LoginResponse extends
      com.google.protobuf.GeneratedMessageLite<
          LoginResponse, LoginResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:com.example.didastudy.proto.LoginResponse)
      LoginResponseOrBuilder {
    private LoginResponse() {
      msg_ = "";
    }
    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <code>optional int32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <code>optional int32 code = 1;</code>
     */
    private void setCode(int value) {
      
      code_ = value;
    }
    /**
     * <code>optional int32 code = 1;</code>
     */
    private void clearCode() {
      
      code_ = 0;
    }

    public static final int MSG_FIELD_NUMBER = 2;
    private String msg_;
    /**
     * <code>optional string msg = 2;</code>
     */
    public String getMsg() {
      return msg_;
    }
    /**
     * <code>optional string msg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(msg_);
    }
    /**
     * <code>optional string msg = 2;</code>
     */
    private void setMsg(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg_ = value;
    }
    /**
     * <code>optional string msg = 2;</code>
     */
    private void clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
    }
    /**
     * <code>optional string msg = 2;</code>
     */
    private void setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (code_ != 0) {
        output.writeInt32(1, code_);
      }
      if (!msg_.isEmpty()) {
        output.writeString(2, getMsg());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (code_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, code_);
      }
      if (!msg_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getMsg());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static LoginRequestOuterClass.LoginResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static LoginRequestOuterClass.LoginResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static LoginRequestOuterClass.LoginResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static LoginRequestOuterClass.LoginResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static LoginRequestOuterClass.LoginResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static LoginRequestOuterClass.LoginResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static LoginRequestOuterClass.LoginResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static LoginRequestOuterClass.LoginResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static LoginRequestOuterClass.LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static LoginRequestOuterClass.LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder( LoginRequestOuterClass.LoginResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     *登录响应结构体
     * </pre>
     *
     * Protobuf type {@code LoginResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          LoginRequestOuterClass.LoginResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.didastudy.proto.LoginResponse)
        LoginRequestOuterClass.LoginResponseOrBuilder {
      // Construct using LoginRequestOuterClass.LoginResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional int32 code = 1;</code>
       */
      public int getCode() {
        return instance.getCode();
      }
      /**
       * <code>optional int32 code = 1;</code>
       */
      public Builder setCode(int value) {
        copyOnWrite();
        instance.setCode(value);
        return this;
      }
      /**
       * <code>optional int32 code = 1;</code>
       */
      public Builder clearCode() {
        copyOnWrite();
        instance.clearCode();
        return this;
      }

      /**
       * <code>optional string msg = 2;</code>
       */
      public String getMsg() {
        return instance.getMsg();
      }
      /**
       * <code>optional string msg = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        return instance.getMsgBytes();
      }
      /**
       * <code>optional string msg = 2;</code>
       */
      public Builder setMsg(
          String value) {
        copyOnWrite();
        instance.setMsg(value);
        return this;
      }
      /**
       * <code>optional string msg = 2;</code>
       */
      public Builder clearMsg() {
        copyOnWrite();
        instance.clearMsg();
        return this;
      }
      /**
       * <code>optional string msg = 2;</code>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setMsgBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.example.didastudy.proto.LoginResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new LoginRequestOuterClass.LoginResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          LoginRequestOuterClass.LoginResponse other = ( LoginRequestOuterClass.LoginResponse) arg1;
          code_ = visitor.visitInt(code_ != 0, code_,
              other.code_ != 0, other.code_);
          msg_ = visitor.visitString(!msg_.isEmpty(), msg_,
              !other.msg_.isEmpty(), other.msg_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 8: {

                  code_ = input.readInt32();
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  msg_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (LoginRequestOuterClass.LoginResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.example.didastudy.proto.LoginResponse)
    private static final LoginRequestOuterClass.LoginResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LoginResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static  LoginRequestOuterClass.LoginResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<LoginResponse> PARSER;

    public static com.google.protobuf.Parser<LoginResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}