package Sleep;

class sleeper extends Thread {
  public void run() {
    for (int i = 1; i < 5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      System.out.println(i);
    }
  }

  public static void main(String args[]) {
    sleeper t1 = new sleeper();
    sleeper t2 = new sleeper();

    t1.start();
    t2.start();
  }
}
