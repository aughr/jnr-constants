// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2017-07-30 01:16:56 +0000
package jnr.constants.platform.linux;
public enum PRIO implements jnr.constants.Constant {
PRIO_MIN(-20L),
PRIO_PROCESS(0L),
PRIO_PGRP(1L),
PRIO_USER(2L),
PRIO_MAX(20L);
private final long value;
private PRIO(long value) { this.value = value; }
public static final long MIN_VALUE = -20L;
public static final long MAX_VALUE = 20L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
