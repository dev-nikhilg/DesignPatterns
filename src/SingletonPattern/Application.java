package SingletonPattern;

public class Application {

  public static void main(String[] args) {  
    Thread one = new Thread(new ThreadOne());
    Thread two = new Thread(new ThreadTwo());
    
    one.start();
    two.start();
  }
  
  public static class ThreadOne implements Runnable {

    @Override
    public void run() {
      Database db = Database.getInstance("Thread One");
      System.out.println(db);
      System.out.println(db.getValue());
    }
  }
  
  public static class ThreadTwo implements Runnable {

    @Override
    public void run() {
      Database db = Database.getInstance("Thread Two");
      System.out.println(db);
      System.out.println(db.getValue());
    }
  }
}
