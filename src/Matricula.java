public class Matricula {
    private int numeroDaMateria;

    public Matricula(int numeroDaMateria) {
        this.numeroDaMateria = numeroDaMateria;
    }

    public int getNumeroDaMateria() {
        return numeroDaMateria;
    }

    public void setNumeroDaMateria(int numeroDaMateria) {
        this.numeroDaMateria = numeroDaMateria;
    }

    @Override
    public String toString() {
        return "Matricula [numeroDaMateria=" + numeroDaMateria + ", getNumeroDaMateria()=" + getNumeroDaMateria()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    

    
}
