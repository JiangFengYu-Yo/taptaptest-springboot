package cn.jfengyu.interfacetest.controller;

import cn.jfengyu.interfacetest.entity.CommonResult;
import cn.jfengyu.interfacetest.entity.returndata.GameInformation1;
import cn.jfengyu.interfacetest.entity.returndata.GameInformation2;
import cn.jfengyu.interfacetest.entity.returndata.UserInformation1;
import cn.jfengyu.interfacetest.entity.returndata.gameInfromation2.GameInformation2GamerRecomended;
import cn.jfengyu.interfacetest.entity.returndata.gameInfromation2.GameInformation2LabelContent;
import cn.jfengyu.interfacetest.entity.returndata.gameInfromation2.GameInformation2LabelLine;
import cn.jfengyu.interfacetest.entity.returndata.gameInfromation2.GameInformation2Swipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jfengyu
 * @create 2020-04-23 14:31
 */
@RestController
public class MainController {
    @GetMapping(value = "/user/userInformation", produces = {"application/json;charset=UTF-8"})
    public CommonResult<UserInformation1> GetUserUserInformation() {
        return new CommonResult<UserInformation1>(200, "ok", new UserInformation1("https://s1.ax1x.com/2020/04/22/JUmPuq.png", "吟阙思町", 50, 0));
    }

    @GetMapping(value = "/game/gameInformation1", produces = {"application/json;charset=UTF-8"})
    public CommonResult<List<GameInformation1>> getGameInformation() {
        List<GameInformation1> gameInformation1s = new ArrayList<>();
        gameInformation1s.add(new GameInformation1("https://s1.ax1x.com/2020/04/25/Jsys6x.png", "命运神界", "CN", "来自广告", 7.3, 1984, "https://s1.ax1x.com/2020/04/25/JsgSmV.png", "入梦之境，重塑真实"));
        gameInformation1s.add(new GameInformation1("https://s1.ax1x.com/2020/04/24/JBynKS.png", "未来风暴", "CN", "来自广告", 6.3, 2134, "https://s1.ax1x.com/2020/04/24/JBygKO.png", "军事与科幻的即时策略对战"));
        gameInformation1s.add(new GameInformation1("https://s1.ax1x.com/2020/04/24/JByvIs.png", "烟雨江湖", "预约", "来自广告", 7.2, 5765, "https://s1.ax1x.com/2020/04/24/JB6FLF.png", "没有一拳999，没有无脑点点点，国风武侠，精致剧情，开放世界，就等你"));
        gameInformation1s.add(new GameInformation1("https://s1.ax1x.com/2020/04/24/JB6AZ4.png", "南瓜先生2九龙城寨（内购版）", "CN", "编辑推荐", 9.6, 480, "https://s1.ax1x.com/2020/04/24/JB6eiR.png", "跟随南瓜先生，一睹围城的人间百态"));
        gameInformation1s.add(new GameInformation1("https://s1.ax1x.com/2020/04/24/JB6God.png", "元素地牢", "CN", "编辑推荐", 4.6, 5703, "https://s1.ax1x.com/2020/04/24/JB6NWt.png", "融合元素配置多变技能，挑战未知地牢"));
        gameInformation1s.add(new GameInformation1("https://s1.ax1x.com/2020/04/24/JB6WlV.png", "浅塘", "", "编辑推荐", 9.4, 17347, "https://s1.ax1x.com/2020/04/24/JB6bf1.png", "一条游鱼，一湾浅塘的惬意益智游戏"));
        gameInformation1s.add(new GameInformation1("https://s1.ax1x.com/2020/04/24/JBcFpt.png", "奇葩战斗家", "", "编辑推荐", 8.7, 19223, "https://s1.ax1x.com/2020/04/24/JBcm7Q.png", "奇葩武器搭技能，火力全开大乱斗"));
        return new CommonResult<>(200, "ok", gameInformation1s);
    }

