package cn.jfengyu.interfacetest.entity.returndata.gameInfromation2;

/**
 * @author jfengyu
 * @create 2020-04-25 10:14
 */
public class GameInformation2Swipe {
    private String coverUrl;
    private Integer discussNumber;

    public GameInformation2Swipe() {
    }

    public GameInformation2Swipe(String coverUrl, Integer discussNumber) {
        this.coverUrl = coverUrl;
        this.discussNumber = discussNumber;
    }

    @Override
    public String toString() {
        return "GameInformation2Swipe{" +
                "coverUrl='" + coverUrl + '\'' +
                ", discussNumber=" + discussNumber +
                '}';
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Integer getDiscussNumber() {
        return discussNumber;
    }

    public void setDiscussNumber(Integer discussNumber) {
        this.discussNumber = discussNumber;
    }
}
