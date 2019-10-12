import java.util.ArrayList;

public class Channel implements Subject {
  private ArrayList<Observer> observers = new ArrayList<Observer>();
  private String channelName;
  private String status;

  public Channel(String channelName, String status){
    this.channelName = channelName;
    this.status = status;
  }

  public String getChannelName(){
    return this.channelName;
  }

  public void setChannelName(String channelName){
    this.channelName = channelName;
  }

  public String getStatus(){
    return this.status;
  }

  public void setStatus(String status){
    this.status = status;
    notifyObserver();
  }

  public void notifyObserver(){
    for(Observer obs: observers){
      obs.update(this.status);
    }
  }

  public void registerObserver(Observer observer){
    observers.add(observer);
  }

  public void removeObserver(Observer observer){
    observers.remove(observer);
  }
}
