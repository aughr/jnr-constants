// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Feb 24 09:44:07 +1000 2009
package jnr.constants.platform.linux;
public enum NameInfo implements jnr.constants.Constant {
NI_MAXHOST(1025),
NI_MAXSERV(32),
NI_NOFQDN(4),
NI_NUMERICHOST(1),
NI_NAMEREQD(8),
NI_NUMERICSERV(2),
NI_DGRAM(16);
// NI_WITHSCOPEID not defined
private final int value;
private NameInfo(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 1025;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}