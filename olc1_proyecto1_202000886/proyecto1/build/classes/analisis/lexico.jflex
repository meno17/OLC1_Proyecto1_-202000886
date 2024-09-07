package analisis;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import clases.TablaTokens;
import clases.TablaErrores;

%%

// Código de usuario - Java 
%{
    public ArrayList<TablaTokens> ReporteTokens = new ArrayList<TablaTokens>();
    int contadorTokens = 1;
    public ArrayList<TablaErrores> ReporteErrores = new ArrayList<TablaErrores>();
%}

// Valores iniciales 
%init{
    yyline = 1;
    yycolumn = 1;
%init}

%cup
%class Scanner
%public
%line
%char

%state CADENA

// Símbolos
DOSP = ":"
CORI = "{"
CORD = "}"
FLECHA = "->"
PUNCOM = ";"
COMA = ","
PARI = "("
PARD = ")"

// Expresiones regulares para identificadores y otros tokens
ID = [a-zA-Z_][a-zA-Z_0-9]*
RANGO_MIN = [a-z]~[a-z]      // Rango de letras minúsculas a~z
RANGO_MAY = [A-Z]~[A-Z]      // Rango de letras mayúsculas A~Z
NUM = [0-9]+                 // Números
UNIVERSO = [!-~]+            // Rango para conjunto universo

// Palabras reservadas
TK_CONJ = "CONJ"
TK_OPERA = "OPERA"
TK_EVALUAR = "EVALUAR"

// Operadores
TK_UNION = "U"
TK_INTERSECCION = "&"
TK_DIFERENCIA = "-"
TK_COMPLEMENTO = "^"

%%

// Símbolos individuales
{DOSP} { 
    Symbol symbol = new Symbol(sym.DOSP, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "DOS PUNTOS", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{CORI} { 
    Symbol symbol = new Symbol(sym.CORI, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "LLAVE ABIERTA", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{CORD} { 
    Symbol symbol = new Symbol(sym.CORD, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "LLAVE CERRADA", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{FLECHA} { 
    Symbol symbol = new Symbol(sym.FLECHA, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "FLECHA", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{PUNCOM} { 
    Symbol symbol = new Symbol(sym.PUNCOM, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "PUNTO Y COMA", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{COMA} { 
    Symbol symbol = new Symbol(sym.COMA, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "COMA", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{PARI} { 
    Symbol symbol = new Symbol(sym.PARI, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "PARÉNTESIS ABIERTO", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{PARD} { 
    Symbol symbol = new Symbol(sym.PARD, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "PARÉNTESIS CERRADO", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

// Palabras reservadas
{TK_CONJ} { 
    Symbol symbol = new Symbol(sym.TK_CONJ, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "PALABRA RESERVADA CONJ", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{TK_OPERA} { 
    Symbol symbol = new Symbol(sym.TK_OPERA, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "PALABRA RESERVADA OPERA", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{TK_EVALUAR} { 
    Symbol symbol = new Symbol(sym.TK_EVALUAR, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "PALABRA RESERVADA EVALUAR", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

// Operadores
{TK_UNION} { 
    Symbol symbol = new Symbol(sym.TK_UNION, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "OPERADOR UNIÓN", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{TK_INTERSECCION} { 
    Symbol symbol = new Symbol(sym.TK_INTERSECCION, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "OPERADOR INTERSECCIÓN", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{TK_DIFERENCIA} { 
    Symbol symbol = new Symbol(sym.TK_DIFERENCIA, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "OPERADOR DIFERENCIA", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{TK_COMPLEMENTO} { 
    Symbol symbol = new Symbol(sym.TK_COMPLEMENTO, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "OPERADOR COMPLEMENTO", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

// Identificadores, rangos y números
{ID} { 
    Symbol symbol = new Symbol(sym.ID, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "IDENTIFICADOR", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{RANGO_MIN} { 
    Symbol symbol = new Symbol(sym.RANGO_MIN, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "RANGO MINÚSCULAS", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{RANGO_MAY} { 
    Symbol symbol = new Symbol(sym.RANGO_MAY, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "RANGO MAYÚSCULAS", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{NUM} { 
    Symbol symbol = new Symbol(sym.NUM, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "NÚMERO", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}

{UNIVERSO} { 
    Symbol symbol = new Symbol(sym.UNIVERSO, yyline, yycolumn, yytext());
    System.out.println("Token Reconocido: " + symbol.value);
    ReporteTokens.add(new TablaTokens(contadorTokens, yytext(), "CONJUNTO UNIVERSO", yyline, yycolumn));
    contadorTokens++;
    return symbol; 
}
