public class Device implements WebBrowser, MusicPlayer{

 public String name;

    public Device(String deviceName){
        this.name = deviceName;
    }
  
    @Override
    public void refreshPage(){
        System.out.println("Printing page from "+ name);
    }
    @Override
    public void displayPage(){
        System.out.println("Displaying web page from "+ name);
    }

    @Override
    public void openNewTab(){
        System.out.println("Opening new tab in "+ name);
    }

    @Override
    public void play(){
        System.out.println("🎶 Playing music from "+ name);
    }
    
    @Override
    public void selectTrack(String songName){
        System.out.println("🎶 \""+songName+"\" is selected in your " + name);
    }

    @Override
    public void pause(){
        System.out.println(name + " is paused");
    }
    
    

    public void makeCall(){
        System.out.println("Making call from "+ name);
    }

    public void answerCall(){
        System.out.println("Answering call in " + name);
    }

    public void initializeVoiceMail(){
        System.out.println("Initializing voice mail from "+ name);
    }

}