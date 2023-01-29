package SingletonPattern;

public class Database {
  
  private static Database instance;
  private String value;

  private Database(String value) {
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    this.value = value;
  }
  
  public static Database getInstance(String value) {
    if (instance == null) {
      synchronized(Database.class) {
        if (instance == null) {
          instance = new Database(value);
        }
      }
    }
    return instance;
  }
  
  public String getValue() {
    return value;
  }
  
  public void query(String queryString) {
    // Perform query
  }
}
