// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2017-07-30 01:16:56 +0000
package jnr.constants.platform.linux;
public enum SocketLevel implements jnr.constants.Constant {
SOL_SOCKET(1L);
// SOL_IP not defined
// SOL_TCP not defined
// SOL_UDP not defined
private final long value;
private SocketLevel(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 1L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
