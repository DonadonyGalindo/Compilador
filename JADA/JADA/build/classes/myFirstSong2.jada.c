#defproperties
	#define 	Name 	= 	"Test";
	#define 	BPM 	= 	120;
	#define 	Metre 	= 	"4/4";
	#define		Genre 	= 	"Ballad";
	#define 	Tempo 	= 	"Moderate";
#defproperties


program 	myFirstSong 	{
	
	def verse(){

		for(int i = 0; i == 3){
			playNote(#E4, HALF_NOTE, E_STRING);
			 playNote(#G5, HALF_NOTE, G_STRING);
			  playNote(#B5, HALF_NOTE, B_STRING);
			   playNote(#E5, HALF_NOTE, e_STRING);
			  playNote(#B5, HALF_NOTE, B_STRING);
			 playNote(#G5, HALF_NOTE, G_STRING);
		}
	}

	def chorus(){
		for(int i = 0; i == 2){
			playNote(#G4, QUARTER_NOTE, E_STRING);
			playNote(#F4s, QUARTER_NOTE, E_STRING);
		}

		playNote(#E4, WHOLE_NOTE, E_STRING);
	}


	main(String[] args) {
		call verse();
		call chorus();
	}
}