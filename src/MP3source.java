/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Map;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javazoom.jlgui.basicplayer.BasicPlayer;
import org.tritonus.share.sampled.file.TAudioFileFormat;
/**
 *
 * @author marco_197
 */

/**
*Aqui empieza la clase de mp3source que es la que permite reproducir
*
*/
public class MP3source {
    private BasicPlayer Player;
 /**
  *Aqui estan los metodos para 
  */
public MP3source()
        
{
    Player=new BasicPlayer();
}
 
 
      public void Play() throws Exception
      {
      Player.play();
      }
 
 
 
      public void AbrirFichero(String archivo) throws Exception
      {
 
          Player.open(new File(archivo));
      }
 
 
 
      public void Pausa() throws Exception {
 
      Player.pause();
 
      }
 
 
 
      public void Continuar() throws Exception {
 
      Player.resume();
 
      }
 
 
 
      public void Stop() throws Exception {
 
      Player.stop();
 
      }
     
      public static void getTime(File file) throws UnsupportedAudioFileException, IOException {

    AudioFileFormat fileFormat = AudioSystem.getAudioFileFormat(file);
    if (fileFormat instanceof TAudioFileFormat) {
        Map<?, ?> properties = ((TAudioFileFormat) fileFormat).properties();
        String key = "duration";
        Long microseconds = (Long) properties.get(key);
        int mili = (int) (microseconds / 1000);
        int sec = (mili / 1000) % 60;
        int min = (mili / 1000) / 60;
        System.out.println("time = " + min + ":" + sec);
    } else {
        throw new UnsupportedAudioFileException();
    }

}
}
