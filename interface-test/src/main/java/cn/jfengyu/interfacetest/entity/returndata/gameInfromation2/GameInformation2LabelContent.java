package cn.jfengyu.interfacetest.entity.returndata.gameInfromation2;

/**
 * @author jfengyu
 * @create 2020-04-25 10:14
 */
public class GameInformation2LabelContent {
    private String coverUrl;
    private String gameNameOrDescription;

    public GameInformation2LabelContent() {
    }

    public GameInformation2LabelContent(String coverUrl, String gameNameOrDescription) {
        this.coverUrl = coverUrl;
        this.gameNameOrDescription = gameNameOrDescription;
    }

    @Override
    public String toString() {
        return "GameInformation2LabelContent{" +
                "coverUrl='" + coverUrl + '\'' +
                ", gameNameOrDescription='" + gameNameOrDescription + '\'' +
                '}';
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getGameNameOrDescription() {
        return gameNameOrDescription;
    }

    public void setGameNameOrDescription(String gameNameOrDescription) {
        this.gameNameOrDescription = gameNameOrDescription;
    }
}
