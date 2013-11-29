package webit.script.demo.jfinal;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import webit.script.support.jfinal.WebitScriptRenderFactory;

public class DemoConfig extends JFinalConfig {

    /**
     * 配置常量
     */
    public void configConstant(Constants me) {
        WebitScriptRenderFactory factory = new WebitScriptRenderFactory(".wtl");
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
    }
}
