/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige.loader;

import java.io.InputStream;
import java.net.URL;
import java.security.SecureClassLoader;

public class PrestigeClient
extends SecureClassLoader {
    public PrestigeClient(ClassLoader parentClassLoader) {
        super("PrestigeClassLoader", parentClassLoader);
    }

    @Override
    public native Class<?> loadClass(String var1);

    @Override
    public native InputStream getResourceAsStream(String var1);

    @Override
    public native URL getResource(String var1);

    @Override
    protected native Class<?> findClass(String var1);
}

