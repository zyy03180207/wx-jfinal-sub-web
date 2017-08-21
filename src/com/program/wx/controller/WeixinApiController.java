package com.program.wx.controller;

import com.jfinal.kit.PropKit;
import com.jfinal.weixin.sdk.api.AccessTokenApi;
import com.jfinal.weixin.sdk.api.ApiConfig;
import com.jfinal.weixin.sdk.api.ApiConfigKit;
import com.jfinal.weixin.sdk.api.ApiResult;
import com.jfinal.weixin.sdk.api.MenuApi;
import com.jfinal.weixin.sdk.api.UserApi;
import com.jfinal.weixin.sdk.jfinal.ApiController;
import com.program.wx.util.WeixinUtil;

public class WeixinApiController extends ApiController {

	@Override
	public ApiConfig getApiConfig() {
		// TODO Auto-generated method stub
		return WeixinUtil.getApiConfig();
	}

	/**
	 * 获取公众号菜单
	 */
	public void getMenu() {
		ApiResult apiResult = MenuApi.getMenu();
		if (apiResult.isSucceed())
			renderText(apiResult.getJson());
		else
			renderText(apiResult.getErrorMsg());
	}

	/**
	 * 创建菜单
	 */
	public void createMenu() {
		String str = "{\n" + "    \"button\": [\n" + "        {\n" + "            \"name\": \"进入理财\",\n"
				+ "            \"url\": \"http://m.bajie8.com/bajie/enter\",\n" + "            \"type\": \"view\"\n"
				+ "        },\n" + "        {\n" + "            \"name\": \"安全保障\",\n"
				+ "            \"key\": \"112\",\n" + "\t    \"type\": \"click\"\n" + "        },\n" + "        {\n"
				+ "\t    \"name\": \"使用帮助\",\n" + "\t    \"url\": \"http://m.bajie8.com/footer/cjwt\",\n"
				+ "\t    \"type\": \"view\"\n" + "        }\n" + "    ]\n" + "}";
		ApiResult apiResult = MenuApi.createMenu(str);
		if (apiResult.isSucceed())
			renderText(apiResult.getJson());
		else
			renderText(apiResult.getErrorMsg());
	}

	/**
	 * 获取公众号关注用户
	 */
	public void getFollowers() {
		ApiResult apiResult = UserApi.getFollows();
		renderText(apiResult.getJson());
	}

	public void getAccessToken() {
		String ss = AccessTokenApi.getAccessToken().getAccessToken();
		System.out.println(ss);
	}

}
