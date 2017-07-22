package org.febit.wit.demo.jfinal;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import org.febit.wit.support.jfinal.WitRenderFactory;

public class DemoConfig extends JFinalConfig {

    /**
     * 配置常量
     */
    @Override
    public void configConstant(Constants me) {
        WitRenderFactory factory = new WitRenderFactory(".wit");
        //factory.setConfigPath("/WEB-INF/your/templates/path");
        me.setMainRenderFactory(factory);
    }

    /**
     * 配置路由
     */
    @Override
    public void configRoute(Routes me) {
        me.add("/", CommonController.class);
    }

    /**
     * 配置插件
     */
    @Override
    public void configPlugin(Plugins me) {
    }

    /**
     * 配置全局拦截器
     */
    @Override
    public void configInterceptor(Interceptors me) {
    }

    /**
     * 配置处理器
     */
    @Override
    public void configHandler(Handlers me) {
        me.add(new ContextPathHandler("basePath"));
    }
}
