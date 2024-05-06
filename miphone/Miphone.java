

public class Miphone {
    public static void main(String[] args) {
        System.out.println("Miphone");

      Device miphone = new Device("Miphone");

        miphone.answerCall();
        miphone.initializeVoiceMail();
        miphone.selectTrack("Don't stop me now");
        miphone.play();
        miphone.displayPage();
        miphone.openNewTab();


    }
}