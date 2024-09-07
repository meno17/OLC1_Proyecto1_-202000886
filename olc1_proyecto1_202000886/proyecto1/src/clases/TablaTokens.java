
package clases;

class TablaTokens {
    
    private int numero;
    private Object lexema;
    private String tipo;
    private int linea;
    private int columna;
    
    //Constructur de la clase TablaTokens{}

    public TablaTokens(int numero, Object lexema, String tipo, int linea, int columna) {
        this.numero = numero;
        this.lexema = lexema;
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
    }

    public int getNumero() {
        return numero;
    }

    public Object getLexema() {
        return lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLexema(Object lexema) {
        this.lexema = lexema;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
    
}
