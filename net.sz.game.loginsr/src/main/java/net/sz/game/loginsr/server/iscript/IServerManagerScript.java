package net.sz.game.loginsr.server.iscript;

import net.sz.framework.scripts.IInitBaseScript;

/**
 *
 * <br>
 * author 失足程序员<br>
 * blog http://www.cnblogs.com/ty408/<br>
 * mail 492794628@qq.com<br>
 * phone 13882122019<br>
 */
public interface IServerManagerScript extends IInitBaseScript {

    /**
     * 获取网管信息
     */
    String getGateInfo();
}