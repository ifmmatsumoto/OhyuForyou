package com.c4c.oyfy;

/**
 * エラーハンドリングクラス
 */
public class OyfyException extends Exception {

    public OyfyException() {
    }

    public OyfyException(String message) {
        super(message);
    }

    public OyfyException(Throwable cause) {
        super(cause);
    }

    public OyfyException(String message, Throwable cause) {
        super(message, cause);
    }

}
