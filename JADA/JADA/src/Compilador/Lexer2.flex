package Compilador;
import static Compilador.Token.*;
%%
%class Lexer
%line   
%type Token

%{   
public String lexeme;
public int linea;
%}
L=[a-zA-Z]
D=[0-9]
CAA=["["]
CCA=["]"]
SMA=[+]
SME=[-]
CA=[\"]
SD=[/]
SP=[*]
PC=[;]
PA=[(]
PCE=[)]
LA=[{]
LC=[}]
IG=[=]
MY=[>]
MN=[<]
COM=[,]
PU=[.]
SMI=["$""&""?""¿""!""¿""%"]
WHITE=[ \t\r\n]



%{

%}
%%

({WHITE})* {/* ignore */}
"//".* {/* ignore */}
("/*")(({SMI})|({COM})|({PU})|({IG})|({L})|({D})|({CAA})|({CCA})|({SMA})|({SME})|({CA})|({SD})|({SP})|({PC})|({PA})|({PCE})|({LA})|({LC})|({WHITE}))*("*/") {/* ignore */}
"playNote"|"main" {lexeme=yytext(); linea=yyline; return FUNCIONRESERVADA;}
"int"|"Tempo"|"BPM"|"Genre"|"Name"|"Metre"|"def"|"for"|"#defproperties"|"#endproperties"|"#define"|"program"|"String"|"call" {lexeme=yytext(); linea=yyline; return PALABRARESERVADA;}
"#E4"|"#F4"|"#G4"|"#A4"|"#B4"|"#C5"|"#D5"|"#F4s"|"#G4s"|"#A4s"|"#C5s"|"#D5s"|"#E5"|"#F5"|"#G5"|"#A5"|"#B5"|"#C6"|"#D6"|"#F5s"|"#G5s"|"#A5s"|"#C6s"|"#D6s"|"#E6" {lexeme=yytext(); linea=yyline; return PITCH_NOTATION;}
"E_STRING"|"A_STRING"|"D_STRING"|"G_STRING"|"B_STRING"|"e_STRING" {lexeme=yytext(); linea=yyline; return NOTE_STRING;}
"QUADRUPLE_WHOLE_NOTE" | "DOUBLE_WHOLE_NOTE" | "WHOLE_NOTE" | "HALF_NOTE" | "QUARTER_NOTE" | "EIGHTH_NOTE" | "SIXTEENTH_NOTE" {lexeme=yytext(); linea=yyline; return NOTE_VALUE;}
{L}({L}|{D}|"_")* {lexeme=yytext(); linea=yyline; return ID;}
({SMA}|{SME})?{D}+ {lexeme=yytext(); linea=yyline; return INT;}
({CA})({L}|{D})*({CA}) {lexeme=yytext(); linea=yyline; return CADENA;}
{SD} {lexeme=yytext(); linea=yyline; return SIGNODIVISION;}
{SMA} {lexeme=yytext(); linea=yyline; return SIGNOMAS;}
{SME} {lexeme=yytext(); linea=yyline; return SIGNOMENOS;}
{SP} {lexeme=yytext(); linea=yyline; return SIGNOPOR;}
{LC} {lexeme=yytext(); linea=yyline; return LLAVECERRADO;}
{LA} {lexeme=yytext(); linea=yyline; return LLAVEABIERTO;}
{PA} {lexeme=yytext(); linea=yyline; return PARENTECISABIERTO;}
{PCE} {lexeme=yytext(); linea=yyline; return PARENTECISCERRADO;}
{PC} {lexeme=yytext(); linea=yyline; return PUNTOYCOMA;}
{SMA} {lexeme=yytext(); linea=yyline; return SIGNOMAS;}
{SME} {lexeme=yytext(); linea=yyline; return SIGNOMENOS;}
{CCA} {lexeme=yytext(); linea=yyline; return CORCHETECERRADO;}
{CAA} {lexeme=yytext(); linea=yyline; return CORCHETEABIERTO;} 
{IG} {lexeme=yytext(); linea=yyline; return IGUAL;}
{MY}|{MN}|{IG}{IG}|{MY}{IG}|{MN}{IG} {lexeme=yytext(); linea=yyline; return COMPARACION;}
{PU} {lexeme=yytext(); linea=yyline; return COMA;}
{COM} {lexeme=yytext(); linea=yyline; return PUNTO;}
({L}|{D}|{SMI})+ {lexeme=yytext(); linea=yyline; return CADERROR;}

. {return ERROR;}