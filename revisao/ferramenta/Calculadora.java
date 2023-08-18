package revisao.ferramenta;

public class Calculadora {

    public int a;
    public int b;
    public String operador;

    public int operar(){
        if(this.operador == "+"){
            return this.a + this.b;
        }

        if(this.operador == "-"){
            return this.a - this.b;
        }

        if(this.operador == "/"){
            return this.a / this.b;
        }

        if(this.operador == "*"){
            return this.a * this.b;
        }
        return 0;
    }
    
    }