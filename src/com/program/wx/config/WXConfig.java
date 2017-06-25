package com.program.wx.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.program.wx.controller.IndexController;

public class WXConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
		PropKit.use("little_config.txt");
		me.setViewType(ViewType.JSP);
		me.setDevMode(true);
	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
		me.add("/", IndexController.class, "/pages");
	}

	public static C3p0Plugin createDruidPlugin() {
		String jdbcUrl = new String(PropKit.get("jdbcUrl"));
		String driver = PropKit.get("driverClass");
		String username = new String(PropKit.get("username"));
		String password = new String(PropKit.get("password"));
		return new C3p0Plugin(jdbcUrl, username, password, driver);
	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
		C3p0Plugin plugin = createDruidPlugin();
		me.add(plugin);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(plugin);
		arp.setShowSql(true);
		arp.setDialect(new MysqlDialect());
		me.add(arp);
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}

}
