package Ass19aug;

interface  musicalInstrument
{
	static void musicalInstrument()
	{
		System.out.println(" i am learn instrument" );
	}
	void play();
}
abstract class Sound
{
	abstract void listenSound();
}
class PercusssionInstrument extends Sound implements musicalInstrument
{
		@Override
		public void play() 
		{
			System.out.println("i am Percusssion Instrument");
		}
		@Override
		void listenSound() {
			
		}
}
class StringedInstrument implements musicalInstrument
{
	@Override
	public void play() 
	{
 		System.out.println("i am Stringed Instrument");
	}
}
public class MusicInstruments {

	public static void main(String[] args) 
	{
		musicalInstrument.musicalInstrument();
		PercusssionInstrument tabla= new PercusssionInstrument();
		tabla.play();
		StringedInstrument violin =new StringedInstrument();
		violin.play();
	}

}
