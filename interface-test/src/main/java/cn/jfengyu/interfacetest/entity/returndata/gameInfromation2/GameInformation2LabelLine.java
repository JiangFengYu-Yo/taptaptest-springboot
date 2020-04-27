package cn.jfengyu.interfacetest.entity.returndata.gameInfromation2;

import java.util.List;

/**
 * @author jfengyu
 * @create 2020-04-25 10:35
 */
public class GameInformation2LabelLine {
    private String title;
    private List<GameInformation2LabelContent> labelContents;

    public GameInformation2LabelLine() {
    }

    public GameInformation2LabelLine(String title, List<GameInformation2LabelContent> labelContents) {
        this.title = title;
        this.labelContents = labelContents;
    }

    @Override
    public String toString() {
        return "GameInformation2LabelLine{" +
                "title='" + title + '\'' +
                ", labelContents=" + labelContents +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<GameInformation2LabelContent> getLabelContents() {
        return labelContents;
    }

    public void setLabelContents(List<GameInformation2LabelContent> labelContents) {
        this.labelContents = labelContents;
    }
}
