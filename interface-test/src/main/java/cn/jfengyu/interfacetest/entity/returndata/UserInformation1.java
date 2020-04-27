package cn.jfengyu.interfacetest.entity.returndata;

/**
 * @author jfengyu
 * @create 2020-04-23 14:59
 */
public class UserInformation1 {
    private String avatarImgUrl;
    private String nickname;
    private Integer followNumber;
    private Integer fansNumber;

    public UserInformation1() {
    }

    public UserInformation1(String avatarImgUrl, String nickname, Integer followNumber, Integer fansNumber) {
        this.avatarImgUrl = avatarImgUrl;
        this.nickname = nickname;
        this.followNumber = followNumber;
        this.fansNumber = fansNumber;
    }

    @Override
    public String toString() {
        return "UserInformation1{" +
                "avatarImgUrl='" + avatarImgUrl + '\'' +
                ", nickname='" + nickname + '\'' +
                ", followNumber=" + followNumber +
                ", fansNumber=" + fansNumber +
                '}';
    }

    public String getAvatarImgUrl() {
        return avatarImgUrl;
    }

    public void setAvatarImgUrl(String avatarImgUrl) {
        this.avatarImgUrl = avatarImgUrl;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getFollowNumber() {
        return followNumber;
    }

    public void setFollowNumber(Integer followNumber) {
        this.followNumber = followNumber;
    }

    public Integer getFansNumber() {
        return fansNumber;
    }

    public void setFansNumber(Integer fansNumber) {
        this.fansNumber = fansNumber;
    }
}
