package cn.jfengyu.interfacetest.entity.returndata;

/**
 * @author jfengyu
 * @create 2020-04-24 11:50
 */
public class GameInformation1 {
    private String avatarImgUrl;
    private String gameName;
    private String label;
    private String pushBy;
    private Double Score;
    private Integer NumberOfScorePerson;
    private String coverImgUrl;
    private String brief;

    public GameInformation1() {
    }

    public GameInformation1(String avatarImgUrl, String gameName, String label, String pushBy, Double score, Integer numberOfScorePerson, String coverImgUrl, String brief) {
        this.avatarImgUrl = avatarImgUrl;
        this.gameName = gameName;
        this.label = label;
        this.pushBy = pushBy;
        Score = score;
        NumberOfScorePerson = numberOfScorePerson;
        this.coverImgUrl = coverImgUrl;
        this.brief = brief;
    }

    @Override
    public String toString() {
        return "GameInformation1{" +
                "avatarImgUrl='" + avatarImgUrl + '\'' +
                ", gameName='" + gameName + '\'' +
                ", label='" + label + '\'' +
                ", pushBy='" + pushBy + '\'' +
                ", Score=" + Score +
                ", NumberOfScorePerson=" + NumberOfScorePerson +
                ", coverImgUrl='" + coverImgUrl + '\'' +
                ", brief='" + brief + '\'' +
                '}';
    }

    public String getAvatarImgUrl() {
        return avatarImgUrl;
    }

    public void setAvatarImgUrl(String avatarImgUrl) {
        this.avatarImgUrl = avatarImgUrl;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPushBy() {
        return pushBy;
    }

    public void setPushBy(String pushBy) {
        this.pushBy = pushBy;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public Integer getNumberOfScorePerson() {
        return NumberOfScorePerson;
    }

    public void setNumberOfScorePerson(Integer numberOfScorePerson) {
        NumberOfScorePerson = numberOfScorePerson;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }
}
