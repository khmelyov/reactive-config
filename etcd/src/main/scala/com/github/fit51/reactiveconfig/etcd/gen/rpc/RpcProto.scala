// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.fit51.reactiveconfig.etcd.gen.rpc

object RpcProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.github.fit51.reactiveconfig.etcd.gen.kv.KvProto,
    com.github.fit51.reactiveconfig.etcd.gen.auth.AuthProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.github.fit51.reactiveconfig.etcd.gen.rpc.ResponseHeader,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.RangeRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.RangeResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.PutRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.PutResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.RequestOp,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.ResponseOp,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.Compare,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.TxnRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.TxnResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.CompactionRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.CompactionResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.HashRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.HashResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.SnapshotRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.SnapshotResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.WatchRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.WatchCreateRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.WatchCancelRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.WatchResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.LeaseGrantRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.LeaseGrantResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.LeaseRevokeRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.LeaseRevokeResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.LeaseKeepAliveRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.LeaseKeepAliveResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.LeaseTimeToLiveRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.LeaseTimeToLiveResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.Member,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.MemberAddRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.MemberAddResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.MemberRemoveRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.MemberRemoveResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.MemberUpdateRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.MemberUpdateResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.MemberListRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.MemberListResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.DefragmentRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.DefragmentResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AlarmRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AlarmMember,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AlarmResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.StatusRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.StatusResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthEnableRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthDisableRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthenticateRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserAddRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserGetRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserDeleteRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserChangePasswordRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserGrantRoleRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserRevokeRoleRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleAddRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleGetRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserListRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleListRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleDeleteRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleGrantPermissionRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleRevokePermissionRequest,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthEnableResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthDisableResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthenticateResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserAddResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserGetResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserDeleteResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserChangePasswordResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserGrantRoleResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserRevokeRoleResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleAddResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleGetResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleListResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthUserListResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleDeleteResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleGrantPermissionResponse,
      com.github.fit51.reactiveconfig.etcd.gen.rpc.AuthRoleRevokePermissionResponse
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CglycGMucHJvdG8SDGV0Y2RzZXJ2ZXJwYhoIa3YucHJvdG8aCmF1dGgucHJvdG8iwgEKDlJlc3BvbnNlSGVhZGVyEi0KCmNsd
  XN0ZXJfaWQYASABKARCDuI/CxIJY2x1c3RlcklkUgljbHVzdGVySWQSKgoJbWVtYmVyX2lkGAIgASgEQg3iPwoSCG1lbWJlcklkU
  ghtZW1iZXJJZBIpCghyZXZpc2lvbhgDIAEoA0IN4j8KEghyZXZpc2lvblIIcmV2aXNpb24SKgoJcmFmdF90ZXJtGAQgASgEQg3iP
  woSCHJhZnRUZXJtUghyYWZ0VGVybSLlBgoMUmFuZ2VSZXF1ZXN0EhoKA2tleRgBIAEoDEII4j8FEgNrZXlSA2tleRIqCglyYW5nZ
  V9lbmQYAiABKAxCDeI/ChIIcmFuZ2VFbmRSCHJhbmdlRW5kEiAKBWxpbWl0GAMgASgDQgriPwcSBWxpbWl0UgVsaW1pdBIpCghyZ
  XZpc2lvbhgEIAEoA0IN4j8KEghyZXZpc2lvblIIcmV2aXNpb24SUwoKc29ydF9vcmRlchgFIAEoDjIkLmV0Y2RzZXJ2ZXJwYi5SY
  W5nZVJlcXVlc3QuU29ydE9yZGVyQg7iPwsSCXNvcnRPcmRlclIJc29ydE9yZGVyElcKC3NvcnRfdGFyZ2V0GAYgASgOMiUuZXRjZ
  HNlcnZlcnBiLlJhbmdlUmVxdWVzdC5Tb3J0VGFyZ2V0Qg/iPwwSCnNvcnRUYXJnZXRSCnNvcnRUYXJnZXQSNQoMc2VyaWFsaXphY
  mxlGAcgASgIQhHiPw4SDHNlcmlhbGl6YWJsZVIMc2VyaWFsaXphYmxlEioKCWtleXNfb25seRgIIAEoCEIN4j8KEghrZXlzT25se
  VIIa2V5c09ubHkSLQoKY291bnRfb25seRgJIAEoCEIO4j8LEgljb3VudE9ubHlSCWNvdW50T25seRI9ChBtaW5fbW9kX3Jldmlza
  W9uGAogASgDQhPiPxASDm1pbk1vZFJldmlzaW9uUg5taW5Nb2RSZXZpc2lvbhI9ChBtYXhfbW9kX3JldmlzaW9uGAsgASgDQhPiP
  xASDm1heE1vZFJldmlzaW9uUg5tYXhNb2RSZXZpc2lvbhJGChNtaW5fY3JlYXRlX3JldmlzaW9uGAwgASgDQhbiPxMSEW1pbkNyZ
  WF0ZVJldmlzaW9uUhFtaW5DcmVhdGVSZXZpc2lvbhJGChNtYXhfY3JlYXRlX3JldmlzaW9uGA0gASgDQhbiPxMSEW1heENyZWF0Z
  VJldmlzaW9uUhFtYXhDcmVhdGVSZXZpc2lvbiIuCglTb3J0T3JkZXISCAoETk9ORRAAEgoKBkFTQ0VORBABEgsKB0RFU0NFTkQQA
  iJCCgpTb3J0VGFyZ2V0EgcKA0tFWRAAEgsKB1ZFUlNJT04QARIKCgZDUkVBVEUQAhIHCgNNT0QQAxIJCgVWQUxVRRAEIsEBCg1SY
  W5nZVJlc3BvbnNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlY
  WRlchIsCgNrdnMYAiADKAsyEC5tdmNjcGIuS2V5VmFsdWVCCOI/BRIDa3ZzUgNrdnMSHQoEbW9yZRgDIAEoCEIJ4j8GEgRtb3JlU
  gRtb3JlEiAKBWNvdW50GAQgASgDQgriPwcSBWNvdW50UgVjb3VudCL8AQoKUHV0UmVxdWVzdBIaCgNrZXkYASABKAxCCOI/BRIDa
  2V5UgNrZXkSIAoFdmFsdWUYAiABKAxCCuI/BxIFdmFsdWVSBXZhbHVlEiAKBWxlYXNlGAMgASgDQgriPwcSBWxlYXNlUgVsZWFzZ
  RIkCgdwcmV2X2t2GAQgASgIQgviPwgSBnByZXZLdlIGcHJldkt2EjMKDGlnbm9yZV92YWx1ZRgFIAEoCEIQ4j8NEgtpZ25vcmVWY
  Wx1ZVILaWdub3JlVmFsdWUSMwoMaWdub3JlX2xlYXNlGAYgASgIQhDiPw0SC2lnbm9yZUxlYXNlUgtpZ25vcmVMZWFzZSKIAQoLU
  HV0UmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlcnZlcnBiLlJlc3BvbnNlSGVhZGVyQgviPwgSBmhlYWRlclIGaGVhZ
  GVyEjYKB3ByZXZfa3YYAiABKAsyEC5tdmNjcGIuS2V5VmFsdWVCC+I/CBIGcHJldkt2UgZwcmV2S3YiggEKEkRlbGV0ZVJhbmdlU
  mVxdWVzdBIaCgNrZXkYASABKAxCCOI/BRIDa2V5UgNrZXkSKgoJcmFuZ2VfZW5kGAIgASgMQg3iPwoSCHJhbmdlRW5kUghyYW5nZ
  UVuZBIkCgdwcmV2X2t2GAMgASgIQgviPwgSBnByZXZLdlIGcHJldkt2IrsBChNEZWxldGVSYW5nZVJlc3BvbnNlEkEKBmhlYWRlc
  hgBIAEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlchImCgdkZWxldGVkGAIgASgDQ
  gziPwkSB2RlbGV0ZWRSB2RlbGV0ZWQSOQoIcHJldl9rdnMYAyADKAsyEC5tdmNjcGIuS2V5VmFsdWVCDOI/CRIHcHJldkt2c1IHc
  HJldkt2cyL3AgoJUmVxdWVzdE9wElQKDXJlcXVlc3RfcmFuZ2UYASABKAsyGi5ldGNkc2VydmVycGIuUmFuZ2VSZXF1ZXN0QhHiP
  w4SDHJlcXVlc3RSYW5nZUgAUgxyZXF1ZXN0UmFuZ2USTAoLcmVxdWVzdF9wdXQYAiABKAsyGC5ldGNkc2VydmVycGIuUHV0UmVxd
  WVzdEIP4j8MEgpyZXF1ZXN0UHV0SABSCnJlcXVlc3RQdXQSbQoUcmVxdWVzdF9kZWxldGVfcmFuZ2UYAyABKAsyIC5ldGNkc2Vyd
  mVycGIuRGVsZXRlUmFuZ2VSZXF1ZXN0QhfiPxQSEnJlcXVlc3REZWxldGVSYW5nZUgAUhJyZXF1ZXN0RGVsZXRlUmFuZ2USTAoLc
  mVxdWVzdF90eG4YBCABKAsyGC5ldGNkc2VydmVycGIuVHhuUmVxdWVzdEIP4j8MEgpyZXF1ZXN0VHhuSABSCnJlcXVlc3RUeG5CC
  QoHcmVxdWVzdCKJAwoKUmVzcG9uc2VPcBJYCg5yZXNwb25zZV9yYW5nZRgBIAEoCzIbLmV0Y2RzZXJ2ZXJwYi5SYW5nZVJlc3Bvb
  nNlQhLiPw8SDXJlc3BvbnNlUmFuZ2VIAFINcmVzcG9uc2VSYW5nZRJQCgxyZXNwb25zZV9wdXQYAiABKAsyGS5ldGNkc2VydmVyc
  GIuUHV0UmVzcG9uc2VCEOI/DRILcmVzcG9uc2VQdXRIAFILcmVzcG9uc2VQdXQScQoVcmVzcG9uc2VfZGVsZXRlX3JhbmdlGAMgA
  SgLMiEuZXRjZHNlcnZlcnBiLkRlbGV0ZVJhbmdlUmVzcG9uc2VCGOI/FRITcmVzcG9uc2VEZWxldGVSYW5nZUgAUhNyZXNwb25zZ
  URlbGV0ZVJhbmdlElAKDHJlc3BvbnNlX3R4bhgEIAEoCzIZLmV0Y2RzZXJ2ZXJwYi5UeG5SZXNwb25zZUIQ4j8NEgtyZXNwb25zZ
  VR4bkgAUgtyZXNwb25zZVR4bkIKCghyZXNwb25zZSK7BAoHQ29tcGFyZRJICgZyZXN1bHQYASABKA4yIy5ldGNkc2VydmVycGIuQ
  29tcGFyZS5Db21wYXJlUmVzdWx0QgviPwgSBnJlc3VsdFIGcmVzdWx0EkgKBnRhcmdldBgCIAEoDjIjLmV0Y2RzZXJ2ZXJwYi5Db
  21wYXJlLkNvbXBhcmVUYXJnZXRCC+I/CBIGdGFyZ2V0UgZ0YXJnZXQSGgoDa2V5GAMgASgMQgjiPwUSA2tleVIDa2V5EigKB3Zlc
  nNpb24YBCABKANCDOI/CRIHdmVyc2lvbkgAUgd2ZXJzaW9uEj4KD2NyZWF0ZV9yZXZpc2lvbhgFIAEoA0IT4j8QEg5jcmVhdGVSZ
  XZpc2lvbkgAUg5jcmVhdGVSZXZpc2lvbhI1Cgxtb2RfcmV2aXNpb24YBiABKANCEOI/DRILbW9kUmV2aXNpb25IAFILbW9kUmV2a
  XNpb24SIwoFdmFsdWUYByABKAxCC+I/CBIGX3ZhbHVlSABSBXZhbHVlEioKCXJhbmdlX2VuZBgIIAEoDEIN4j8KEghyYW5nZUVuZ
  FIIcmFuZ2VFbmQiQAoNQ29tcGFyZVJlc3VsdBIJCgVFUVVBTBAAEgsKB0dSRUFURVIQARIICgRMRVNTEAISDQoJTk9UX0VRVUFME
  AMiPAoNQ29tcGFyZVRhcmdldBILCgdWRVJTSU9OEAASCgoGQ1JFQVRFEAESBwoDTU9EEAISCQoFVkFMVUUQA0IOCgx0YXJnZXRfd
  W5pb24izQEKClR4blJlcXVlc3QSPQoHY29tcGFyZRgBIAMoCzIVLmV0Y2RzZXJ2ZXJwYi5Db21wYXJlQgziPwkSB2NvbXBhcmVSB
  2NvbXBhcmUSPwoHc3VjY2VzcxgCIAMoCzIXLmV0Y2RzZXJ2ZXJwYi5SZXF1ZXN0T3BCDOI/CRIHc3VjY2Vzc1IHc3VjY2VzcxI/C
  gdmYWlsdXJlGAMgAygLMhcuZXRjZHNlcnZlcnBiLlJlcXVlc3RPcEIM4j8JEgdmYWlsdXJlUgdmYWlsdXJlIsYBCgtUeG5SZXNwb
  25zZRJBCgZoZWFkZXIYASABKAsyHC5ldGNkc2VydmVycGIuUmVzcG9uc2VIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXISLAoJc
  3VjY2VlZGVkGAIgASgIQg7iPwsSCXN1Y2NlZWRlZFIJc3VjY2VlZGVkEkYKCXJlc3BvbnNlcxgDIAMoCzIYLmV0Y2RzZXJ2ZXJwY
  i5SZXNwb25zZU9wQg7iPwsSCXJlc3BvbnNlc1IJcmVzcG9uc2VzImkKEUNvbXBhY3Rpb25SZXF1ZXN0EikKCHJldmlzaW9uGAEgA
  SgDQg3iPwoSCHJldmlzaW9uUghyZXZpc2lvbhIpCghwaHlzaWNhbBgCIAEoCEIN4j8KEghwaHlzaWNhbFIIcGh5c2ljYWwiVwoSQ
  29tcGFjdGlvblJlc3BvbnNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZ
  XJSBmhlYWRlciINCgtIYXNoUmVxdWVzdCJwCgxIYXNoUmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlcnZlcnBiLlJlc
  3BvbnNlSGVhZGVyQgviPwgSBmhlYWRlclIGaGVhZGVyEh0KBGhhc2gYAiABKA1CCeI/BhIEaGFzaFIEaGFzaCIRCg9TbmFwc2hvd
  FJlcXVlc3QisgEKEFNuYXBzaG90UmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlcnZlcnBiLlJlc3BvbnNlSGVhZGVyQ
  gviPwgSBmhlYWRlclIGaGVhZGVyEjwKD3JlbWFpbmluZ19ieXRlcxgCIAEoBEIT4j8QEg5yZW1haW5pbmdCeXRlc1IOcmVtYWlua
  W5nQnl0ZXMSHQoEYmxvYhgDIAEoDEIJ4j8GEgRibG9iUgRibG9iIt0BCgxXYXRjaFJlcXVlc3QSXQoOY3JlYXRlX3JlcXVlc3QYA
  SABKAsyIC5ldGNkc2VydmVycGIuV2F0Y2hDcmVhdGVSZXF1ZXN0QhLiPw8SDWNyZWF0ZVJlcXVlc3RIAFINY3JlYXRlUmVxdWVzd
  BJdCg5jYW5jZWxfcmVxdWVzdBgCIAEoCzIgLmV0Y2RzZXJ2ZXJwYi5XYXRjaENhbmNlbFJlcXVlc3RCEuI/DxINY2FuY2VsUmVxd
  WVzdEgAUg1jYW5jZWxSZXF1ZXN0Qg8KDXJlcXVlc3RfdW5pb24i9wIKEldhdGNoQ3JlYXRlUmVxdWVzdBIaCgNrZXkYASABKAxCC
  OI/BRIDa2V5UgNrZXkSKgoJcmFuZ2VfZW5kGAIgASgMQg3iPwoSCHJhbmdlRW5kUghyYW5nZUVuZBI5Cg5zdGFydF9yZXZpc2lvb
  hgDIAEoA0IS4j8PEg1zdGFydFJldmlzaW9uUg1zdGFydFJldmlzaW9uEjwKD3Byb2dyZXNzX25vdGlmeRgEIAEoCEIT4j8QEg5wc
  m9ncmVzc05vdGlmeVIOcHJvZ3Jlc3NOb3RpZnkSUwoHZmlsdGVycxgFIAMoDjIrLmV0Y2RzZXJ2ZXJwYi5XYXRjaENyZWF0ZVJlc
  XVlc3QuRmlsdGVyVHlwZUIM4j8JEgdmaWx0ZXJzUgdmaWx0ZXJzEiQKB3ByZXZfa3YYBiABKAhCC+I/CBIGcHJldkt2UgZwcmV2S
  3YiJQoKRmlsdGVyVHlwZRIJCgVOT1BVVBAAEgwKCE5PREVMRVRFEAEiPQoSV2F0Y2hDYW5jZWxSZXF1ZXN0EicKCHdhdGNoX2lkG
  AEgASgDQgziPwkSB3dhdGNoSWRSB3dhdGNoSWQi+wIKDVdhdGNoUmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlcnZlc
  nBiLlJlc3BvbnNlSGVhZGVyQgviPwgSBmhlYWRlclIGaGVhZGVyEicKCHdhdGNoX2lkGAIgASgDQgziPwkSB3dhdGNoSWRSB3dhd
  GNoSWQSJgoHY3JlYXRlZBgDIAEoCEIM4j8JEgdjcmVhdGVkUgdjcmVhdGVkEikKCGNhbmNlbGVkGAQgASgIQg3iPwoSCGNhbmNlb
  GVkUghjYW5jZWxlZBI/ChBjb21wYWN0X3JldmlzaW9uGAUgASgDQhTiPxESD2NvbXBhY3RSZXZpc2lvblIPY29tcGFjdFJldmlza
  W9uEjYKDWNhbmNlbF9yZWFzb24YBiABKAlCEeI/DhIMY2FuY2VsUmVhc29uUgxjYW5jZWxSZWFzb24SMgoGZXZlbnRzGAsgAygLM
  g0ubXZjY3BiLkV2ZW50QgviPwgSBmV2ZW50c1IGZXZlbnRzIkgKEUxlYXNlR3JhbnRSZXF1ZXN0EhoKA1RUTBgBIAEoA0II4j8FE
  gN0VExSA1RUTBIXCgJJRBgCIAEoA0IH4j8EEgJpRFICSUQirgEKEkxlYXNlR3JhbnRSZXNwb25zZRJBCgZoZWFkZXIYASABKAsyH
  C5ldGNkc2VydmVycGIuUmVzcG9uc2VIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXISFwoCSUQYAiABKANCB+I/BBICaURSAklEE
  hoKA1RUTBgDIAEoA0II4j8FEgN0VExSA1RUTBIgCgVlcnJvchgEIAEoCUIK4j8HEgVlcnJvclIFZXJyb3IiLQoSTGVhc2VSZXZva
  2VSZXF1ZXN0EhcKAklEGAEgASgDQgfiPwQSAmlEUgJJRCJYChNMZWFzZVJldm9rZVJlc3BvbnNlEkEKBmhlYWRlchgBIAEoCzIcL
  mV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlciIwChVMZWFzZUtlZXBBbGl2ZVJlcXVlc3QSF
  woCSUQYASABKANCB+I/BBICaURSAklEIpABChZMZWFzZUtlZXBBbGl2ZVJlc3BvbnNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y2RzZ
  XJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlchIXCgJJRBgCIAEoA0IH4j8EEgJpRFICSUQSGgoDVFRMG
  AMgASgDQgjiPwUSA3RUTFIDVFRMIlAKFkxlYXNlVGltZVRvTGl2ZVJlcXVlc3QSFwoCSUQYASABKANCB+I/BBICaURSAklEEh0KB
  GtleXMYAiABKAhCCeI/BhIEa2V5c1IEa2V5cyLhAQoXTGVhc2VUaW1lVG9MaXZlUmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZ
  XRjZHNlcnZlcnBiLlJlc3BvbnNlSGVhZGVyQgviPwgSBmhlYWRlclIGaGVhZGVyEhcKAklEGAIgASgDQgfiPwQSAmlEUgJJRBIaC
  gNUVEwYAyABKANCCOI/BRIDdFRMUgNUVEwSLwoKZ3JhbnRlZFRUTBgEIAEoA0IP4j8MEgpncmFudGVkVFRMUgpncmFudGVkVFRME
  h0KBGtleXMYBSADKAxCCeI/BhIEa2V5c1IEa2V5cyKcAQoGTWVtYmVyEhcKAklEGAEgASgEQgfiPwQSAmlEUgJJRBIdCgRuYW1lG
  AIgASgJQgniPwYSBG5hbWVSBG5hbWUSKQoIcGVlclVSTHMYAyADKAlCDeI/ChIIcGVlclVSTHNSCHBlZXJVUkxzEi8KCmNsaWVud
  FVSTHMYBCADKAlCD+I/DBIKY2xpZW50VVJMc1IKY2xpZW50VVJMcyI9ChBNZW1iZXJBZGRSZXF1ZXN0EikKCHBlZXJVUkxzGAEgA
  ygJQg3iPwoSCHBlZXJVUkxzUghwZWVyVVJMcyLPAQoRTWVtYmVyQWRkUmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlc
  nZlcnBiLlJlc3BvbnNlSGVhZGVyQgviPwgSBmhlYWRlclIGaGVhZGVyEjkKBm1lbWJlchgCIAEoCzIULmV0Y2RzZXJ2ZXJwYi5NZ
  W1iZXJCC+I/CBIGbWVtYmVyUgZtZW1iZXISPAoHbWVtYmVycxgDIAMoCzIULmV0Y2RzZXJ2ZXJwYi5NZW1iZXJCDOI/CRIHbWVtY
  mVyc1IHbWVtYmVycyIuChNNZW1iZXJSZW1vdmVSZXF1ZXN0EhcKAklEGAEgASgEQgfiPwQSAmlEUgJJRCKXAQoUTWVtYmVyUmVtb
  3ZlUmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlcnZlcnBiLlJlc3BvbnNlSGVhZGVyQgviPwgSBmhlYWRlclIGaGVhZ
  GVyEjwKB21lbWJlcnMYAiADKAsyFC5ldGNkc2VydmVycGIuTWVtYmVyQgziPwkSB21lbWJlcnNSB21lbWJlcnMiWQoTTWVtYmVyV
  XBkYXRlUmVxdWVzdBIXCgJJRBgBIAEoBEIH4j8EEgJpRFICSUQSKQoIcGVlclVSTHMYAiADKAlCDeI/ChIIcGVlclVSTHNSCHBlZ
  XJVUkxzIpcBChRNZW1iZXJVcGRhdGVSZXNwb25zZRJBCgZoZWFkZXIYASABKAsyHC5ldGNkc2VydmVycGIuUmVzcG9uc2VIZWFkZ
  XJCC+I/CBIGaGVhZGVyUgZoZWFkZXISPAoHbWVtYmVycxgCIAMoCzIULmV0Y2RzZXJ2ZXJwYi5NZW1iZXJCDOI/CRIHbWVtYmVyc
  1IHbWVtYmVycyITChFNZW1iZXJMaXN0UmVxdWVzdCKVAQoSTWVtYmVyTGlzdFJlc3BvbnNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y
  2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlchI8CgdtZW1iZXJzGAIgAygLMhQuZXRjZHNlcnZlc
  nBiLk1lbWJlckIM4j8JEgdtZW1iZXJzUgdtZW1iZXJzIhMKEURlZnJhZ21lbnRSZXF1ZXN0IlcKEkRlZnJhZ21lbnRSZXNwb25zZ
  RJBCgZoZWFkZXIYASABKAsyHC5ldGNkc2VydmVycGIuUmVzcG9uc2VIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXIi9wEKDEFsY
  XJtUmVxdWVzdBJLCgZhY3Rpb24YASABKA4yJi5ldGNkc2VydmVycGIuQWxhcm1SZXF1ZXN0LkFsYXJtQWN0aW9uQgviPwgSBmFjd
  GlvblIGYWN0aW9uEikKCG1lbWJlcklEGAIgASgEQg3iPwoSCG1lbWJlcklEUghtZW1iZXJJRBI5CgVhbGFybRgDIAEoDjIXLmV0Y
  2RzZXJ2ZXJwYi5BbGFybVR5cGVCCuI/BxIFYWxhcm1SBWFsYXJtIjQKC0FsYXJtQWN0aW9uEgcKA0dFVBAAEgwKCEFDVElWQVRFE
  AESDgoKREVBQ1RJVkFURRACInMKC0FsYXJtTWVtYmVyEikKCG1lbWJlcklEGAEgASgEQg3iPwoSCG1lbWJlcklEUghtZW1iZXJJR
  BI5CgVhbGFybRgCIAEoDjIXLmV0Y2RzZXJ2ZXJwYi5BbGFybVR5cGVCCuI/BxIFYWxhcm1SBWFsYXJtIpIBCg1BbGFybVJlc3Bvb
  nNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlchI+CgZhb
  GFybXMYAiADKAsyGS5ldGNkc2VydmVycGIuQWxhcm1NZW1iZXJCC+I/CBIGYWxhcm1zUgZhbGFybXMiDwoNU3RhdHVzUmVxdWVzd
  CKeAgoOU3RhdHVzUmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlcnZlcnBiLlJlc3BvbnNlSGVhZGVyQgviPwgSBmhlY
  WRlclIGaGVhZGVyEiYKB3ZlcnNpb24YAiABKAlCDOI/CRIHdmVyc2lvblIHdmVyc2lvbhIjCgZkYlNpemUYAyABKANCC+I/CBIGZ
  GJTaXplUgZkYlNpemUSIwoGbGVhZGVyGAQgASgEQgviPwgSBmxlYWRlclIGbGVhZGVyEiwKCXJhZnRJbmRleBgFIAEoBEIO4j8LE
  glyYWZ0SW5kZXhSCXJhZnRJbmRleBIpCghyYWZ0VGVybRgGIAEoBEIN4j8KEghyYWZ0VGVybVIIcmFmdFRlcm0iEwoRQXV0aEVuY
  WJsZVJlcXVlc3QiFAoSQXV0aERpc2FibGVSZXF1ZXN0Il8KE0F1dGhlbnRpY2F0ZVJlcXVlc3QSHQoEbmFtZRgBIAEoCUIJ4j8GE
  gRuYW1lUgRuYW1lEikKCHBhc3N3b3JkGAIgASgJQg3iPwoSCHBhc3N3b3JkUghwYXNzd29yZCJeChJBdXRoVXNlckFkZFJlcXVlc
  3QSHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lUgRuYW1lEikKCHBhc3N3b3JkGAIgASgJQg3iPwoSCHBhc3N3b3JkUghwYXNzd29yZ
  CIzChJBdXRoVXNlckdldFJlcXVlc3QSHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lUgRuYW1lIjYKFUF1dGhVc2VyRGVsZXRlUmVxd
  WVzdBIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUiaQodQXV0aFVzZXJDaGFuZ2VQYXNzd29yZFJlcXVlc3QSHQoEbmFtZ
  RgBIAEoCUIJ4j8GEgRuYW1lUgRuYW1lEikKCHBhc3N3b3JkGAIgASgJQg3iPwoSCHBhc3N3b3JkUghwYXNzd29yZCJYChhBdXRoV
  XNlckdyYW50Um9sZVJlcXVlc3QSHQoEdXNlchgBIAEoCUIJ4j8GEgR1c2VyUgR1c2VyEh0KBHJvbGUYAiABKAlCCeI/BhIEcm9sZ
  VIEcm9sZSJZChlBdXRoVXNlclJldm9rZVJvbGVSZXF1ZXN0Eh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZRIdCgRyb2xlG
  AIgASgJQgniPwYSBHJvbGVSBHJvbGUiMwoSQXV0aFJvbGVBZGRSZXF1ZXN0Eh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZ
  SIzChJBdXRoUm9sZUdldFJlcXVlc3QSHQoEcm9sZRgBIAEoCUIJ4j8GEgRyb2xlUgRyb2xlIhUKE0F1dGhVc2VyTGlzdFJlcXVlc
  3QiFQoTQXV0aFJvbGVMaXN0UmVxdWVzdCI2ChVBdXRoUm9sZURlbGV0ZVJlcXVlc3QSHQoEcm9sZRgBIAEoCUIJ4j8GEgRyb2xlU
  gRyb2xlInIKHkF1dGhSb2xlR3JhbnRQZXJtaXNzaW9uUmVxdWVzdBIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSMQoEc
  GVybRgCIAEoCzISLmF1dGhwYi5QZXJtaXNzaW9uQgniPwYSBHBlcm1SBHBlcm0iiAEKH0F1dGhSb2xlUmV2b2tlUGVybWlzc2lvb
  lJlcXVlc3QSHQoEcm9sZRgBIAEoCUIJ4j8GEgRyb2xlUgRyb2xlEhoKA2tleRgCIAEoCUII4j8FEgNrZXlSA2tleRIqCglyYW5nZ
  V9lbmQYAyABKAlCDeI/ChIIcmFuZ2VFbmRSCHJhbmdlRW5kIlcKEkF1dGhFbmFibGVSZXNwb25zZRJBCgZoZWFkZXIYASABKAsyH
  C5ldGNkc2VydmVycGIuUmVzcG9uc2VIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXIiWAoTQXV0aERpc2FibGVSZXNwb25zZRJBC
  gZoZWFkZXIYASABKAsyHC5ldGNkc2VydmVycGIuUmVzcG9uc2VIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXIiewoUQXV0aGVud
  GljYXRlUmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlcnZlcnBiLlJlc3BvbnNlSGVhZGVyQgviPwgSBmhlYWRlclIGa
  GVhZGVyEiAKBXRva2VuGAIgASgJQgriPwcSBXRva2VuUgV0b2tlbiJYChNBdXRoVXNlckFkZFJlc3BvbnNlEkEKBmhlYWRlchgBI
  AEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlciJ6ChNBdXRoVXNlckdldFJlc3Bvb
  nNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlchIgCgVyb
  2xlcxgCIAMoCUIK4j8HEgVyb2xlc1IFcm9sZXMiWwoWQXV0aFVzZXJEZWxldGVSZXNwb25zZRJBCgZoZWFkZXIYASABKAsyHC5ld
  GNkc2VydmVycGIuUmVzcG9uc2VIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXIiYwoeQXV0aFVzZXJDaGFuZ2VQYXNzd29yZFJlc
  3BvbnNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlciJeC
  hlBdXRoVXNlckdyYW50Um9sZVJlc3BvbnNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4
  j8IEgZoZWFkZXJSBmhlYWRlciJfChpBdXRoVXNlclJldm9rZVJvbGVSZXNwb25zZRJBCgZoZWFkZXIYASABKAsyHC5ldGNkc2Vyd
  mVycGIuUmVzcG9uc2VIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXIiWAoTQXV0aFJvbGVBZGRSZXNwb25zZRJBCgZoZWFkZXIYA
  SABKAsyHC5ldGNkc2VydmVycGIuUmVzcG9uc2VIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXIiiwEKE0F1dGhSb2xlR2V0UmVzc
  G9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlcnZlcnBiLlJlc3BvbnNlSGVhZGVyQgviPwgSBmhlYWRlclIGaGVhZGVyEjEKB
  HBlcm0YAiADKAsyEi5hdXRocGIuUGVybWlzc2lvbkIJ4j8GEgRwZXJtUgRwZXJtInsKFEF1dGhSb2xlTGlzdFJlc3BvbnNlEkEKB
  mhlYWRlchgBIAEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlchIgCgVyb2xlcxgCI
  AMoCUIK4j8HEgVyb2xlc1IFcm9sZXMiewoUQXV0aFVzZXJMaXN0UmVzcG9uc2USQQoGaGVhZGVyGAEgASgLMhwuZXRjZHNlcnZlc
  nBiLlJlc3BvbnNlSGVhZGVyQgviPwgSBmhlYWRlclIGaGVhZGVyEiAKBXVzZXJzGAIgAygJQgriPwcSBXVzZXJzUgV1c2VycyJbC
  hZBdXRoUm9sZURlbGV0ZVJlc3BvbnNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y2RzZXJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IE
  gZoZWFkZXJSBmhlYWRlciJkCh9BdXRoUm9sZUdyYW50UGVybWlzc2lvblJlc3BvbnNlEkEKBmhlYWRlchgBIAEoCzIcLmV0Y2RzZ
  XJ2ZXJwYi5SZXNwb25zZUhlYWRlckIL4j8IEgZoZWFkZXJSBmhlYWRlciJlCiBBdXRoUm9sZVJldm9rZVBlcm1pc3Npb25SZXNwb
  25zZRJBCgZoZWFkZXIYASABKAsyHC5ldGNkc2VydmVycGIuUmVzcG9uc2VIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXIqIgoJQ
  Wxhcm1UeXBlEggKBE5PTkUQABILCgdOT1NQQUNFEAEy6gIKAktWEkIKBVJhbmdlEhouZXRjZHNlcnZlcnBiLlJhbmdlUmVxdWVzd
  BobLmV0Y2RzZXJ2ZXJwYi5SYW5nZVJlc3BvbnNlIgASPAoDUHV0EhguZXRjZHNlcnZlcnBiLlB1dFJlcXVlc3QaGS5ldGNkc2Vyd
  mVycGIuUHV0UmVzcG9uc2UiABJUCgtEZWxldGVSYW5nZRIgLmV0Y2RzZXJ2ZXJwYi5EZWxldGVSYW5nZVJlcXVlc3QaIS5ldGNkc
  2VydmVycGIuRGVsZXRlUmFuZ2VSZXNwb25zZSIAEjwKA1R4bhIYLmV0Y2RzZXJ2ZXJwYi5UeG5SZXF1ZXN0GhkuZXRjZHNlcnZlc
  nBiLlR4blJlc3BvbnNlIgASTgoHQ29tcGFjdBIfLmV0Y2RzZXJ2ZXJwYi5Db21wYWN0aW9uUmVxdWVzdBogLmV0Y2RzZXJ2ZXJwY
  i5Db21wYWN0aW9uUmVzcG9uc2UiADJPCgVXYXRjaBJGCgVXYXRjaBIaLmV0Y2RzZXJ2ZXJwYi5XYXRjaFJlcXVlc3QaGy5ldGNkc
  2VydmVycGIuV2F0Y2hSZXNwb25zZSIAKAEwATL1AgoFTGVhc2USUQoKTGVhc2VHcmFudBIfLmV0Y2RzZXJ2ZXJwYi5MZWFzZUdyY
  W50UmVxdWVzdBogLmV0Y2RzZXJ2ZXJwYi5MZWFzZUdyYW50UmVzcG9uc2UiABJUCgtMZWFzZVJldm9rZRIgLmV0Y2RzZXJ2ZXJwY
  i5MZWFzZVJldm9rZVJlcXVlc3QaIS5ldGNkc2VydmVycGIuTGVhc2VSZXZva2VSZXNwb25zZSIAEmEKDkxlYXNlS2VlcEFsaXZlE
  iMuZXRjZHNlcnZlcnBiLkxlYXNlS2VlcEFsaXZlUmVxdWVzdBokLmV0Y2RzZXJ2ZXJwYi5MZWFzZUtlZXBBbGl2ZVJlc3BvbnNlI
  gAoATABEmAKD0xlYXNlVGltZVRvTGl2ZRIkLmV0Y2RzZXJ2ZXJwYi5MZWFzZVRpbWVUb0xpdmVSZXF1ZXN0GiUuZXRjZHNlcnZlc
  nBiLkxlYXNlVGltZVRvTGl2ZVJlc3BvbnNlIgAy3gIKB0NsdXN0ZXISTgoJTWVtYmVyQWRkEh4uZXRjZHNlcnZlcnBiLk1lbWJlc
  kFkZFJlcXVlc3QaHy5ldGNkc2VydmVycGIuTWVtYmVyQWRkUmVzcG9uc2UiABJXCgxNZW1iZXJSZW1vdmUSIS5ldGNkc2VydmVyc
  GIuTWVtYmVyUmVtb3ZlUmVxdWVzdBoiLmV0Y2RzZXJ2ZXJwYi5NZW1iZXJSZW1vdmVSZXNwb25zZSIAElcKDE1lbWJlclVwZGF0Z
  RIhLmV0Y2RzZXJ2ZXJwYi5NZW1iZXJVcGRhdGVSZXF1ZXN0GiIuZXRjZHNlcnZlcnBiLk1lbWJlclVwZGF0ZVJlc3BvbnNlIgASU
  QoKTWVtYmVyTGlzdBIfLmV0Y2RzZXJ2ZXJwYi5NZW1iZXJMaXN0UmVxdWVzdBogLmV0Y2RzZXJ2ZXJwYi5NZW1iZXJMaXN0UmVzc
  G9uc2UiADL7AgoLTWFpbnRlbmFuY2USQgoFQWxhcm0SGi5ldGNkc2VydmVycGIuQWxhcm1SZXF1ZXN0GhsuZXRjZHNlcnZlcnBiL
  kFsYXJtUmVzcG9uc2UiABJFCgZTdGF0dXMSGy5ldGNkc2VydmVycGIuU3RhdHVzUmVxdWVzdBocLmV0Y2RzZXJ2ZXJwYi5TdGF0d
  XNSZXNwb25zZSIAElEKCkRlZnJhZ21lbnQSHy5ldGNkc2VydmVycGIuRGVmcmFnbWVudFJlcXVlc3QaIC5ldGNkc2VydmVycGIuR
  GVmcmFnbWVudFJlc3BvbnNlIgASPwoESGFzaBIZLmV0Y2RzZXJ2ZXJwYi5IYXNoUmVxdWVzdBoaLmV0Y2RzZXJ2ZXJwYi5IYXNoU
  mVzcG9uc2UiABJNCghTbmFwc2hvdBIdLmV0Y2RzZXJ2ZXJwYi5TbmFwc2hvdFJlcXVlc3QaHi5ldGNkc2VydmVycGIuU25hcHNob
  3RSZXNwb25zZSIAMAEy3QsKBEF1dGgSUQoKQXV0aEVuYWJsZRIfLmV0Y2RzZXJ2ZXJwYi5BdXRoRW5hYmxlUmVxdWVzdBogLmV0Y
  2RzZXJ2ZXJwYi5BdXRoRW5hYmxlUmVzcG9uc2UiABJUCgtBdXRoRGlzYWJsZRIgLmV0Y2RzZXJ2ZXJwYi5BdXRoRGlzYWJsZVJlc
  XVlc3QaIS5ldGNkc2VydmVycGIuQXV0aERpc2FibGVSZXNwb25zZSIAElcKDEF1dGhlbnRpY2F0ZRIhLmV0Y2RzZXJ2ZXJwYi5Bd
  XRoZW50aWNhdGVSZXF1ZXN0GiIuZXRjZHNlcnZlcnBiLkF1dGhlbnRpY2F0ZVJlc3BvbnNlIgASUAoHVXNlckFkZBIgLmV0Y2RzZ
  XJ2ZXJwYi5BdXRoVXNlckFkZFJlcXVlc3QaIS5ldGNkc2VydmVycGIuQXV0aFVzZXJBZGRSZXNwb25zZSIAElAKB1VzZXJHZXQSI
  C5ldGNkc2VydmVycGIuQXV0aFVzZXJHZXRSZXF1ZXN0GiEuZXRjZHNlcnZlcnBiLkF1dGhVc2VyR2V0UmVzcG9uc2UiABJTCghVc
  2VyTGlzdBIhLmV0Y2RzZXJ2ZXJwYi5BdXRoVXNlckxpc3RSZXF1ZXN0GiIuZXRjZHNlcnZlcnBiLkF1dGhVc2VyTGlzdFJlc3Bvb
  nNlIgASWQoKVXNlckRlbGV0ZRIjLmV0Y2RzZXJ2ZXJwYi5BdXRoVXNlckRlbGV0ZVJlcXVlc3QaJC5ldGNkc2VydmVycGIuQXV0a
  FVzZXJEZWxldGVSZXNwb25zZSIAEnEKElVzZXJDaGFuZ2VQYXNzd29yZBIrLmV0Y2RzZXJ2ZXJwYi5BdXRoVXNlckNoYW5nZVBhc
  3N3b3JkUmVxdWVzdBosLmV0Y2RzZXJ2ZXJwYi5BdXRoVXNlckNoYW5nZVBhc3N3b3JkUmVzcG9uc2UiABJiCg1Vc2VyR3JhbnRSb
  2xlEiYuZXRjZHNlcnZlcnBiLkF1dGhVc2VyR3JhbnRSb2xlUmVxdWVzdBonLmV0Y2RzZXJ2ZXJwYi5BdXRoVXNlckdyYW50Um9sZ
  VJlc3BvbnNlIgASZQoOVXNlclJldm9rZVJvbGUSJy5ldGNkc2VydmVycGIuQXV0aFVzZXJSZXZva2VSb2xlUmVxdWVzdBooLmV0Y
  2RzZXJ2ZXJwYi5BdXRoVXNlclJldm9rZVJvbGVSZXNwb25zZSIAElAKB1JvbGVBZGQSIC5ldGNkc2VydmVycGIuQXV0aFJvbGVBZ
  GRSZXF1ZXN0GiEuZXRjZHNlcnZlcnBiLkF1dGhSb2xlQWRkUmVzcG9uc2UiABJQCgdSb2xlR2V0EiAuZXRjZHNlcnZlcnBiLkF1d
  GhSb2xlR2V0UmVxdWVzdBohLmV0Y2RzZXJ2ZXJwYi5BdXRoUm9sZUdldFJlc3BvbnNlIgASUwoIUm9sZUxpc3QSIS5ldGNkc2Vyd
  mVycGIuQXV0aFJvbGVMaXN0UmVxdWVzdBoiLmV0Y2RzZXJ2ZXJwYi5BdXRoUm9sZUxpc3RSZXNwb25zZSIAElkKClJvbGVEZWxld
  GUSIy5ldGNkc2VydmVycGIuQXV0aFJvbGVEZWxldGVSZXF1ZXN0GiQuZXRjZHNlcnZlcnBiLkF1dGhSb2xlRGVsZXRlUmVzcG9uc
  2UiABJ0ChNSb2xlR3JhbnRQZXJtaXNzaW9uEiwuZXRjZHNlcnZlcnBiLkF1dGhSb2xlR3JhbnRQZXJtaXNzaW9uUmVxdWVzdBotL
  mV0Y2RzZXJ2ZXJwYi5BdXRoUm9sZUdyYW50UGVybWlzc2lvblJlc3BvbnNlIgASdwoUUm9sZVJldm9rZVBlcm1pc3Npb24SLS5ld
  GNkc2VydmVycGIuQXV0aFJvbGVSZXZva2VQZXJtaXNzaW9uUmVxdWVzdBouLmV0Y2RzZXJ2ZXJwYi5BdXRoUm9sZVJldm9rZVBlc
  m1pc3Npb25SZXNwb25zZSIAQioKKGNvbS5naXRodWIuZml0NTEucmVhY3RpdmVjb25maWcuZXRjZC5nZW5iBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.github.fit51.reactiveconfig.etcd.gen.kv.KvProto.javaDescriptor,
      com.github.fit51.reactiveconfig.etcd.gen.auth.AuthProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}