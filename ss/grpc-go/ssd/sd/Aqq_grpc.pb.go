// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.5.0
// source: Aqq.proto

package sd

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// AqqClient is the client API for Aqq service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AqqClient interface {
	SayHello(ctx context.Context, in *HelloRequest, opts ...grpc.CallOption) (*HelloReply, error)
}

type aqqClient struct {
	cc grpc.ClientConnInterface
}

func NewAqqClient(cc grpc.ClientConnInterface) AqqClient {
	return &aqqClient{cc}
}

func (c *aqqClient) SayHello(ctx context.Context, in *HelloRequest, opts ...grpc.CallOption) (*HelloReply, error) {
	out := new(HelloReply)
	err := c.cc.Invoke(ctx, "/ssd.sd.Aqq/SayHello", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AqqServer is the server API for Aqq service.
// All implementations must embed UnimplementedAqqServer
// for forward compatibility
type AqqServer interface {
	SayHello(context.Context, *HelloRequest) (*HelloReply, error)
	mustEmbedUnimplementedAqqServer()
}

// UnimplementedAqqServer must be embedded to have forward compatible implementations.
type UnimplementedAqqServer struct {
}

func (UnimplementedAqqServer) SayHello(context.Context, *HelloRequest) (*HelloReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SayHello not implemented")
}
func (UnimplementedAqqServer) mustEmbedUnimplementedAqqServer() {}

// UnsafeAqqServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AqqServer will
// result in compilation errors.
type UnsafeAqqServer interface {
	mustEmbedUnimplementedAqqServer()
}

func RegisterAqqServer(s grpc.ServiceRegistrar, srv AqqServer) {
	s.RegisterService(&Aqq_ServiceDesc, srv)
}

func _Aqq_SayHello_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(HelloRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AqqServer).SayHello(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssd.sd.Aqq/SayHello",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AqqServer).SayHello(ctx, req.(*HelloRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// Aqq_ServiceDesc is the grpc.ServiceDesc for Aqq service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Aqq_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "ssd.sd.Aqq",
	HandlerType: (*AqqServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "SayHello",
			Handler:    _Aqq_SayHello_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "Aqq.proto",
}