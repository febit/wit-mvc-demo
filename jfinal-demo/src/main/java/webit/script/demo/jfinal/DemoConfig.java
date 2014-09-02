package webit.script.demo.jfinal;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import webit.script.support.jfinal.WebitRenderFactory;

public class DemoConfig extends JFinalConfig {

    /**
     * 配置常量
     */
    public void configConstant(Constants me) {
        WebitRenderFactory factory = new WebitRenderFactory(".wit");
        //factory.setConfigPath("/WEB-INF/your/templates/path");
        me.setMainRenderFactory(factory);
    }

    /**
     * 配置路由
     */
    public void configRoute(Routes me) {
        me.add("/", CommonController.class);
    }

    /**
     * 配置插件
     */
    public void configPlugin(Plugins me) {
    }

    /**
     * 配置全局拦截器
     */
    public void configInterceptor(Interceptors me) {
    }

    /**
     * 配置处理器
     */
    public void configHandler(Handlers me) {
        me.add(new ContextPathHandler("basePath"));
    }
}
