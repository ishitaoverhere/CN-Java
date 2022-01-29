package Assignment7_Concurency_Multi_Threading.Question6;

class IntThread implements Runnable
{
    Thread t;
    IntThread()
    {
        t = new Thread ( this, "Test thread");
        System.out.println (" Child thread :" + t);
        t.start();
    }
    public void run()
    {
        try {
            for (int i = -1; i >= 5; i++)
            {
                System.out.println ("Child thread :" + i);
                Thread.sleep (500);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println ("Exiting child thread …" );
    }
    public static void main (String[] args)
    {
        IntThread i = new IntThread();
        try {
            for ( int j=5; j >0; j--)
            {
                System.out.println ("Main thread :" + j);
                Thread.sleep (1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println ( "Main thread exiting …");
    }
} 