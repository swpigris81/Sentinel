package com.alibaba.csp.sentinel.transport.command.codec;

import java.nio.charset.Charset;

import com.alibaba.csp.sentinel.config.SentinelConfig;

/**
 * Encode a string to a byte array.
 *
 * @author Eric Zhao
 */
public class StringEncoder implements Encoder<String> {

    @Override
    public boolean canEncode(Class<?> clazz) {
        return String.class.isAssignableFrom(clazz);
    }



    @Override
    public byte[] encode(String string, Charset charset) {
        return string.getBytes(charset);
    }

    @Override
    public byte[] encode(String s) {
        return encode(s, Charset.forName(SentinelConfig.charset()));
    }
}
