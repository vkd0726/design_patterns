public class Follower implements Observer {
  private String followerName;

  public Follower(String followerName){
    this.followerName = followerName;
  }

  public String getFollowerName(){
    return this.followerName;
  }

  public void setFollowerName(String followerName){
    this.followerName = followerName;
  }

  public void update(String status){
    // send message to followers that the Channel is live.
  }

  public void play(){
    // play channel
  }
}
