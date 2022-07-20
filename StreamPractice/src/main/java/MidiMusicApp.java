/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;
/**
 *
 * @author mooshahe
 */
public class MidiMusicApp {
    public static void main(String[] args) {
        MidiMusicApp mini = new MidiMusicApp();
        
    }
    
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();
            
            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(NOTE_ON,1,20,100);
            //(message,channel, note to play, velocity)
            //channel is each instrument. 1 for piano, 9 for drums
            MidiEvent noteOn = new MidiEvent(msg1,1);
            track.add(noteOn);
            
            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(NOTE_OFF,1,44,100);
            MidiEvent noteOff = new MidiEvent(msg2,16);
            track.add(noteOff);
            
            player.setSequence(seq);
            player.start();
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}