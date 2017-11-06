 /* Structure of Song
	- Intro
	 - Verse
	 - Pre-Chorus
	 - Chorus
	 - Bridge
	 - Solo
	 - Outro
*/

// La definición de las propiedades de una canción


#defproperties  // Definicion 					Ejemplos
	#define Tempo 	= value; ["Andante", "Allegro", "Presto", "Prestizzimo"]
	#define BPM 	= value; [120, 130, 140]
	#define Genre 	= Value; ["Rock", "Ballad", "Pop"]
	#define Name 	= Value; ["Name"]
	#define Metre	= value; ["4/3", "4/4", "2/4"]
#endproperties

program myFirstSong{

	// https://en.wikipedia.org/wiki/Note_value
	// Palabras reservadas para la longitud de las notas

        // QUADRUPLE_WHOLE_NOTE = "4"
        // DOUBLE_WHOLE_NOTE    = "2"
        // WHOLE_NOTE           = "1"
        // HALF_NOTE            = "1/2"
        // QUARTER_NOTE         = "1/4"
        // EIGHTH_NOTE          = "1/8"
        // SIXTEENTH_NOTE       = "1/16"

	// https://en.wikipedia.org/wiki/Scientific_pitch_notation
	// De la notación estas son las notas que se trabajarán en Guitarra
	// que van desde la sexta cuerda al aire (#E4) hasta el fret (traste) 12 en la primera cuerda #E6

	//#E4 	#F4 	#G4 	#A4 	#B4 	#C5 	#D5     Notas mayores
	//		#F4s	#G4s	#A4s			#C5s	#D5s   	Notas sostenidas
	//#E5 	#F5 	#G5 	#A5 	#B5 	#C6 	#D6
	//		#F5s	#G5s	#A5s			#C6s	#D6s
	// #E6

	// Palabras reservadas para las cuerdas

	// 	E_STRING 	- 	Sexta Cuerda
	//  A_STRING 	- 	Quinta Cuerda
	//  D_STRING 	- 	Cuarta Cuerda
	// 	G_STRING 	- 	Tercera Cuerda
	// 	B_STRING 	- 	Segunda Cuerda
	// 	e_STRING 	-	Primera Cuerda

    // Palabras reservadas
    // def
    // for


    // FUNCIONES RESERVADAS
    //  playNote(Note, Note_Value, String) -- String se refiere a la cuerda en la que se tocará la nota


	def intro(){ //
            playNote(#F6, whole_note);
	}

	def verse(){
        for(int i = 0; i <= 10){
			playNote(#C7, half_note);  // Repeticion de la misma nota
        }
	}

        def verse(){ // Puede haber varias versiones de un una estructura

        }

	def Pre-chorus(nota a,nota b){
	    for(int i = 0; i <= 5){
			playNote(a, half_note);
			playNote(b, half_note);// Repeticion de la misma nota
		}
	}

	def chorus(){

	}

	def bridge(){

	}

	def outro(){

	}

	MAIN (String[] args){
			// Orden de la cancion
		CALL intro();//llamado a funcion sin parametros
		CALL verse();
		Pre-chorus(#C5, #G5);//llamado a funcion con parametros
	}

}
