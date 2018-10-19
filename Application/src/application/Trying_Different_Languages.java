package application;

import java.io.IOException;

import com.darkprograms.speech.synthesiser.SynthesiserV2;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;


public class Trying_Different_Languages {
    
	SynthesiserV2 synthesizer = new SynthesiserV2("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw");

	public Trying_Different_Languages() {
		
		//Let's speak in English
		//speak("Hello Dear Friend !");
		//Speak Chinese Fuckers
//		speak("我可以说你想要的任何语言！");
                
		speak("at");
		//Let's Speak in Somalian       
		//speak("Waxaan ku hadli karaa luqad aad rabto!");
		
		//Let's Speak in Hindi
		//speak("मैं चाहता हूं कि कोई भी भाषा बोल सकता हूँ!");
		
		//Let's Speak in Polish
		//speak("Mogę mówić dowolnym językiem, którego chcesz!");
		
		//Let's Speak in Persian       ----- This doens't work for some reason i have to figure out ... ;(
		//speak("من می توانم به هر زبان که می خواهید صحبت کنید!");
		
	}
		
	public void speak(String text) {

		Thread thread = new Thread(() -> {
			try {
                                synthesizer.setSpeed(0.5);
				AdvancedPlayer player = new AdvancedPlayer(synthesizer.getMP3Data(text));
				player.play();	
			} catch (IOException | JavaLayerException e) {
                            
				e.printStackTrace();	
                                
			}
		});
		
		thread.setDaemon(false);
		
		thread.start();
		
	}
	
	public static void main(String[] args) {
		new Trying_Different_Languages();
	}
}