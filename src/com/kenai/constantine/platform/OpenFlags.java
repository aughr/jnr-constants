// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Wed Feb 04 17:04:21 -0600 2009
package com.kenai.constantine.platform;
public enum OpenFlags implements com.kenai.constantine.Constant {
O_RDONLY,
O_WRONLY,
O_RDWR,
O_ACCMODE,
O_NONBLOCK,
O_APPEND,
O_SYNC,
O_SHLOCK,
O_EXLOCK,
O_ASYNC,
O_FSYNC,
O_NOFOLLOW,
O_CREAT,
O_TRUNC,
O_EXCL,
O_EVTONLY,
O_DIRECTORY,
O_SYMLINK,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<OpenFlags> resolver 
= ConstantResolver.getResolver(OpenFlags.class, 20000, 20999);
public final int value() { return resolver.intValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static OpenFlags valueOf(int value) { 
    return resolver.valueOf(value);
}
}
