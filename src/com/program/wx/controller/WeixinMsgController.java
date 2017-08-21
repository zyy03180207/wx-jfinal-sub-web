package com.program.wx.controller;

import com.jfinal.kit.PropKit;
import com.jfinal.weixin.sdk.api.ApiConfig;
import com.jfinal.weixin.sdk.jfinal.MsgController;
import com.jfinal.weixin.sdk.msg.in.InImageMsg;
import com.jfinal.weixin.sdk.msg.in.InLinkMsg;
import com.jfinal.weixin.sdk.msg.in.InLocationMsg;
import com.jfinal.weixin.sdk.msg.in.InNotDefinedMsg;
import com.jfinal.weixin.sdk.msg.in.InShortVideoMsg;
import com.jfinal.weixin.sdk.msg.in.InTextMsg;
import com.jfinal.weixin.sdk.msg.in.InVideoMsg;
import com.jfinal.weixin.sdk.msg.in.InVoiceMsg;
import com.jfinal.weixin.sdk.msg.in.event.InCustomEvent;
import com.jfinal.weixin.sdk.msg.in.event.InFollowEvent;
import com.jfinal.weixin.sdk.msg.in.event.InLocationEvent;
import com.jfinal.weixin.sdk.msg.in.event.InMassEvent;
import com.jfinal.weixin.sdk.msg.in.event.InMenuEvent;
import com.jfinal.weixin.sdk.msg.in.event.InMerChantOrderEvent;
import com.jfinal.weixin.sdk.msg.in.event.InNotDefinedEvent;
import com.jfinal.weixin.sdk.msg.in.event.InPoiCheckNotifyEvent;
import com.jfinal.weixin.sdk.msg.in.event.InQrCodeEvent;
import com.jfinal.weixin.sdk.msg.in.event.InShakearoundUserShakeEvent;
import com.jfinal.weixin.sdk.msg.in.event.InSubmitMemberCardEvent;
import com.jfinal.weixin.sdk.msg.in.event.InTemplateMsgEvent;
import com.jfinal.weixin.sdk.msg.in.event.InUpdateMemberCardEvent;
import com.jfinal.weixin.sdk.msg.in.event.InUserPayFromCardEvent;
import com.jfinal.weixin.sdk.msg.in.event.InUserViewCardEvent;
import com.jfinal.weixin.sdk.msg.in.event.InVerifyFailEvent;
import com.jfinal.weixin.sdk.msg.in.event.InVerifySuccessEvent;
import com.jfinal.weixin.sdk.msg.in.event.InWifiEvent;
import com.jfinal.weixin.sdk.msg.in.speech_recognition.InSpeechRecognitionResults;
import com.jfinal.weixin.sdk.msg.out.OutMsg;
import com.jfinal.weixin.sdk.msg.out.OutTextMsg;
import com.program.wx.util.WeixinUtil;

public class WeixinMsgController extends MsgController {

	@Override
	public ApiConfig getApiConfig() {
		// TODO Auto-generated method stub
		return WeixinUtil.getApiConfig();
	}

	@Override
	protected void processInTextMsg(InTextMsg inTextMsg) {
		// TODO Auto-generated method stub
		String content = inTextMsg.getContent();
		OutTextMsg outTextMsg = new OutTextMsg(inTextMsg);
		switch (content) {
		case "help":
		case "帮助":
			outTextMsg.setContent("你想要的功能我们还没有开发！");
			break;
		case "1":
			outTextMsg.setContent("你好？");
			break;
		case "2":
			outTextMsg.setContent("你好？");
			break;
		case "3":
			outTextMsg.setContent("你好？");
			break;
		case "4":
			outTextMsg.setContent("你想要的功能我们还没有开发！");
			break;
		case "5":
			outTextMsg.setContent("你想要的功能我们还没有开发！");
			break;
		default:
			outTextMsg.setContent("你想要的功能我们还没有开发！");
			break;
		}
		render(outTextMsg);
	}

	@Override
	protected void processInImageMsg(InImageMsg inImageMsg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void processInVoiceMsg(InVoiceMsg inVoiceMsg) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInVideoMsg(InVideoMsg inVideoMsg) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInShortVideoMsg(InShortVideoMsg inShortVideoMsg) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInLocationMsg(InLocationMsg inLocationMsg) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInLinkMsg(InLinkMsg inLinkMsg) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInCustomEvent(InCustomEvent inCustomEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInFollowEvent(InFollowEvent inFollowEvent) {
		// TODO Auto-generated method stub
		OutTextMsg outTextMsg = new OutTextMsg(inFollowEvent);
		outTextMsg.setContent("你好,感谢您的关注");
		render(outTextMsg);
	}

	@Override
	protected void processInQrCodeEvent(InQrCodeEvent inQrCodeEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInLocationEvent(InLocationEvent inLocationEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInMassEvent(InMassEvent inMassEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInMenuEvent(InMenuEvent inMenuEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInSpeechRecognitionResults(InSpeechRecognitionResults inSpeechRecognitionResults) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInTemplateMsgEvent(InTemplateMsgEvent inTemplateMsgEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInShakearoundUserShakeEvent(InShakearoundUserShakeEvent inShakearoundUserShakeEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInVerifySuccessEvent(InVerifySuccessEvent inVerifySuccessEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInVerifyFailEvent(InVerifyFailEvent inVerifyFailEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInPoiCheckNotifyEvent(InPoiCheckNotifyEvent inPoiCheckNotifyEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInWifiEvent(InWifiEvent inWifiEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInUserViewCardEvent(InUserViewCardEvent inUserViewCardEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInSubmitMemberCardEvent(InSubmitMemberCardEvent inSubmitMemberCardEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInUpdateMemberCardEvent(InUpdateMemberCardEvent inUpdateMemberCardEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInUserPayFromCardEvent(InUserPayFromCardEvent inUserPayFromCardEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInMerChantOrderEvent(InMerChantOrderEvent inMerChantOrderEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processIsNotDefinedEvent(InNotDefinedEvent inNotDefinedEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processIsNotDefinedMsg(InNotDefinedMsg inNotDefinedMsg) {
		// TODO Auto-generated method stub

	}

}
