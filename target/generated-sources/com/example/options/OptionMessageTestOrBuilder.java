// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: option_example.proto

package com.example.options;

public interface OptionMessageTestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:example.options.OptionMessageTest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional bool is_simple = 2;</code>
   */
  boolean getIsSimple();

  /**
   * <code>optional string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated int32 sample_list = 4;</code>
   */
  java.util.List<java.lang.Integer> getSampleListList();
  /**
   * <code>repeated int32 sample_list = 4;</code>
   */
  int getSampleListCount();
  /**
   * <code>repeated int32 sample_list = 4;</code>
   */
  int getSampleList(int index);
}