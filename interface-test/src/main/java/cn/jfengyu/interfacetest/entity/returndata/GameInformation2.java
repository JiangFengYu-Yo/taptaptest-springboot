package cn.jfengyu.interfacetest.entity.returndata;

import cn.jfengyu.interfacetest.entity.returndata.gameInfromation2.GameInformation2GamerRecomended;
import cn.jfengyu.interfacetest.entity.returndata.gameInfromation2.GameInformation2LabelContent;
import cn.jfengyu.interfacetest.entity.returndata.gameInfromation2.GameInformation2LabelLine;
import cn.jfengyu.interfacetest.entity.returndata.gameInfromation2.GameInformation2Swipe;

import java.util.List;

/**
 * @author jfengyu
 * @create 2020-04-25 10:05
 */
public class GameInformation2 {
    private List<GameInformation2Swipe> swipes;
    private List<String> labels;
    private List<GameInformation2LabelLine> labelLines;
    private List<GameInformation2GamerRecomended> gamerRecomendeds;

    public GameInformation2() {
    }

    public GameInformation2(List<GameInformation2Swipe> swipes, List<String> labels, List<GameInformation2LabelLine> labelLines, List<GameInformation2GamerRecomended> gamerRecomendeds) {
        this.swipes = swipes;
        this.labels = labels;
        this.labelLines = labelLines;
        this.gamerRecomendeds = gamerRecomendeds;
    }

    @Override
    public String toString() {
        return "GameInformation2{" +
                "swipes=" + swipes +
                ", labels=" + labels +
                ", labelLines=" + labelLines +
                ", gamerRecomendeds=" + gamerRecomendeds +
                '}';
    }

    public List<GameInformation2Swipe> getSwipes() {
        return swipes;
    }

    public void setSwipes(List<GameInformation2Swipe> swipes) {
        this.swipes = swipes;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<GameInformation2LabelLine> getLabelLines() {
        return labelLines;
    }

    public void setLabelLines(List<GameInformation2LabelLine> labelLines) {
        this.labelLines = labelLines;
    }

    public List<GameInformation2GamerRecomended> getGamerRecomendeds() {
        return gamerRecomendeds;
    }

    public void setGamerRecomendeds(List<GameInformation2GamerRecomended> gamerRecomendeds) {
        this.gamerRecomendeds = gamerRecomendeds;
    }
}
