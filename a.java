import javax.sound.midi.*;
public class a{
    public static void main(String[] args){
        a miniapp = new a();
        miniapp.play();
    }

    public void play(){
        try {
            Sequencer Player = MidiSystem.getSequencer();
            Player.open();
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track t = seq.createTrack();
            ShortMessage a =new ShortMessage();
            a.setMessage(144,1,44,100);
            MidiEvent NoteOn = new MidiEvent(a,1);
            t.add(NoteOn);
            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent NoteOff = new MidiEvent(b,16);
            t.add(NoteOff);
            Player.setSequence(seq);
            Player.start();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.print(e);
        }
    }
}