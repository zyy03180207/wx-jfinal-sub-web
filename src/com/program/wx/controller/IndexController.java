package com.program.wx.controller;

import java.util.Map;

import com.jfinal.kit.HttpKit;
import com.jfinal.kit.StrKit;
import com.program.wx.util.XMLParse;

public class IndexController extends BaseController {

	public void mesg() {
		try {
			String echostr = this.getPara("echostr");
			System.out.println("参数：" + echostr);
			if (!StrKit.isBlank(echostr)) {
				this.renderText(echostr);
			} else {
				String xml = HttpKit.readData(this.getRequest());
				System.out.println("请求参数：" + xml);
				XMLParse parse = new XMLParse();
				Map<String, Object> map = parse.parse(xml);
				String xmls = "";
				switch ((String) map.get("MsgType")) {
				// 事件消息
				case "event":
					/*
					 * EventSelector eventSelector = new EventSelector(xml);
					 * xmls = eventSelector.exect();
					 */
					break;

				default:
					/*
					 * FunctionSelector functionSelector = new
					 * FunctionSelector(xml); xmls = functionSelector.exect();
					 */
					break;
				}
				System.out.println("返回参数：" + xmls);
				// 返回消息给微信
				this.renderText(xmls);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.render("success");
		}
	}

	
	public void cardList() {
		renderJsp("card_list.jsp");
	}
	
	public void cardListMain() {
		renderJsp("card_list_main.jsp");
	}
}
