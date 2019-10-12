public class Follower implements Observer {
  private String followerName;
  private String status;

  public void update(String status){
    this.status = status;
  }

  public void play(){
    System.out.print("play ");
  }
}
