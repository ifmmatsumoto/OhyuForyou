/**
 *
 */
package com.c4c.oyfy.app.top;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author mmasa
 *
 */

@Data
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NearByBathForm {
    private static final long serialVersionUID = 1L;
    /** 現在地検索用 経度 */
    double longitude;
    /** 現在地検索用 緯度 */
    double latitude;
}
