// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.fit51.reactiveconfig.etcd.gen.rpc

/** @param key
  *   key is the first key to delete in the range.
  * @param rangeEnd
  *   range_end is the key following the last key to delete for the range [key, range_end).
  *   If range_end is not given, the range is defined to contain only the key argument.
  *   If range_end is one bit larger than the given key, then the range is all the keys
  *   with the prefix (the given key).
  *   If range_end is '&92;0', the range is all keys greater than or equal to the key argument.
  * @param prevKv
  *   If prev_kv is set, etcd gets the previous key-value pairs before deleting it.
  *   The previous key-value pairs will be returned in the delete response.
  */
@SerialVersionUID(0L)
final case class DeleteRangeRequest(
    key: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
    rangeEnd: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
    prevKv: _root_.scala.Boolean = false,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[DeleteRangeRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = key
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(1, __value)
        }
      };
      
      {
        val __value = rangeEnd
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(2, __value)
        }
      };
      
      {
        val __value = prevKv
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = key
        if (!__v.isEmpty) {
          _output__.writeBytes(1, __v)
        }
      };
      {
        val __v = rangeEnd
        if (!__v.isEmpty) {
          _output__.writeBytes(2, __v)
        }
      };
      {
        val __v = prevKv
        if (__v != false) {
          _output__.writeBool(3, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withKey(__v: _root_.com.google.protobuf.ByteString): DeleteRangeRequest = copy(key = __v)
    def withRangeEnd(__v: _root_.com.google.protobuf.ByteString): DeleteRangeRequest = copy(rangeEnd = __v)
    def withPrevKv(__v: _root_.scala.Boolean): DeleteRangeRequest = copy(prevKv = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = key
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
        case 2 => {
          val __t = rangeEnd
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
        case 3 => {
          val __t = prevKv
          if (__t != false) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PByteString(key)
        case 2 => _root_.scalapb.descriptors.PByteString(rangeEnd)
        case 3 => _root_.scalapb.descriptors.PBoolean(prevKv)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest
    // @@protoc_insertion_point(GeneratedMessage[etcdserverpb.DeleteRangeRequest])
}

object DeleteRangeRequest extends scalapb.GeneratedMessageCompanion[com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest = {
    var __key: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
    var __rangeEnd: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
    var __prevKv: _root_.scala.Boolean = false
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __key = _input__.readBytes()
        case 18 =>
          __rangeEnd = _input__.readBytes()
        case 24 =>
          __prevKv = _input__.readBool()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest(
        key = __key,
        rangeEnd = __rangeEnd,
        prevKv = __prevKv,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest(
        key = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
        rangeEnd = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
        prevKv = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = RpcProto.javaDescriptor.getMessageTypes().get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = RpcProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest(
    key = _root_.com.google.protobuf.ByteString.EMPTY,
    rangeEnd = _root_.com.google.protobuf.ByteString.EMPTY,
    prevKv = false
  )
  implicit class DeleteRangeRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest](_l) {
    def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.key)((c_, f_) => c_.copy(key = f_))
    def rangeEnd: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.rangeEnd)((c_, f_) => c_.copy(rangeEnd = f_))
    def prevKv: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.prevKv)((c_, f_) => c_.copy(prevKv = f_))
  }
  final val KEY_FIELD_NUMBER = 1
  final val RANGE_END_FIELD_NUMBER = 2
  final val PREV_KV_FIELD_NUMBER = 3
  def of(
    key: _root_.com.google.protobuf.ByteString,
    rangeEnd: _root_.com.google.protobuf.ByteString,
    prevKv: _root_.scala.Boolean
  ): _root_.com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest = _root_.com.github.fit51.reactiveconfig.etcd.gen.rpc.DeleteRangeRequest(
    key,
    rangeEnd,
    prevKv
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[etcdserverpb.DeleteRangeRequest])
}