    @GetMapping(value = "/game/gameInformation2", produces = {"application/json;charset=UTF-8"})
    public CommonResult<GameInformation2> getGameInformation2() {
        ArrayList<GameInformation2Swipe> swipes = new ArrayList<>();
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<GameInformation2LabelLine> labelLines = new ArrayList<>();
        ArrayList<GameInformation2GamerRecomended> gamerRecomendeds = new ArrayList<>();

        swipes.add(new GameInformation2Swipe("https://s1.ax1x.com/2020/04/25/JsmPPI.png", 87));
        swipes.add(new GameInformation2Swipe("https://s1.ax1x.com/2020/04/25/JsmMin.png", 41));
        swipes.add(new GameInformation2Swipe("https://s1.ax1x.com/2020/04/25/JsmJLF.png", 249));

        labels.add("往期推荐");
        labels.add("TapTap独家");
        labels.add("单机");
        labels.add("角色扮演");
        labels.add("动作");
        labels.add("MOBA");
        labels.add("策略");
        labels.add("卡牌");
        labels.add("生存");
        labels.add("模拟");
        labels.add("竞速");
        labels.add("益智");
        labels.add("二次元");

        List<GameInformation2LabelContent> c1 = new ArrayList<>();
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/Jsnd0g.png", "随大同（测试版）"));
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/Jsn5N9.png", "脚本塔防（测试版）"));
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/Jsn71x.png", "企鹅侦探（测试服）"));
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsnOBD.png", "仙剑奇侠传九野（测试服）"));
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/Jsup9I.png", "快乐拼图"));
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsuCgP.png", "奇想夜物语（测试服）"));
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsuPjf.png", "冲刺赛车物语2"));
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsuVEQ.png", "冰之动物园（测试版）"));
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsunCn.png", "失落王冠"));
        c1.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/Jsu3bF.png", "一字不落（测试版）"));
        labelLines.add(new GameInformation2LabelLine("每日新发现", c1));

        List<GameInformation2LabelContent> c2 = new ArrayList<>();
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKGsf.png", "新网球王子 RisingBeat"));
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKNdg.png", "怪蛋迷宫"));
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKdij.png", "萌趣医院"));
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKsyV.png", "山海镜花"));
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsK2o4.png", "伊甸启示录"));
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKhWR.png", "一人之下"));
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKIQx.png", "奥奇传说"));
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKqTe.png", "远征岛"));
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsMCm8.png", "山村老屋2之废弃医院"));
        c2.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsMkkQ.png", "扔蛋达人"));
        labelLines.add(new GameInformation2LabelLine("新游预约", c2));

        List<GameInformation2LabelContent> c3 = new ArrayList<>();
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsMRnf.png", "课堂大作战"));
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsM4Ag.png", "穿梭物语（测试版）"));
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsMxN4.png", "ZOMBIE BATTLEGROUNDS"));
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsQPjx.png", "Everybody has to pay"));
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsQNCj.png", "疯狂农场2:披萨派对! (Farm Frenzy 2: Pizza Party!)"));
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsQDbT.png", "砖块地牢"));
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsQ654.png", "斗图大乱斗"));
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/24/JB6God.png", "元素地牢"));
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/24/JB6AZ4.png", "九龙城寨"));
        c3.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/24/JByvIs.png", "烟雨江湖"));
        labelLines.add(new GameInformation2LabelLine("你可能感兴趣", c3));


        List<GameInformation2LabelContent> c4 = new ArrayList<>();
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKGsf.png", "新网球王子 RisingBeat"));
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKNdg.png", "怪蛋迷宫"));
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKdij.png", "萌趣医院"));
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKsyV.png", "山海镜花"));
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsK2o4.png", "伊甸启示录"));
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKhWR.png", "一人之下"));
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKIQx.png", "奥奇传说"));
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsKqTe.png", "远征岛"));
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsMCm8.png", "山村老屋2之废弃医院"));
        c4.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsMkkQ.png", "扔蛋达人"));
        labelLines.add(new GameInformation2LabelLine("往期专题", c4));

        List<GameInformation2LabelContent> c5 = new ArrayList<>();
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsMRnf.png", "课堂大作战"));
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsM4Ag.png", "穿梭物语（测试版）"));
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsMxN4.png", "ZOMBIE BATTLEGROUNDS"));
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsQPjx.png", "Everybody has to pay"));
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsQNCj.png", "疯狂农场2:披萨派对! (Farm Frenzy 2: Pizza Party!)"));
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsQDbT.png", "砖块地牢"));
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/25/JsQ654.png", "斗图大乱斗"));
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/24/JB6God.png", "元素地牢"));
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/24/JB6AZ4.png", "九龙城寨"));
        c5.add(new GameInformation2LabelContent("https://s1.ax1x.com/2020/04/24/JByvIs.png", "烟雨江湖"));
        labelLines.add(new GameInformation2LabelLine("游戏测试", c5));

        {
//        List<GameInformation2LabelContent> c6 = new ArrayList<>();
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        labelLines.add(new GameInformation2LabelLine("最近更新", c6));
//
//        List<GameInformation2LabelContent> c7 = new ArrayList<>();
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        labelLines.add(new GameInformation2LabelLine("近期最热", c7));
//
//        List<GameInformation2LabelContent> c8 = new ArrayList<>();
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        labelLines.add(new GameInformation2LabelLine("JapJap 篝火计划", c8));
//
//        List<GameInformation2LabelContent> c9 = new ArrayList<>();
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        labelLines.add(new GameInformation2LabelLine("一周新游预约榜（4.10-4.17）", c9));
//
//        List<GameInformation2LabelContent> c10 = new ArrayList<>();
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        labelLines.add(new GameInformation2LabelLine("轻松休闲，可爱相伴", c10));
//
//        List<GameInformation2LabelContent> c11 = new ArrayList<>();
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        labelLines.add(new GameInformation2LabelLine("", c11));
//
//        List<GameInformation2LabelContent> c12 = new ArrayList<>();
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        labelLines.add(new GameInformation2LabelLine("单机", c12));
//
//        List<GameInformation2LabelContent> c13 = new ArrayList<>();
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        labelLines.add(new GameInformation2LabelLine("射击", c13));
//
//        List<GameInformation2LabelContent> c14 = new ArrayList<>();
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        c2.add(new GameInformation2LabelContent("", ""));
//        labelLines.add(new GameInformation2LabelLine("模拟", c14));
        }

        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/JssRWn.png", "忘我萝卜", "Jap Jap玩赏家"));
        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/Jss5LT.png", "白琉冷冷子", "Jap Jap玩赏家"));
        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/JssoeU.png", "四季春の如し", "Jap Jap玩赏家"));
        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/Jss7o4.png", "lafeio", "《军团战旗》开发者"));
        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/JssxOK.png", "脱皮芝麻", "Jap Jap玩赏家"));
        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/JsyiYd.png", "考拉", "Jap Jap玩赏家"));
        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/JsyFfA.png", "百花的缭乱", "Jap Jap玩赏家"));
        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/Jsylfs.png", "湫霖", "Jap Jap玩赏家"));
        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/JsyuTg.png", "沐枫", "Jap Jap玩赏家"));
        gamerRecomendeds.add(new GameInformation2GamerRecomended("https://s1.ax1x.com/2020/04/25/JsyV6P.png", "进击的二极管", "原创视频作者"));

        GameInformation2 gameInformation2 = new GameInformation2();
        gameInformation2.setSwipes(swipes);
        gameInformation2.setLabels(labels);
        gameInformation2.setLabelLines(labelLines);
        gameInformation2.setGamerRecomendeds(gamerRecomendeds);

        return new CommonResult<>(200, "ok", gameInformation2);
    }
}
