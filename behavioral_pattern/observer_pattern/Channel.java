import java.util.ArrayList;

public class Channel implements Subject {
  private ArrayList<Observer> observers = new ArrayList<Observer>();
  private String ChannelName;
  private String status;

  public String getStatus(){
    return this.status;
  }

  public void setStatus(String status){
    this.status = status;
  }

  public void notifyObserver(){
    for(Observer o: observers){
      o.update(this.status);
    }
  }

  public void registerObserver(Observer observer){
    observers.add(observer);
  }

  public void removeObserver(Observer observer){
    observers.remove(observer);
  }
}
