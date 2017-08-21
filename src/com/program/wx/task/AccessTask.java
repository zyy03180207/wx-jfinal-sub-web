package com.program.wx.task;

import java.util.TimerTask;

import com.jfinal.weixin.sdk.api.AccessTokenApi;
import com.program.wx.config.Common;

public class AccessTask extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		AccessTokenApi api = new AccessTokenApi();
		Common.ACCESS_TOKEN = api.getAccessToken().getAccessToken();
		System.out.println("accessToken=" + Common.ACCESS_TOKEN);
	}

}
