// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.5.0
// source: Aas.proto

package aa

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

// AasClient is the client API for Aas service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AasClient interface {
	SayHello(ctx context.Context, in *HelloRequest, opts ...grpc.CallOption) (*HelloReply, error)
}

type aasClient struct {
	cc grpc.ClientConnInterface
}

func NewAasClient(cc grpc.ClientConnInterface) AasClient {
	return &aasClient{cc}
}

func (c *aasClient) SayHello(ctx context.Context, in *HelloRequest, opts ...grpc.CallOption) (*HelloReply, error) {
	out := new(HelloReply)
	err := c.cc.Invoke(ctx, "/as.aa.Aas/SayHello", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AasServer is the server API for Aas service.
// All implementations must embed UnimplementedAasServer
// for forward compatibility
type AasServer interface {
	SayHello(context.Context, *HelloRequest) (*HelloReply, error)
	mustEmbedUnimplementedAasServer()
}

// UnimplementedAasServer must be embedded to have forward compatible implementations.
type UnimplementedAasServer struct {
}

func (UnimplementedAasServer) SayHello(context.Context, *HelloRequest) (*HelloReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SayHello not implemented")
}
func (UnimplementedAasServer) mustEmbedUnimplementedAasServer() {}

// UnsafeAasServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AasServer will
// result in compilation errors.
type UnsafeAasServer interface {
	mustEmbedUnimplementedAasServer()
}

func RegisterAasServer(s grpc.ServiceRegistrar, srv AasServer) {
	s.RegisterService(&Aas_ServiceDesc, srv)
}

func _Aas_SayHello_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(HelloRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AasServer).SayHello(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/as.aa.Aas/SayHello",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AasServer).SayHello(ctx, req.(*HelloRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// Aas_ServiceDesc is the grpc.ServiceDesc for Aas service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Aas_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "as.aa.Aas",
	HandlerType: (*AasServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "SayHello",
			Handler:    _Aas_SayHello_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "Aas.proto",
}
