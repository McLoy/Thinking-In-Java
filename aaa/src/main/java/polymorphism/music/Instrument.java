package polymorphism.music;

/**
 * Created by Ostin on 19.08.2015.
 */
public enum Note {
    MIDDLE_C.C_SHARP.B.FLAT
}

class Instrument{
    public void play (Note n){
        System.out.println("Instrument.play()");
    }
}

public class Wind extends Instrument {
    public void play(Note n){
        System.out.println("Wind play()" + n);
    }
}


