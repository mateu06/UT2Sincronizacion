
public class DemoProducerConsumer
{
  public static void main(String [] args) throws InterruptedException
  {
     Buffer b = new Buffer(4);
     ProducerThread p = new ProducerThread(b);
     ConsumerThread c = new ConsumerThread(b);

     p.start();
     c.start();
  }
}