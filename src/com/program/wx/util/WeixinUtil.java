package com.program.wx.util;

import com.jfinal.kit.PropKit;
import com.jfinal.weixin.sdk.api.ApiConfig;

public class WeixinUtil {

	public static ApiConfig getApiConfig() {
		// TODO Auto-generated method stub
		ApiConfig ac = new ApiConfig();
		 
	    // 配置微信 API 相关常量
	    ac.setToken(PropKit.get("token"));
	    ac.setAppId(PropKit.get("appId"));
	    ac.setAppSecret(PropKit.get("appSecret"));
	 
	    /**
	     *  是否对消息进行加密，对应于微信平台的消息加解密方式：
	     *  1：true进行加密且必须配置 encodingAesKey
	     *  2：false采用明文模式，同时也支持混合模式
	     */
	    ac.setEncryptMessage(PropKit.getBoolean("encryptMessage"));
	    ac.setEncodingAesKey(PropKit.get("encodingAesKey"));
		return ac;
	}
	
}
