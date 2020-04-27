package cn.jfengyu.interfacetest.entity.returndata.gameInfromation2;

/**
 * @author jfengyu
 * @create 2020-04-25 10:18
 */
public class GameInformation2GamerRecomended {
    private String avatarUrl;
    private String nickname;
    private String label;

    public GameInformation2GamerRecomended() {
    }

    public GameInformation2GamerRecomended(String avatarUrl, String nickname, String label) {
        this.avatarUrl = avatarUrl;
        this.nickname = nickname;
        this.label = label;
    }

    @Override
    public String toString() {
        return "GameInformation2GamerRecomended{" +
                "avatarUrl='" + avatarUrl + '\'' +
                ", nickname='" + nickname + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
