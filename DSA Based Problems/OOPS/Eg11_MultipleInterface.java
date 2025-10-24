// Multiple inhertance can be achieved by Multiple interface 

class Phone{
    void voiceCall(){
        System.out.println("Make a voice call");
    }
    void sms(){
        System.out.println("Send a sms ");
    }
}
interface Camera{
    void click();
    void record();
}
interface Player{
    void play();
    void pause();
    void stop();
}
class SmartPhone extends Phone implements Camera,Player{
    
    public void click(){
        System.out.println("Click");
    }
    public void record(){
        System.out.println("Record");
 
    }
    
    public void play(){
        System.out.println("Play");

    }
    public void pause(){
       System.out.println("Pause");

    }
    public void stop(){
      System.out.println("stop");

    }
}
public class Main
{
	public static void main(String[] args) {
        SmartPhone s= new SmartPhone();
         s.click();
         s.record();
         s.play();
         s.pause();
         s.stop();
	}
}
