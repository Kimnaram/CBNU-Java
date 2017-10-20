package sec06.exam01;

class MyTV {
	boolean isPoweron;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnONOFF() {
		isPoweron = !isPoweron;
	}
	
	void VolumeUp() {
		if(volume < MAX_VOLUME)
			volume++;
	}
	
	void VolumeDown( ) {
		if(volume > MIN_VOLUME)
			volume--;
	}
	
	void ChannelUp() {
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		else {
			channel++;
		}
	}
	
	void ChannelDown() {
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		else {
			channel--;
		}
	}
}

public class Exercise_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTV t = new MyTV();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH : "+t.channel+", VOL :"+t.volume);
		
		t.ChannelDown();
		t.VolumeDown();
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
		
		t.volume = 100;
		t.ChannelUp();
		t.VolumeUp();
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
	}

}
